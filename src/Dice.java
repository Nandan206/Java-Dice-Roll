import java.util.*;
public class Dice {
    public static void main(String[] args){
        int numofdice;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        System.out.print("Enter number of dice to roll: ");
        numofdice = sc.nextInt();

        if(numofdice > 0){
            for(int i=0;i<numofdice;i++){
                int roll = rc.nextInt(6)+1;
                printdice(roll);
                System.out.println("You rolled: "+roll);
                total += roll;

            }
            System.out.println("Total: "+total);
        }
        else{
            System.out.println("Number of dice must be greater than 0");
        }
    }
    static void printdice(int roll){
        String dice1 = """
                       ---------
                       |       |
                       |   ●   |
                       |       |
                       ---------
                       """;
        String dice2 = """
                       ---------
                       |●      |
                       |       |
                       |      ●|
                       ---------
                       """;

        String dice3 = """
                       ---------
                       |●      |
                       |   ●   |
                       |      ●|
                       ---------
                       """;
        String dice4 = """
                       ---------
                       |●     ●|
                       |       |
                       |●     ●|
                       ---------
                       """;
        String dice5 = """
                       ---------
                       |●     ●|
                       |   ●   |
                       |●     ●|
                       ---------
                       """;
        String dice6 = """
                       ---------
                       |●     ●|
                       |●     ●|
                       |●     ●|
                       ---------
                       """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }

    }
}
