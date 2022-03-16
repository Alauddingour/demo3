package basiccommand;
import java.util.Scanner;
public class productdiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num1;
           int num2;
           Scanner s =new Scanner(System.in);
           System.out.println("enter first number");
           num1=s.nextInt();
           System.out.println("enter second number");
           num2=s.nextInt();
           if(num1>num2) {
        	   
        	   System.out.println("num1 is grater");
           }
        	   else {
        		System.out.println("num2 is greater");   
        		   
        	   }


}
