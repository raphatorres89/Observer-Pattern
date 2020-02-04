package com.rchat.chat.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatRoom implements IObservable {

    private List<IObserver> users = new ArrayList<>();
    private String state;

    @Override
    public void add(IObserver iObserver) {
        state = String.format("User %s entered the chat", iObserver.getName());
        users.add(iObserver);
        update();
    }

    @Override
    public void remove(IObserver iObserver) {
        state = String.format("User %s left the chat", iObserver.getName());
        users.remove(iObserver);
        update();
    }

    @Override
    public void update() {
        users.forEach(iObserver -> iObserver.update());
    }

    public String getState() {
        return state;
    }
}
