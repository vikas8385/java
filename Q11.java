import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int digit_sum=0;
       int  count=0;
        while(n>0){
            digit_sum += n%10 ;
            n /=10;
        }
        while( digit_sum>0){
            count += digit_sum %10;
            digit_sum /=10;
        }
        System.out.println(count);



    }
}
