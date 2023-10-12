import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        System.out.println("두 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("두 수의 최대공약수는 " + gdc(m, n) + "입니다.");
    }

    static int gdc(int m, int n){
        if(m<n){
            int temp = m;
            m=n;
            n=temp;
        }


        while(n!=0){
            if(m==0) {
                break;
            }
            int r=m%n;
            m=n;
            n=r;
        }

        return m;
    }
}
