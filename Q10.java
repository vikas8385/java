public class Q10 {
    public static void main(String[] args) {
        String original = "Hello, World! Welcome to Python programming";
        String[] words = original.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i > 0) {
                reverse.append(" ");
            }
        }
        System.out.println(reverse);
    }
}
