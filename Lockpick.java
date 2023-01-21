import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Lockpick {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
       help();
        while(true){
            System.out.print("What would you like to do? ");
            String input = scanner.nextLine();
            if(input.equals("lp")){
                pickLock();
                playAgain();
            }else if(input.equals("htp")){
                howToPlay();
            }else if(input.equals("quit")){
                if (quit()){
                    break;
                }
                
            }else if(input.equals("help")){
                help();
            }else{
                System.out.println("Please enter a valid command");
                continue;
            }
        }

        scanner.close();
    }

    private static void help(){
        System.out.println("Lockpicking Simulator");
        System.out.println("lp - Starts lockpick simulation");
        System.out.println("htp - Teaches you how to play the simulation");
        System.out.println("quit - quits the simulation and then program");
        System.out.println("help - brings this prompt back up");
    }

    private static void pickLock(){
        System.out.print("How many pins do you want the lock be? ");
        int numOfPins = scanner.nextInt();
        Lock lock = new Lock(numOfPins);
        while(!(lock.Unlocked())){
            lock.printLock();
            System.out.print("Enter a pin number or enter 'quit'... ");
            String input = scanner.nextLine();
            if(input.equals("quit")){
                if(quit()){
                    break;
                }
            }
        }
    }

    private static void howToPlay(){
        System.out.println("How to Play");
        System.out.println("Locks consist of multiple pins that must be pushed up in to unlock the lock");
        System.out.println("The pins must be set in a specific and randomized order");
        System.out.println("You can choose an index to test the pin of that index");
        System.out.println("Once all pins have been set the lock has now been opened");
    }

    private static boolean quit(){
        while(true){
            System.out.print("Do you want to quit? (y/n) ");
            String input = scanner.nextLine();
            if (input.toUpperCase().equals("Y")){
                return true;            
            }else if(input.toUpperCase().equals("N")){
                return false;
            }else{
                System.out.println("Please enter a valid command...");
            }
        }
        
    }

    private static void playAgain(){

    }
}
