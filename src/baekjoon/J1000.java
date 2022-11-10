package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class J1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a, b;

        a = Integer.parseInt(bf.readLine());
        b = Integer.parseInt(bf.readLine());

        System.out.println(a + b);
    }
}
// Scanner를 사용해도 되지만 BufferReader 가 효율성이 좋아 사용을 하였다.
