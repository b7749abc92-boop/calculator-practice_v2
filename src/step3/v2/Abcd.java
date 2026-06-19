package step3.v2;

import java.util.List;
import java.util.Scanner;

public class Abcd {
    public  static void main(String[] args) {
        Efgh e = new Efgh();
        Mnop m = new Mnop();
        Qrst q = new Qrst();
        Uvwx u = new Uvwx();
        Scanner sc2 = new Scanner(System.in);

        while (true) {
            System.out.println("[메뉴] 원하시는 메뉴를 선택해주세요.");
            System.out.println("1.계산기.");
            System.out.println("2.계산 기록 조회.");
            System.out.println("0. 프로그램 종료.");
            String mn = sc2.next();

            String mn2 = m.getDpdhl(mn);
            if (!("0".equals(mn2) || "1".equals(mn2) || "2".equals(mn2))) {
                break;
            } else if ("1".equals(mn)) {
                System.out.println("계산기 실행합니다.");
                while (true) {
                    System.out.println("첫 번째 숫자를 입력해주세요: ");
                    String nB1A = sc2.next();
                    Number nB1B = q.getDpdhl1(nB1A);

                    System.out.println("연산자(+-*/)를 입력해주세요");
                    char aB = sc2.next().charAt(0);
                    Ijkl ij = Ijkl.kl(aB);
                    if (ij == null) {
                        break;
                    }

                    System.out.println("두 번째 숫자를 입력해주세요: ");
                    String nB2A = sc2.next();
                    Number nB2B = q.getDpdhl2(nB2A);


                    Number eB = e.getrat(nB1B, ij, nB2B);

                    System.out.println("계산 결과: " + nB1B + ij + nB2B + " = " + eB);

                    List<Double> gH = e.getgh();
                    System.out.println("계산기록: " + gH);
                    System.out.println("종료를 원하시면 'exit'");
                    System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
                    System.out.println("오래된 계산 기록을 지우고 싶으시면 'y'를 입력해주세요");
                    System.out.println("계산을 계속 하신다면 'y','r' 이외에 아무 글자를 입력해주세요.");
                    String exityr;
                    boolean Menuturn = false;
                    do {
                        exityr = sc2.next();
                        if (exityr.equals("y")) {
                            if (!gH.isEmpty()) {
                                e.remv();
                                System.out.println("삭제되었습니다");
                                System.out.println("계산기록: " + gH);
                                System.out.println("종료를 원하시면 'exit'");
                                System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
                                System.out.println("오래된 계산 기록을 지우고 싶으시면 'y'를 입력해주세요");
                                System.out.println("계산을 계속 하신다면 'y','r' 이외에 아무 글자를 입력해주세요.");

                            } else {
                                System.out.println("기록이 없습니다.");
                                System.out.println("계산기록: " + gH);
                                System.out.println("종료를 원하시면 'exit'");
                                System.out.println("메뉴로 돌아가고 싶으시면 'r'를 입력해주세요");
                                System.out.println("계산을 계속 하신다면 'y','r' 이외에 아무 글자를 입력해주세요.");
                            }
                        }
                        if (exityr.equals("r")) {
                            Menuturn = true;
                        }
                        if ("exit".equals(exityr)) {
                            System.out.println("프로그램을 종료합니다.");
                            sc2.close();
                            System.exit(0);
                        }
                    } while ("y".equals(exityr));
                    if (Menuturn) {
                        break;
                    }
                }

            } else if ("2".equals(mn)) {
                u.getUw(sc2, e);
            } if ("0".equals(mn)) {
                System.out.println("프로그램을 종료합니다");
                sc2.close();
                System.exit(0);
            }

        }

    }
}
