package com.rchat.chat;

import com.rchat.chat.entity.ChatRoom;
import com.rchat.chat.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Random;

@Component
public class StartChat implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        ChatRoom chatRoom = new ChatRoom();

        while (true) {
            User user = new User(chatRoom, generateRandomName());
            chatRoom.add(user);

            Thread.sleep(5000);
        }
    }

    private String generateRandomName() {
        byte[] array = new byte[3];
        new Random().nextBytes(array);
        return new String(array, Charset.defaultCharset());
    }
}
