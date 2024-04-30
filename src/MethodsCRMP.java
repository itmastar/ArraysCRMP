import java.util.Scanner;

public class MethodsCRMP {
    public static void main(String[] args) {
//        int num1=10;
//        int num2=20;
//        int sum=num1+num2;
//        System.out.println("Sum of "+num1+" and "+ num2 +" is "+sum);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second  number : ");
        int secondNumber=scanner.nextInt();
        int answer=add(firstNumber,secondNumber);
        System.out.println("Sum of : "+firstNumber+ " and  "+secondNumber +" is "+answer);
    }

    private static int add(int num1, int num2) {
        return num1+num2;
    }
}
