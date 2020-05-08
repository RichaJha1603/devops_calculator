package calculator;
import java.util.*;

/*public class App
{
    public static void main(String args[])
    {
        int flag=0,ch;
        double num1,num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Add");
            System.out.println("2) Sub");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                case 1:
                System.out.println("Addition");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1+num2);
                break;
                case 2:
                System.out.println("Subtraction");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1-num2);
                break;
                case 3:
                System.out.println("Multiplication");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1*num2);
                break;
                case 4:
                System.out.println("Division");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1/num2);
                break;
                default: System.out.println("Exiting program due to invalid input");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
}*/



public class App {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("------------Calculator--------------");


		while(true){
      int a,b;
      System.out.println("Enter two numbers");
      a = scan.nextInt();
      b = scan.nextInt();
			System.out.println("Press 1 to add");
			System.out.println("Press 2 to subtract");
			System.out.println("Press 3 to multiply");
			System.out.println("Press 4 to divide");

			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();
			switch(choice){
			case 1:
			add(a,b);
			break;
			case 2:
			sub(a,b);
			break;
			case 3:
			mul(a,b);
			break;
			case 4:
			div(a,b);
			break;
			case 9: System.out.println("Exiting calculator");
			System.exit(0);
			break;
			default: System.out.println("Incorrect choice!!");
			}
		}

	}

	public static int add(int a,int b){
		int sum = a+b;
		System.out.println("Result is "+sum);
		return sum;
	}

	public static int sub(int a,int b){
	      int c = a-b;
		  System.out.println("Result is "+(a-b));
		  return c;
	  }
	public static int mul(int a,int b){
		int c = a*b;	
		  System.out.println("Result is "+ (a*b));
		  return c;
		}

	  public static int div(int a,int b){
		    int c = a/b;
			  System.out.println("Result is "+ (a/b));
			  return c;
		  }

}

