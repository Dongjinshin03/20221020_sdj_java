import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        final int MAX = 3;

        String names[] = new String[MAX];
        String major[] = new String[MAX];
        String phone[] = new String[MAX];
        String sNumber[] = new String[MAX];


        Scanner scan = new Scanner(System.in);

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        //먼저 처리할 메뉴 : 종료

        for (int i = 0; i < MAX; i++) {

            sNumber[i] = scan.next();

            names[i] = scan.next();

            major[i] = scan.next();

            phone[i] = scan.next();


        }
        System.out.println();
        for (int i = 0; i < MAX; i++) {
            System.out.print(i + 1 + "번째 학생" + " " + sNumber[i] + " " + names[i] + " " + major[i] + " " + convertTelNo(phone[i]) + "\n");
        }

    }

    public static String convertTelNo(String src) {

        String mobTelNo = src;

        if (mobTelNo != null) {
            // 일단 기존 - 전부 제거
            mobTelNo = mobTelNo.replaceAll(Pattern.quote("-"), "");

            if (mobTelNo.length() == 11) {
                // 010-1234-1234
                mobTelNo = mobTelNo.substring(0, 3) + "-" + mobTelNo.substring(3, 7) + "-" + mobTelNo.substring(7);

            } else if (mobTelNo.length() == 8) {
                // 1588-1234
                mobTelNo = mobTelNo.substring(0, 4) + "-" + mobTelNo.substring(4);
            } else {
                if (mobTelNo.startsWith("02")) { // 서울은 02-123-1234
                    mobTelNo = mobTelNo.substring(0, 2) + "-" + mobTelNo.substring(2, 5) + "-" + mobTelNo.substring(5);
                } else { // 그외는 012-123-1345
                    mobTelNo = mobTelNo.substring(0, 3) + "-" + mobTelNo.substring(3, 6) + "-" + mobTelNo.substring(6);
                }
            }

        }

        return mobTelNo;
    }
}


