 
import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int count=0;
         String str1="listen";
         String str2="silent";
         char cArray1[] = str1.toCharArray();
         char cArray2[] = str2.toCharArray();
         Arrays.sort(cArray1);
         Arrays.sort(cArray2);
         for(int i=0;i<cArray1.length;i++){
            
        
            if(cArray1[i]==cArray2[i]){
           
          count++;
         }
      
        }    
        if(count==cArray1.length){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
