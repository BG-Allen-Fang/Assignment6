package com.company.Task2;


public class PostalOffice {
    public PostManager postal;

    public PostalOffice(){
        this.postal = new PostManager("Paper", "Magazine");
    }

    public void newPaper(){
        postal.notify("Paper");
    }

    public void newMagazine(){
        postal.notify("Magazine");
    }

}