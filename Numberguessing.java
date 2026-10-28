import java.util.Scanner;
public class Numberguessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess:");
        int Guess = sc.nextInt();
        int SecretNumber = 7;
        if(Guess == SecretNumber){
            System.out.println("Correct Guess!");
        }
        else{
            System.out.println("Wrong Guess!");
        }
    }
    
}
