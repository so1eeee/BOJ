package Doit.DataStructure;

import java.util.Scanner;


//배열, 리스트
public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        String s = sc.nextLine();
        for (char c : s.toCharArray()) {
            sum += (c - '0');
        }
        System.out.println(sum);
    }
}
