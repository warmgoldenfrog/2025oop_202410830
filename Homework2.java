import java.util.Scanner;

class Student {
    int id;
    String name;
    String major;
    long phone;   // 숫자로 저장

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 전화번호를 문자열로 변환해서 반환
    public String getPhone() {
        String phoneStr = Long.toString(phone);

        // 최소 8자리 맞추기 (예: 123456 → 00123456)
        while (phoneStr.length() < 8) {
            phoneStr = "0" + phoneStr;
        }

        return "010-" + phoneStr.substring(0, 4) + "-" + phoneStr.substring(4);
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    Student(int id, String name, String major, long phone) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.phone = phone;  // 숫자로 저장
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");

            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            String major = parts[2];
            long phoneLong = Long.parseLong(parts[3]);
            students[i] = new Student(id, name, major, phoneLong);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 학생: "
                    + students[i].getId() + " "
                    + students[i].getName() + " "
                    + students[i].getMajor() + " "
                    + students[i].getPhone());
        }
    }
}
