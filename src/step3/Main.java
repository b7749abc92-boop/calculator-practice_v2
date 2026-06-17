package step3;

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



            double r = c.getcap(n1, a, n2);

            System.out.println("계산 결과: " + n1 + a + n2 + " = " + r);

            ArrayList<Double> fHr = c.getrlq();
            System.out.println("계산기록: " + fHr);

            System.out.println("종료를 원하시면 'exit', 오래된 계산 기록을 지우고 싶으시면 'y'를 입력해주세요");
            System.out.println("계산을 계속 하신다면 'y' 이외에 아무 글자를 입력해주세요.");
            String exity;
            do {
                exity = sc.next();
                if (exity.equals("y")) {
                    if (!fHr.isEmpty()) {
                        c.removeq();
                        System.out.println("삭제되었습니다");
                        System.out.println("계산기록: " + fHr);
                        System.out.println("종료를 원하시면 'exit', 오래된 계산 기록을 지우고 싶으시면 'y'를 입력해주세요");
                        System.out.println("계산을 계속 하신다면 'y' 이외에 아무 글자를 입력해주세요.");

                    } else {
                        System.out.println("기록이 없습니다.");
                        System.out.println("계산기록: " + fHr);
                        System.out.println("종료를 원하시면 'exit'");
                        System.out.println("계산을 계속 하신다면 'y' 이외에 아무 글자를 입력해주세요.");
                    }
                }
            } while ("y".equals(exity));

            if (exity.equals("exit")) {
                System.out.println("종료합니다");
                break;
            }
        }

    }
}
