package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calp {

    private final List<Double> rl = new ArrayList<>();

    private <M extends Number, L extends Number> double Cap(M n1, Em op, L n2) {
        double n11 = n1.doubleValue();
        double n12 = n2.doubleValue();

        double s = op.ay(n11,  n12);


        rl.add(s);
        return s;
    }
    public <M extends Number, L extends Number>  double getCap(M n11, Em a, L n12) {
        return Cap(n11, a, n12);
    }

    public List<Double> getrlq() {
        return rl;
    }

    public void removeq() {
        rl.remove(0);

    }
    public List<Double> gatlamStr(double fkatm) {
        return rl.stream().filter(b -> b > fkatm).collect(Collectors.toList());
    }

}
