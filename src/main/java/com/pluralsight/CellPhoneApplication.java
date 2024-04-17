package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner mouse = new Scanner(System.in);
        System.out.println("Welcome to the Cellphone App!");


                CellPhone phone = new CellPhone();
        System.out.print("What is the Serial Number? ");
        int serialNumber = mouse.nextInt();
        phone.setserialNumber(serialNumber);
        mouse.nextLine();

        System.out.print("What Model is the Phone? ");
        String model = mouse.nextLine();
        phone.setmodel(model);

        System.out.print("Who is the Carrier? ");
        String carrier = mouse.nextLine();
        phone.setcarrier(carrier);

        System.out.print("What is the Phone Number? ");
        String phoneNumber = mouse.nextLine();
        phone.setphoneNumber(phoneNumber);

        System.out.print("Who owns the Phone? ");
        String owner = mouse.nextLine();
        phone.setowner(owner);

        System.out.println("\n" + "Phone Information" + "\n" + "Serial Number: " + phone.getserialNumber());
        
        System.out.println("Model: " + phone.getmodel());
        System.out.println("Carrier: " + phone.getcarrier());
        System.out.println("Phone Number: " + phone.getphoneNumber());
        System.out.println("Owner: " + phone.getowner());
    }


}
