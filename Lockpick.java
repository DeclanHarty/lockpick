import java.util.Scanner;

public class Lockpick {
    Scanner scanner;
    public void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       help();
        while(true){
            System.out.println("What would you like to do? ");
            String input = scanner.nextLine();
            if(input == "lp"){
                pickLock();
                playAgain();
            }else if(input == "htp"){
                howToPlay();
            }else if(input == "quit"){
                if (quit()){
                    break;
                }
                
            }else if(input == "help"){
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

    private void pickLock(){
        System.out.print("How many pins do you want the lock be? ");
        int numOfPins = scanner.nextInt();
        Lock lock = new Lock(numOfPins);
        while(!lock.Unlocked()){
            break;
        }
    }

    private void howToPlay(){
        System.out.println("How to Play");
        System.out.println("Locks consist of multiple pins that must be pushed up in to unlock the lock");
        System.out.println("The pins must be set in a specific and randomized order");
        System.out.println("You can choose an index to test the pin of that index");
        System.out.println("Once all pins have been set the lock has now been opened");
    }

    private boolean quit(){
        if (true){
            return true;
        }else{
            return false;
        }
        
    }

    private void playAgain(){

    }
}
