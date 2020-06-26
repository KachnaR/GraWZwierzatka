package com.zwierzatka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] Zwierzatka = {"Słoń", "Krowa", "Koala", "Flaming", "Żaba", "Kurczak", "Orangutan", "Jeż", "Antylopa",
                "Kaczka", "Tygrys", "Mrówka", "Pingwin", "Pies", "Kot", "Iguana", "Wąż", "Żyrafa",
                "Hipopotam", "Chomik"};
        int LosoweZwierzatko = (int)(Math.random() * Zwierzatka.length);
        String ZwierzeSekretne = Zwierzatka[LosoweZwierzatko] ;
        String ZwierzeUzytkownika = "";
        System.out.println("Zgadnij o jakim zwierzęciu myślę?");
        for (int i=0; i<5; i=i+1){
            System.out.print("Wpisz tu: ");
            Scanner r = new Scanner(System.in);
            ZwierzeUzytkownika = r.nextLine();
            if (ZwierzeSekretne.toLowerCase().equals(ZwierzeUzytkownika.toLowerCase())) {
                System.out.println("zgadłeś!");
                break;
            } else {
                if (i == 4){
                    System.out.println("Nie, myślę o "+ ZwierzeSekretne);
                } else{
                    System.out.println("Nie, próbuj dalej");
                    if (i == 1){
                        System.out.println("Podpowiedź, pierwsza litera to: " + ZwierzeSekretne.charAt(0));
                    }
                }
            }
        }
    }
}
