package study.basics;

import java.util.Scanner;

/**
 * 用 switch 根据输入的面试结果决定吃什么。
 */
public class SwitchDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("想吃什么：");
        String noodles = input.next();

        switch (noodles) {
            case "火鸡面"     -> System.out.println("吃火鸡面");
            case "武汉热干面" -> System.out.println("吃武汉热干面");
            default          -> System.out.println("吃方便面");
        }
    }
}