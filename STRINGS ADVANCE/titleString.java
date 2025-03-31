public class titleString {
    public static String title(String s) {
        StringBuilder sb = new StringBuilder(s);
        // Convert the first character to uppercase if it's a lowercase letter
        if (Character.isLowerCase(sb.charAt(0))) {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }
        // Iterate through the rest of the characters
        for (int i = 1; i < sb.length(); i++) {
            // Check if the current character is a lowercase letter and preceded by a space
            if (sb.charAt(i - 1) == ' ' && Character.isLowerCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        System.out.println(title("Abhay verma ANKIT Is a student"));
    }
}
