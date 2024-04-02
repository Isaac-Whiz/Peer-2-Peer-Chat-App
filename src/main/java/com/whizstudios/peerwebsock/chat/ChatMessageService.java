package com.whizstudios.peerwebsock.chat;

import com.whizstudios.peerwebsock.chatroom.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;
    private final ChatRoomService chatRoomService;

    public ChatMessage save(ChatMessage message) {
        var chatId = chatRoomService.getChatRoomId(
                message.getSenderId(),
                message.getRecipientId(),
                true
        ).orElseThrow();
        message.setChatId(chatId);
        chatMessageRepository.save(message);
        return message;
    }

    public List<ChatMessage> findChatMessages(String senderId, String recipientId) {
        var chatId = chatRoomService.getChatRoomId(senderId, recipientId, false);
        return chatId.map(chatMessageRepository::findByChatId).orElse(new ArrayList<>());
    }
}
