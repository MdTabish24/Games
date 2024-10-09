import java.util.*;
public class tabish {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int random = r.nextInt(101);
        System.out.println("Guess the correct number between 0 to 100 : ");
        int input = sc.nextInt();
        int counter = 0;
        while(input != random){
            counter++;
            System.out.println("Wrong Guess!");
            if(input < random){
                System.out.println("You guessed less than random!, guess Higher");
            } else{
                System.out.println("You guessed more than random!, guess lower");
            }
            input = sc.nextInt();
        }
        System.out.println("Congrats! you guessed correct number in "+counter+" atempts");
    }
}
