package org.lessons.java.shop;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Prodotto> cart = new ArrayList<>();
        boolean isRunning = true;
        System.out.println("Welcome to XHZ Store!");

        while(isRunning){
            System.out.printf("Please choose the product you want. %n1. Smartphone%n2. Tv%n3. Headphones %n");
            int choice = input.nextInt();

            System.out.printf("insert the codex: ");
            int codex = input.nextInt();
            System.out.printf("insert name: ");
            input.nextLine();  //clean the buffer
            String name = input.nextLine();
            System.out.printf("insert brand: ");
            String brand = input.nextLine();
            System.out.printf("insert price: ");
            BigDecimal price = input.nextBigDecimal();
            System.out.printf("insert tax: ");
            BigDecimal tax = input.nextBigDecimal();

            switch(choice){
                case 1: 
                    System.out.printf("insert imei: ");
                    int imei = input.nextInt();
                    System.out.printf("insert rom: ");
                    int rom = input.nextInt();
                    cart.add(new Smartphone(codex, name, brand, price, tax, imei, rom));
                    break;
                case 2: 
                    System.out.printf("insert height: ");
                    int height = input.nextInt();
                    System.out.printf("insert width: ");
                    int width = input.nextInt();
                    System.out.printf("insert isSmart?(true/false): ");
                    boolean isSmart = input.nextBoolean();
                    cart.add(new Televisore(codex, name, brand, price, tax, height, width, isSmart));
                    break;
                case 3:
                    System.out.printf("insert color: ");
                    input.nextLine();
                    String color = input.nextLine();
                    System.out.printf("insert isWireless?(true/false): ");
                    boolean isWireless = input.nextBoolean();
                    cart.add(new Cuffie(codex, name, brand, price, tax, color, isWireless));
                    break;
                default: 
                    System.out.println("Input not valid.");
                    break;
            }
            System.out.printf("Do you want add another product?(y/n): ");
            input.nextLine();
            String choicecontinue = input.nextLine();
            choicecontinue = choicecontinue.replaceAll("\\s+", "");
            if(choicecontinue.equalsIgnoreCase("n") || choicecontinue.equalsIgnoreCase("N")){
                isRunning = false;
            }
        }
        System.out.println("#### YOUR CART ####");
        for (Prodotto prodotto : cart) {
            System.out.println(prodotto.toString());  //.toString() already running even without declaring it
        }
        input.close();
        System.out.println("Go to the checkout ->");
    }
}
