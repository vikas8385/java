import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n %i==0){
                count = count+i;

            }
        }
        if(count == n){
            System.out.println("number is prefect");
        }
        else {
            System.out.println("number is not perfect");
        }
    }
}
