import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("The SImple intrest of the following solution");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal value:");

        int principal = sc.nextInt();
        System.out.println("Write the principal value:" + principal);
        
        System.out.println("Enter the rate value:");
        float rate = sc.nextFloat();
        System.out.println("write the rate value: " + rate);


        System.out.println("Write the time value:");
        int time = sc.nextInt();
        System.out.println("write the time value :" + time);

        float simpleI = principal * rate * time;
        System.out.println("the value of simple intrest is: " + simpleI);


    }
    
}
