package com.nexus;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int m = scanner.nextInt();

            if (n == 0 && k == 0 && m == 0) break;

            CasinoCircle casinoCircle = new CasinoCircle(n);
            casinoCircle.selectPairs(k, m);
        }
    }
}
