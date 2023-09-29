import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        
    
    int lcm=0;
    Scanner sc =new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();   

    lcm=(n1*n2)/(n2-n1);
 
    System.out.print(lcm);
}
}
