package com.whizstudios.peerwebsock.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ChatNotification {
    private String chatId;
    private String senderId;
    private String recipientId;
    private String content;
}
