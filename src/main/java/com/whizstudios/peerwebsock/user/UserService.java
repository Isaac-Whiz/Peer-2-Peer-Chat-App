package com.whizstudios.peerwebsock.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.whizstudios.peerwebsock.user.Status.OFFLINE;
import static com.whizstudios.peerwebsock.user.Status.ONLINE;

@Service
@RequiredArgsConstructor
public class UserService {

    private final  UserRepository userRepository;

    public void saveUser(User user) {
        user.setStatus(ONLINE);
        userRepository.save(user);
    }

    public void disconnect(User user) {
        var disconnectedUser = userRepository.findById(user.getNickName())
                .orElse(null);
        if (disconnectedUser != null) {
            disconnectedUser.setStatus(OFFLINE);
            userRepository.save(disconnectedUser);
        }

    }

    public List<User> findConnectedUsers() {
        return userRepository.findAllByStatus(ONLINE);
    }

}
