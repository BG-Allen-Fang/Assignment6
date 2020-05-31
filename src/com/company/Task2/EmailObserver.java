package com.company.Task2;

public class EmailObserver implements Observer {
    private String email;

    public EmailObserver(String email){
        this.email = email;
    }

    @Override
    public void update(String pubtype){
        System.out.println("Dear " + email + " someone has add new " + pubtype);
    }
}
