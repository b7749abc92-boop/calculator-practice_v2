package step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        char a;
        int n2;
        String exit;
        while (true) {
            do {
                System.out.println("첫 번째 숫자를 입력해주세요:");
                if (!sc.hasNextInt()) {
                    System.out.println("숫자 정수만 입력 가능합니다.");
                    sc.next();
                    continue;
                }
                n1 = sc.nextInt();
                if (n1 < 0) {
                    System.out.println("음수는 입력이 불가합니다.");
                    continue;
                }

                System.out.println("연산자(+-*/)를 입력해주세요:");
                a = sc.next().charAt(0);
                if (!(a == '+' || a == '-' || a == '*' || a == '/')) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                System.out.println("두 번째 숫자를 입력해주세요:");
                if (!sc.hasNextInt()) {
                    System.out.println("숫자 정수만 입력 가능합니다.");
                    sc.next();
                    continue;
                }
                n2 = sc.nextInt();
                if (n2 < 0) {
                    System.out.println("음수는 입력이 불가합니다.");
                    continue;
                }
                if (a == '/' && n2 == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                    continue;
                }
                break;
                // 입력부분에서 문자, 문자열, 숫자를 받게 되었을때 잘못된 문자가 입력되면 처음으로 돌아간다
                // 잘못된 문자를 입력 받고 "숫자만 입력 가능합니다." 문구를 띄우고 버려지고 건너뛴다


            } while (true);

            double s = 0;


            switch (a) {
                case '+'-> s = n1 + n2;
                case '-'-> s = n1 - n2;
                case '*'-> s = n1 * n2;
                case '/'-> s = (double) n1 / n2;
            }

                System.out.println("계산 결과: " + n1 + a + n2 + " = " + s);


            System.out.println("종료를 원하시면 'exit', 계속 하신다면 아무 글자를 입력해주세요.");
            exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("종료합니다");
                break;
            }


        }

    }
}
