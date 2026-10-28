import java .util.Scanner;
    public class PatientEntry { 
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Patient name:");
            String PatientName=sc.nextLine();
            System.out.println("Enter blood group:");
            String bloodGroup=sc.nextLine();
            System.out.println("Enter Weight:");
            double weight=sc.nextDouble();
            System.out.println("patient registered!");
    }
    
}
