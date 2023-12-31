package org.programmers.practice.lv1;

public class Q12947 {

    /**
     *  문제 :하샤드 수
     *
     *  양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
     *  예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
     *  자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
     *
     *  x는 1 이상, 10000 이하인 정수입니다.
     *
     */
    public static boolean solution(int x) {
        boolean answer = false;

        // 자릿 수의 합 구하기
        int num = x;
        int sum = 0;

        int length = (int) Math.log10(x) + 1;

        for (int i = 0; i < length ; i++) {
            sum += x % 10;
            x = x / 10;
        }


        if (num % sum == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }

}
