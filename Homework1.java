import java.util.Scanner;
class Homework1 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <=5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력하세요 : ");
            int n = sc.nextInt();
            total+= n;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다\n",total);
        }

    }
}
