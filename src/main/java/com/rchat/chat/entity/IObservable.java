package com.rchat.chat.entity;

public interface IObservable {

    void add(IObserver iObserver);
    void remove(IObserver iObserver);
    void update();

}
