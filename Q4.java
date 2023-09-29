import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("first number: ");
        int n1 = scanner.nextInt();
        System.out.print("last number number: ");
        int n2 = scanner.nextInt();
      int count=0;
        for(int i=n1;i<=n2;i++){
          if(i%2==1){
            count=count+i;
          }
        }
        System.out.println(count);

    }
}
