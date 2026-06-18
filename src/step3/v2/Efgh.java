package step3.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Efgh {

    private final List<Double> gh =  new ArrayList<>();

    private <A extends Number, B extends Number> double rat(A nb1,Ijkl aB1 , B nb2) {
        double nb01 = nb1.doubleValue();
        double nb02 = nb2.doubleValue();
        try {
            if (aB1 == Ijkl.di2 && nb02 == 0) {
                System.out.println("0으로는 나눌 수 없습니다.");
                throw new RuntimeException();
            }

        }catch(Exception e) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
        double e = aB1.opr(nb01, nb02);

        gh.add(e);
        return e;
    }
    public  <A extends Number, B extends Number> double getrat(A nb01,Ijkl ij , B nb02) {
        return rat(nb01, ij, nb02);
    }


    public List<Double> getgh() {
        return gh;
    }
    public  void remv() {
        gh.remove(0);
    }

    public  List<Double> getup(Number up) {
        return gh.stream().filter(u-> u > up.doubleValue()).collect(Collectors.toList());
    }
    public  List<Double> getdown(Number down) {
        return gh.stream().filter(d-> d < down.doubleValue()).collect(Collectors.toList());
    }

}
