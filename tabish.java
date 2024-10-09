// import java.util.*;
// public class tabish {
//     public static void main(String[] args) {
//         Random r = new Random();
//         Scanner sc = new Scanner(System.in);
//         int random = r.nextInt(101);
//         System.out.println("Guess the correct number between 0 to 100 : ");
//         int input = sc.nextInt();
//         int counter = 0;
//         while(input != random){
//             counter++;
//             System.out.println("Wrong Guess!");
//             if(input < random){
//                 System.out.println("You guessed less than random!, guess Higher");
//             } else{
//                 System.out.println("You guessed more than random!, guess lower");
//             }
//             input = sc.nextInt();
//         }
//         System.out.println("Congrats! you guessed correct number in "+counter+" atempts");
//     }
// }
import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Welcome to Rock,Paper,Scissor");
        String arr[] = {"R","P","S"};
        int random = r.nextInt(arr.length);
        String action = arr[random];
        System.out.println("Enter R for Rock, P for Paper, S for scissor!");
        String input = sc.next().toUpperCase();
        if((input.equals("R")&& action.equals("S")||
        input.equals("P")&& action.equals("R") ||
        input.equals("S")&& action.equals("P")
        )){
            System.out.println("you Win! computer selected: " + action);
        } else if(input.equals(action)){
            System.out.println("You both selected the same action!");
        } 
        else{
            System.out.println("Computer wins!!, computer selected: " + action);
        }
    }
}