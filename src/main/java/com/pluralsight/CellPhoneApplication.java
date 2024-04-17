package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner mouse = new Scanner(System.in);
        System.out.println("Welcome to the Cellphone App!");


                CellPhone phone = new CellPhone();
        System.out.print("What is the Serial Number? ");
        phone.setserialNumber(mouse.nextInt());
        mouse.nextLine();

        System.out.print("What Model is the Phone? ");
        phone.setmodel(mouse.nextLine());

        System.out.print("Who is the Carrier? ");
        phone.setcarrier(mouse.nextLine());

        System.out.print("What is the Phone Number? ");
        phone.setphoneNumber(mouse.nextLine());

        System.out.print("Who owns the Phone? ");
        phone.setowner(mouse.nextLine());

        display(phone);

        CellPhone phone2 = new CellPhone();
        phone2.setserialNumber(415272);
        phone2.setmodel("Iphone 8");
        phone2.setcarrier("Verizon");
        phone2.setphoneNumber("123-456-7891");
        phone2.setowner("Luna");

        phone.dial( phone2.getphoneNumber());

    }

    public static void display(CellPhone phone){
        System.out.println("Serial Number: " +
                phone.getserialNumber());

        System.out.println("Model: " + phone.getmodel());
        System.out.println("Carrier: " + phone.getcarrier());
        System.out.println("Phone Number: " + phone.getphoneNumber());
        System.out.println("Owner: " + phone.getowner());

    }




}
