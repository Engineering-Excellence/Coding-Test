package kr.co.programmers.lv0;

import java.util.*;

// 사칙연산, 배열, 수학
public class Mathematics {

    // 나머지 구하기
    private int mod(int num1, int num2) {

        return num1 % num2;
    }

    // 중앙값 구하기
    private int median(int[] array) {

        Arrays.sort(array);
        return array[array.length / 2];
    }

    // 최빈값 구하기
    private int mode(int[] array) {

        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }

    // 짝수는 싫어요
    private int[] odd(int n) {

        int[] answer = new int[(n + 1) / 2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 2 * i + 1;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.: ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.: ");
        int num2 = scanner.nextInt();
        scanner.close();

        Mathematics mathematics = new Mathematics();
        System.out.printf("%d %% %d = %d%n", num1, num2, mathematics.mod(num1, num2));
        System.out.println(mathematics.median(new int[]{9, -1, 0}));
        System.out.println(mathematics.mode(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(mathematics.mode(new int[]{1, 2, 2, 1}));
        System.out.println(mathematics.mode(new int[]{1}));
        System.out.println(mathematics.mode(new int[]{1, 2, 3, 3, 3, 4, 5, 5, 5, 5}));
        System.out.println(Arrays.toString(mathematics.odd(10)));
        System.out.println(Arrays.toString(mathematics.odd(15)));
    }
}
