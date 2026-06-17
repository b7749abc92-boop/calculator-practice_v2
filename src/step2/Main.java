package step2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cal c = new Cal();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력해주세요:");
            if (!sc.hasNextInt()) {
                System.out.println("숫자만 입력 가능합니다.");
                sc.next();
                continue;
            }
            int n1 = sc.nextInt();
            if (n1 < 0) {
                System.out.println("음수는 입력이 불가합니다.");
                continue;
            }

            System.out.println("연산자(+-*/)를 입력해주세요:");
            char a = sc.next().charAt(0);
            if (!(a == '+' || a == '-' || a == '*' || a == '/')) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            System.out.println("두 번째 숫자를 입력해주세요:");
            if (!sc.hasNextInt()) {
                System.out.println("숫자만 입력 가능합니다.");
                sc.next();
                continue;
            }
            int n2 = sc.nextInt();
            if (n2 < 0) {
                System.out.println("음수는 입력이 불가합니다.");
                continue;
            }
            if (a == '/' && n2 == 0) {
                System.out.println("0으로는 나눌 수 없습니다.");
                continue;
            }

           double r = c.getca(n1, a, n2);

            System.out.println("계산 결과: " + n1 + a + n2 + " = " + r);

            ArrayList<Double> fHr = c.getrl();
            System.out.println("계산기록: " + fHr);

            System.out.print("종료를 원하시면 'exit', 오래된 계산 기록을 지우고 싶으시면 'y'를 입력해주세요" +
                    "\n계산을 계속 하신다면 아무 글자를 입력해주세요.");
            String y = sc.next();
            if (y.equals("y")) {
                c.remove();
                System.out.println("삭제되었습니다");
                System.out.println("계산기록: " + fHr);

            }
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("종료합니다");
                break;
            }
        }

    }
}
