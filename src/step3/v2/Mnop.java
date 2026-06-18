package step3.v2;

public class Mnop {

    private String mo(String mn1) {
        try {
            if (!("0".equals(mn1) || "1".equals(mn1) || "2".equals(mn1))) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            System.out.println("프로그램을 종료합니다.");
        }
        return mn1;
    }

    public String getDpdhl(String mn1) {
        return mo(mn1);

    }


}
