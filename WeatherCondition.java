import java.util.Scanner;
public class WeatherCondition {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Temperature:");
        int temp = sc.nextInt();
        if(temp >35){
            System.out.println("Very Hot");
        }
        else if(temp >25){
            System.out.println("Pleaseant Weather");
        }
        else if(temp >15){
            System.out.println("Cool Weather");
        }
        else{
            System.out.println("Very Cold");
        }
    }
    
}
