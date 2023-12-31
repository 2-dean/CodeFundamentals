package org.programmers.introdution.day17;

public class Q17_2 {

    /**
     *  문제 :n의 배수 고르기
     *  정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution(int n, int[] numlist) {

        int count = 0;
        for (int i = 0; i<numlist.length; i++) {
            if (numlist[i] % n != 0) {
                numlist[i] = 0;
            } else {
                count++;
            }
        }
        int[] newNumList = new int[count];

        int idx = 0;
        for (int i = 0; i< numlist.length; i++) {
            if (numlist[i] != 0) {
                newNumList[idx++] = numlist[i];
            }

        }

        return newNumList;
    }

    public static void main(String[] args) {
        System.out.println("result: " + solution(3, new  int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
    }

}
