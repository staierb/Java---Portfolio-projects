import java.util.Scanner;

public class DiceRollerMain {
    
  static void greeting() {
    System.out.println("TTRPG Dice Roller");
      System.out.println("Please select your Die:");
      System.out.println("4 --> D4\n6 --> D6/n8-->D8\n10 --> D10\n12 --> D12\n"
              + "20 --> D20\n100 --> D100\n");
  }
  
  static void diceRoll(int roll) {
   double randomNumber =  (Math.random() * (roll + 1)) + 1;
   int diceRoll = (int)randomNumber;
   System.out.println("You rolled a " + diceRoll + "\n\n");   
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    
    while (true){
    greeting();
    int x = Integer.valueOf(scan.nextLine());
    switch(x) {
        case 4:
            diceRoll(x);
            /*double randomNumber =  Math.random() * 5;
            int diceRoll = (int)randomNumber;
            System.out.println("You rolled a " + diceRoll);*/
            break;
            
        case 6:
            diceRoll(x);
            break;
        case 8:
            diceRoll(x);
            break;
        case 10:
            diceRoll(x);
            break;
        case 12:
            diceRoll(x);
            break;
        case 20:
            diceRoll(x);
            break;
        case 100:
            diceRoll(x);
            break;
        default:
            System.out.println("That is not an accepted value. Please try again.\n");
            break;
    }
    }}
}
