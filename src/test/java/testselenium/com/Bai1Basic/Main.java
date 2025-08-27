package testselenium.com.Bai1Basic;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // cach 1
        List<String> list = Arrays.asList("apple", "banana", "orange");
        String result = String.join(", ", list);
        System.out.println("kết qua method 1: " + result);

        // cach 2: chưa hiểu
        StringBuilder sb = new StringBuilder();
        for (String item : list){
            if (sb.length() > 0)
                System.out.println("run line 1: " + sb.append(", "));
            System.out.println("run line 2: " + sb.append(item));
        }
        result = sb.toString();
    }
}
