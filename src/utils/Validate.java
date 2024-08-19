/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

public class Validate {

    private static Scanner scanner = new Scanner(System.in);

    public Validate() {
    }

    public static int getInt(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("number out of range!");
            } catch (NumberFormatException e) {
                System.out.println("number invalid!");
            }
        }
    }

    public static String getString(String message, String messageError, final String REGEX) {
        while (true) {
            System.out.println(message);
            String str = scanner.nextLine();
            String str_trim = str.trim();
            if (str_trim.matches(REGEX)) {
                return str_trim;
            } else {
                System.out.println(messageError);
            }
        }
    }

    public static boolean verifyCaptcha(String message, String messageError, String captchaGenerate) {
        String captchaInput;
        while (true) {
            System.out.println(message);
            captchaInput = scanner.nextLine().trim();
            if (captchaGenerate.equals(captchaInput)) {
                break;
            }
            System.out.println(messageError);
        }
        return true;
    }
}
