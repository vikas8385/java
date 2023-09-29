public class Q2 {

    public static void main(String[] args) {
        String str = "vikas964954jain";
        int digits = 0;
        int alpha = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                digits++;

            else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
                alpha++;
        }
        System.out.println("Total number of Digits = " + digits);
        System.out.println("Total number of alpha = " + alpha);
    }
}
