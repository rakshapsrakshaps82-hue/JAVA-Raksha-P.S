import java.util.Scanner;
    public class OrderSystem {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter food item:");
            String foodItem = sc.nextLine();
            System.out.println("Enter quantity:");
            int quantity =sc.nextInt();
            System.out.println("Enter Delivery address:");
            sc.nextLine(); 
            String deliveryAddress = sc.nextLine();
            System.out.println("Order Placed!");
        }
    
}
