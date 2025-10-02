import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i< count; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int min = arr[0], max = arr[0];
        for(int number : arr) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        System.out.printf("최대값: %d \n", max);
        System.out.printf("최소값: %d \n", min);
    }
}
