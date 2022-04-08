package main.java;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите целое десятичное число в диапазоне  от 0 до 10000 для конвертации в шестнадцатиричную систему: ");
        String s = scanner.nextLine();


        while (!Checks.isInt(s) || Integer.parseInt(s) < 0 || Integer.parseInt(s) > 10000) {
            System.out.println("Некорректный ввод. " +
                    "Попробуйте еще раз. Ведите целое десятичное число в диапазоне  от 0 до 10000 для конвертации в шестнадцатиричную систему: ");
            s = scanner.nextLine();
        }

        int num = Integer.parseInt(s);
        System.out.printf("Десятичному числу %s соответствует шестнадцатирочное %s и двоичное %s", s, Conversions.toHex(num), Conversions.toBinary(num));
        System.out.println();

        System.out.println("Введите двоичное число (оно должно состоять из 0 и 1) для конвертации в десятичную систему: ");
        s = scanner.nextLine();

        while (!Checks.isBinary(s)) {
            System.out.println("Некорректный ввод. " +
                    "Попробуйте еще раз. Введите двоичное число (оно должно состоять из 0 и 1) для конвертации в десятичную систему: ");
            s = scanner.nextLine();
        }

        System.out.printf("Двоичному числу %s соответствует десятичное %d", s, Conversions.toDecimal(s));
        scanner.close();
    }
}
