package hotelbookingsystem;

import java.util.Scanner;

public class Hotelbookingsystem {

    static int nights = 0;
    static String room = "";
    static String board = "";
    static double single = 50.00;
    static double Double = 75.00;
    static double family = 105.00;
    static double selfCatering = 0.00;
    static double halfBoard = 10.00;
    static double fullBoard = 20.00;
    static double totalPriceOfRoom = 0.00;
    static double totalPriceOfBoard = 0.00;
    static double pricePerNightR = 0.00;
    static double pricePerNightB = 0.00;
    static double total = 0.00;
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Mayflower hotel booking site.");
        System.out.println("The prices are as follows: \n single = £" +single+ "\n double = £" +Double+ "\n family of four = £" +family+ "\n self-catering = +£" +selfCatering+ "\n half-board = +£" +halfBoard+ "\n full board = +£" + fullBoard);
        System.out.println("Please note that all prices are per night. \n This hotel does 20% off per night for every night more than 7 nights.");
        getInput();
        priceOfRoom();
        priceOfBoard();
        total();
        System.out.println("Your price without discount is £" + total);
        discount();
        System.out.println("Your price with discount is £" + total);
    }
    
    public static void getInput(){
        Scanner scan = new Scanner (System.in);
        System.out.println("What type of room would you like?");
        room = scan.next();
        System.out.println("How many nights would you like to stay at the hotel?");
        nights = scan.nextInt();
        System.out.println("What board would you like to stay?");
        board = scan.next();
    }
    
    public static void priceOfRoom(){
        if(room.equals("single")){
            pricePerNightR = single;
        }
        else if(room.equals("double")){
            pricePerNightR = Double;
        }
        else{
            pricePerNightR = family;
        }
        totalPriceOfRoom = pricePerNightR*nights;
    }
    
    public static void priceOfBoard(){
        if(board.equals("self-catering")){
            pricePerNightB = selfCatering;
        }
        else if(board.equals("half-board")){
            pricePerNightB = halfBoard;
        }
        else{
            pricePerNightB = fullBoard;
        }
        totalPriceOfBoard = pricePerNightB*nights;
    }
    
    public static void total(){
        total = totalPriceOfRoom + totalPriceOfBoard;
    }
    
    public static void discount(){
        if(nights>7){
            int nights2 = nights - 7;
            double nightprice = pricePerNightR + pricePerNightB;
            double nightPrice = nightprice*0.2;
            double totalDiscount = nights2*nightPrice;
            total = total - totalDiscount;
        }
    }
}
