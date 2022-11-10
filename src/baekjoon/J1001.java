package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class J1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a - b);
    }
    /*public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a,b;

        a = Integer.parseInt(bf.readLine());
        b = Integer.parseInt(bf.readLine());

        System.out.println(a - b);*/
    // 백준에서 자꾸 런타임 에러가 떠서 Scanner로 진행

    }

