import java.util.Scanner;
public class palin{
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int original=x; 
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x/=10;
        }
        System.out.println(original==rev);
        sc.close();
        }
    }
