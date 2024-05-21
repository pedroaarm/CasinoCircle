package com.nexus;

import java.util.ArrayList;
import java.util.List;

class CasinoCircle {

    private List<Gambler> gamblers;

    CasinoCircle(int n) {
        gamblers = new ArrayList<>(n);
        for (int i = 1; i <= n; i++)
            gamblers.add(new GamblerImpl(i));
    }

    public void selectPairs(int k, int m) {

        int ki = -1;
        int mi = gamblers.size();
        StringBuilder sbResult = new StringBuilder();
        while (!gamblers.isEmpty()) {
            ki = mod(ki + k, gamblers.size());
            mi = mod(mi - m, gamblers.size());

            if (sbResult.length() != 0)
                sbResult.append(",");

            if (ki == mi) {
                sbResult.append(String.format("%3d", gamblers.remove(ki--).getId()));
            } else if (ki > mi) {
                sbResult.append(String.format("%3d", gamblers.remove(ki).getId()));
                sbResult.append(String.format("%3d", gamblers.remove(mi).getId()));
                ki -= 2;
            } else {
                Gambler rem1 = gamblers.remove(mi--);
                Gambler rem2 = gamblers.remove(ki--);
                sbResult.append(String.format("%3d", rem2.getId()));
                sbResult.append(String.format("%3d", rem1.getId()));
            }
        }
        System.out.println(sbResult);
    }

    private int mod(int a, int b) {
        return ((a % b) + b) % b;
    }
}

