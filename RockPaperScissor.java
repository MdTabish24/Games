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
