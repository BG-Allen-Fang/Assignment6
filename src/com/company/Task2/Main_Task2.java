package com.company.Task2;

public class Main_Task2 {
    public static void main(String[] args) {
        PostalOffice office = new PostalOffice();
        office.postal.subscribe("Paper", new EmailObserver("allenman47@gmail.com"));
        office.postal.subscribe("Paper", new EmailObserver("tollegnv@gmail.com"));
        office.postal.subscribe("Magazine", new EmailObserver("erabyceps@gmail.com"));

        office.newPaper();
        System.out.println("\n");

        office.newPaper();
        System.out.println("\n");

        office.newMagazine();
        System.out.println("\n");

    }
}
