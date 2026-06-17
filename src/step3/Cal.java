package step3;

import java.util.ArrayList;

public class Cal {

    private final ArrayList<Double> rl = new ArrayList<>();

    private double cap(int n1, char a, int n2) {

        double s = 0;
        Em em = Em.fC(a);

        switch (em) {
            case ad -> s = n1 + n2;
            case su -> s = n1 - n2;
            case mu -> s = n1 * n2;
            case di -> {
                s = (double) n1 / n2;
                if (s == '/' && n2 == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");

            }
            }
        }
        rl.add(s);
        return s;
    }
    public  double getcap(int n1, char a, int n2) {
        return cap(n1, a, n2);
    }

    public ArrayList<Double> getrlq() {
        return rl;
    }

    public void removeq() {
        rl.remove(0);


    }
}
