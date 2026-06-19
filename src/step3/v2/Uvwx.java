package step3.v2;

import java.util.List;
import java.util.Scanner;

public class Uvwx {

    private void uw (Scanner sc2, Efgh e) {

        while (true) {
            List<Double> gH = e.getgh();
            if (!gH.isEmpty()) {
                System.out.println("==== 계산 기록 조회 ====");
                System.out.println("계산기록: " + gH);
                System.out.println("오래된 계산 기록을 지우고 싶으시면 'y'를 입력해주세요");
                System.out.println("특정 값을 기준으로 조회를 원하실 경우 'b'를 입력해주세요");
                System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
            } else {
                System.out.println("==== 계산 기록 조회 ====");
                System.out.println("기록이 없습니다.");
                System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
            }
            String Lt = sc2.next();
            if ("y".equals(Lt)) {
                if (!gH.isEmpty()) {
                    e.remv();
                    System.out.println("==== 계산 기록 조회 ====");
                    System.out.println("삭제되었습니다");
                    System.out.println("계산기록: " + gH);
                    System.out.println("특정 값을 기준으로 조회를 원하실 경우 'b'를 입력해주세요");
                    System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
                } else {
                    System.out.println("==== 계산 기록 조회 ====");
                    System.out.println("기록이 없습니다.");
                    System.out.println("계산기록: " + gH);
                    System.out.println("종료를 원하시면 'exit'");
                    System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
                    System.out.println("계산을 계속 하신다면 'y','r' 이외에 아무 글자를 입력해주세요.");
                }
            }
            if ("b".equals(Lt)) {
                System.out.println("기준 값 이상 조회 'u'");
                System.out.println("기준 값 이하 조회 'd'");
                String ud = sc2.next();

                if ("u".equals(ud)) {
                    System.out.println("기준 값을 입력해주세요: ");
                    Double up = sc2.nextDouble();
                    System.out.println("기준 값 이상의 기록: " + e.getup(up));
                    System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
                } else if ("d".equals(ud)) {
                    System.out.println("기준 값을 입력해주세요: ");
                    Double down = sc2.nextDouble();
                    System.out.println("기준 값 이하의 기록: " + e.getdown(down));
                    System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
                }
                String back = sc2.next();
                if ("r".equals(back)) {
                    break;
                }
            }

            if ("r".equals(Lt)) {
                break;
            }
            if ("exit".equals(Lt)) {
                System.out.println("프로그램을 종료합니다.");
                sc2.close();
                System.exit(0);
            }
        }

    }
    public void getUw(Scanner sc2, Efgh e){
        uw(sc2, e);

    }
}