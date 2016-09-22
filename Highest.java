import java.util.Scanner;


public class Highest {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Second Number");
		int num3=sc.nextInt();
		if((num1>num2)&&(num1>num3)){
			System.out.println("highest no is"+num1);
		}
			else if((num2>num1)&&(num2>num3)){
				System.out.println("highest no is"+num2);
		
		}
			else{
				System.out.println("highest no is"+num3);
			}
sc.close();

	}

}
