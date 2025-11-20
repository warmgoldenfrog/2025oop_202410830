import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Homework8 {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> users = new HashMap<String, String>();

    public static void main(String[] args) {
        initializeData();
        runLoginSystem();
    }
    private static void initializeData() {
        users.put("myId", "myPass");
        users.put("myId2", "myPass2");
        users.put("myId3", "myPass3");
    }
    private static void runLoginSystem() {
        while(true) {

            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = scanner.nextLine().trim();
            if (users.containsKey(id)) { //id가 있을 경우
                System.out.print("password : ");
                String pas = scanner.nextLine().trim();

                if (users.get(id).equals(pas)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break; //while 루프 탈출
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }

            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }
    }
}
/*
id와 비번이 일치할 때까지 반복 while
{
1. id를 입력받음
2. id가 users에 들어있는지 확인
2-1 없으면 존재x 다시 입력받음 : 처음으로 돌아감
3. 있을시에 password를 입력받음
users의 index>id, values>password 비교
3-1 두개가 일치하지 않으면 : 다시 입력받음
3-1 두개가 일치하면 : 프로그램 종료(break)
 */