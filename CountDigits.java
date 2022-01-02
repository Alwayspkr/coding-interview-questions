import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your number:: ");
        long number = scr.nextLong();
        int count = 0;
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println("number of digits::"+count);
    }
}
/* -output::
Enter your number::
54682465256545
number of digits::14*/