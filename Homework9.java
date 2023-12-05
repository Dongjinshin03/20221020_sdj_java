import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class IdPasswordex2{
    private static HashMap<String, String> IdPass= new HashMap<>();

    static{
        try{
            Scanner sc1 = new Scanner(new File("db.txt"));
            while (sc1.hasNext()) { // 파일에 데이터가 남았는지 확인
                String line = sc1.nextLine();
                String line2 = sc1.nextLine();
                IdPass.put(line, line2);
            }
            sc1.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }

    public static boolean isExist(String id) {
        return IdPass.containsKey(id);
    }

    public static boolean isMatch(String id, String password) {
        return IdPass.get(id).equals(password);
    }
}


public class Homework9 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("id와 password를 입력해주세요.\n");
            System.out.print("id: ");
            String id = sc.nextLine().trim();

            if (!IdPasswordex.isExist(id)){
                System.out.println("입력하신 id는 존재하지 않습니다.");
                continue;
            }

            System.out.print("password: ");
            String password= sc.nextLine().trim();

            if (IdPasswordex.isMatch(id, password)){
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else{
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
