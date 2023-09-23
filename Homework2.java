import java.util.Scanner;
import java.util.regex.Pattern;
public class Homework2 {

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
    // ReviewService 클래스의 필드에 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);

    public void practice5() {
        // Student 객체 배열 stu5 선언 및 할당
        Student[] stu5 = new Student[3];

        for (int i = 0; i < stu5.length; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            int number = sc.nextInt();

            String name = sc.next();

            String major = sc.next();

            String mobTelNo= sc.next();

            stu5[i] = new Student(number, name, major, convertTelNo(mobTelNo));
        }

        // 학생 정보 출력
        for (int i = 0; i < stu5.length; i++)
            System.out.println(i + 1 + "번째 학생 : " + stu5[i]);
    }
}