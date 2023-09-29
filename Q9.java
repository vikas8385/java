//import java.util.*;
public class Q9{
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        
        int [] fr = new int [arr.length];  
        int n1 = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                     
                    fr[j] = n1;  
                }  
            }  
            if(fr[i] != n1)  
                fr[i] = count;  
        }
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != n1)  
                System.out.print( arr[i] + ":" + fr[i]+",");  
        }  
}
}
