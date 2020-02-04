package com.rchat.chat.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class User implements IObserver {

    private ChatRoom chatRoom;
    private String name;

    @Autowired
    public User(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(String.format("%s: %s", this.name, chatRoom.getState()));
    }

    @Override
    public String getName() {
        return name;
    }
}
