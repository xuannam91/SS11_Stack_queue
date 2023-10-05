package ra.bt02;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi dau vao");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Ko co cap dau ngoac");
                    return;
                }
                char openBracket = stack.pop();
                if (!isMatchingBracket(openBracket, ch)) {
                    System.out.println("ko co cap ngoac");
                }
            }
        }
        boolean check = stack.isEmpty();
        if (check){
            System.out.println("có các cặp ngoặc hợp lệ");
        }else System.out.println("không có cặp ngoặc");
    }

    private static boolean isMatchingBracket(char open, char close) {  // hàm kiểm tra cặp ngoặc trùng khớp
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
