import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Homework9 {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> users = new HashMap<String, String>();

    public static void main(String[] args) {
        initializeData();
        runLoginSystem();
    }
    private static void initializeData() {
        try {
            Scanner sc = new Scanner(new File("db.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    String id = parts[0].trim();
                    String pas = parts[1].trim();
                    users.put(id, pas);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            e.printStackTrace();
        }
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

/* db.txt 내용
myId, myPass
myId2, myPass2
myId3, myPass3
 */

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