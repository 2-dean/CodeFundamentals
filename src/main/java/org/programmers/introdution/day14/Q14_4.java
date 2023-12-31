package org.programmers.introdution.day14;

public class Q14_4 {

    /**
     *  문제 :대문자와 소문자
     *  문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한
     *  문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public static String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();

        for (char c : charArray) {
            if ('A' <= c && c <= 'Z') answer += Character.toLowerCase(c);

            if ('a' <= c && c <= 'z')  answer += Character.toUpperCase(c);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution("abCdEfghIJ"));
    }

}
