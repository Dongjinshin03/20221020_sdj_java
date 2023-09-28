import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            if(i==0)
                System.out.println("수를 입력하세요:");
            arr[i] = scanner.nextInt();
        }

        // 최대값 초기값 세팅
        int max = arr[0];

        // 최대값 구하기
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // 최대값 출력
        System.out.println("최대값: "+max);

        int min = arr[0];

        // 최소값 구하기
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        // 최소값 출력
        System.out.println("최솟값: "+min);
    }
}
