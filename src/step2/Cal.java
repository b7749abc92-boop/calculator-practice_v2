package step2;

import java.util.ArrayList;

public class Cal {

    private final ArrayList<Double> rl = new ArrayList<>();

    private double ca(int n1, char a, int n2) {

        double s = 0;

        switch (a) {
            case '+' -> s = n1 + n2;
            case '-' -> s = n1 - n2;
            case '*' -> s = n1 * n2;
            case '/' -> s = (double) n1 / n2;
        }
        rl.add(s);
        return s;
    }
    public  double getca(int n1, char a, int n2) {
        return ca(n1, a, n2);
    }

    public ArrayList<Double> getrl() {
        return rl;
    }

    public void remove() {
        if(!rl.isEmpty()) {
            rl.remove(0);
        }
    }
}
