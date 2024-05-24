package com.babyBear.calculator2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sign = "";

        System.out.println("=============================");
        System.out.println("|| S2 아기곰 계산기입니다 S2  ||");
        System.out.println("=============================");
        System.out.println("* 원하는 기능의 이름을 입력하세요 *");
        while (true) {
            System.out.println("* 기능1. 더하기");
            System.out.println("* 기능2. 빼기");
            System.out.println("* 기능3. 곱하기");
            System.out.println("* 기능4. 나누기");
            System.out.print("'");
            System.out.print("종료");
            System.out.println("'를 입력하시면 계산기가 종료됩니다.");
            sign = sc.nextLine();
            if (sign.equals("종료")) {
                break;
            }
            if (sign.equals("더하기") || sign.equals("빼기") || sign.equals("곱하기") || sign.equals("나누기")) {
                switch (sign) {
                    case "더하기":
                        Bohyun.plus();
                        break;
                    case "빼기":
                        Yanghyeyeon.minus();
                        break;
                    case "곱하기":
                        KangJinYoung.multiple();
                        break;
                    case "나누기":
                        Seongmin.divide();
                        break;
                }
            } else {
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }
        System.err.println("계산기를 종료합니다.");
    }
}
