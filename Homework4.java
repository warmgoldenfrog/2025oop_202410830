// 키보드 입력을 받기 위해 Scanner 클래스를 가져옵니다.
import java.util.Scanner;

public class Homework4 {

    // 1. 재귀 호출을 이용한 최대공약수 계산 함수
    // 유클리드 호제법: gcd(a, b)는 gcd(b, a % b)와 같다.
    public static int gcdRecursive(int a, int b) {
        // n이 0이라면 m을 반환 (알고리즘 2번 단계) [cite: 898]
        if (b == 0) {
            return a;
        }
        // 재귀적으로 함수를 다시 호출합니다. (알고리즘 3번 단계) [cite: 899]
        return gcdRecursive(b, a % b);
    }

    // 2. 반복문을 이용한 최대공약수 계산 함수
    public static int gcdIterative(int a, int b) {
        // b가 0이 될 때까지 반복합니다.
        while (b != 0) {
            // b의 값을 임시 변수에 저장합니다.
            int temp = b;
            // b는 a를 b로 나눈 나머지가 됩니다.
            b = a % b;
            // a는 이전의 b값이 됩니다.
            a = temp;
        }
        // b가 0이 되면 a가 최대공약수입니다.
        return a;
    }

    public static void main(String[] args) {
        // 사용자 입력을 위한 Scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 두 수의 입력을 요청합니다.
        System.out.print("두 수를 입력하세요: "); // [cite: 906]

        // 입력받은 두 정수를 각각 변수에 저장합니다.
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 재귀 함수를 호출하여 최대공약수를 계산합니다.
        int result = gcdRecursive(num1, num2);

        // (참고) 반복문 함수로도 결과가 같은지 확인해 볼 수 있습니다.
        // int result = gcdIterative(num1, num2);

        // 최종 결과를 형식에 맞춰 출력합니다.
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result); // [cite: 907]
    }
}