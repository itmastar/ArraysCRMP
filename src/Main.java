import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[] numbers={1,3,5,6};
////        System.out.println(Arrays.toString(numbers));
////        System.out.println(numbers.length);
////        System.out.println(numbers[0]);
////        System.out.println(numbers[2]);
//        for(int i=0;i<numbers.length;i++){
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(numbers));

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the element at index :"+i);
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.println("Print the values in the array ");
//        for(int i=0;i<size;i++){
//            System.out.println("Element at index :"+i +" is "+arr[i]);
//        }
//
//Scanner s=new Scanner(System.in);
//        System.out.println("Enter the size of the character array ");
//        int size=s.nextInt();
//        char[] chars=new char[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the character at index : "+i);
//            chars[i]=s.next().charAt(0);
//        }
//        System.out.println("Printing the elements in character array ");
//        for(int i=0;i<size;i++){
//            System.out.println("Character at index :"+i+" is "+chars[i]);
//        }
Scanner scan=new Scanner(System.in);
        System.out.println("enter size of array");
int size=scan.nextInt();
        String[] cars=new String[size];
for(int i=0;i<size;i++){
    System.out.println("enter car brand");
    cars[i]=scan.next();

}
        System.out.println(Arrays.toString(cars));
    }
}