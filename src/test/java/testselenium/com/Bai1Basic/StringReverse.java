package testselenium.com.Bai1Basic;

public class StringReverse {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()){
            return str;
        }
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World";
        System.out.println(reverseString(input));
    }
}

