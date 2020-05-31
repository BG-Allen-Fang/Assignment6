package com.company.Task2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostManager {
    Map<String, List<Observer>> listeners = new HashMap<>();

    public PostManager(String ... types){
        for (String type: types){
            this.listeners.put(type, new ArrayList<>());
        }
    }

    public void subscribe(String pubType, Observer listener) {
        List<Observer> users = listeners.get(pubType);
        users.add(listener);
    }

    public void unsubscribe(String pubType, Observer listener) {
        List<Observer> users = listeners.get(pubType);
        users.remove(listener);
    }

    public void notify(String pubType) {
        List<Observer> users = listeners.get(pubType);
        for (Observer listener : users) {
            listener.update(pubType);
        }
    }
}
