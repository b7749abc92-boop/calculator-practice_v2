package step3.v2;

public class Qrst {

    private Number qs(String mn3) {
        try {
            Number nB1B = mn3.contains(".") ? Double.parseDouble(mn3) : Integer.parseInt(mn3);
             if (nB1B.doubleValue() < 0) {
                throw  new IllegalArgumentException();
            }
            return nB1B;
        } catch (Exception e) {
            System.out.println("음수 또는 잘못된 입력입니다.");
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
        return null;
    }
    public Number getDpdhl1(String nB1B) {
        return qs(nB1B);
    }

    private Number qs2(String mn4) {
        try {
            Number nB1C = mn4.contains(".") ? Double.parseDouble(mn4) : Integer.parseInt(mn4);
            if (nB1C.doubleValue() < 0) {
                throw  new IllegalArgumentException();
            }
            return nB1C;
        } catch (Exception e) {
            System.out.println("음수 또는 잘못된 입력입니다.");
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
        return null;
    }
    public Number getDpdhl2(String nB1C) {
        return qs2(nB1C);
    }

}
