import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the first number");
        long number1=scr.nextLong();
        System.out.println("Enter the second number");
        long number2=scr.nextLong();
        System.out.println("Enter the third number");
        long number3=scr.nextLong();


        if(number1>number2 && number1>number3)
            System.out.println(number1+" is the largest number");
        else if(number2>number1 && number2>number3)
            System.out.println(number2+" is the largest number ");
        else
            System.out.println(number3+" is the largest number");
    }
}
