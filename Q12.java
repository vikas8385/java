public class Q12 {
    public static void main(String[] args) {
        int n=9876;
        int count=0;
        while(n>0){
            count=n%10;
            System.out.print(count);
            n /=10;
        }

    }
}
