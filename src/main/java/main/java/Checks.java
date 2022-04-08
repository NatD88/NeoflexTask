package main.java;

public class Checks {

    public static boolean isInt(String str) {

        if (str == null || str.equals("")) {
            return false;
        }
        if (str.length() > 10) {
            return false;
        }
        if (str.length() == 10 &&
                (str.charAt(9) == 8 || str.charAt(9) == 9)) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBinary(String str) {
        if (str == null || str.equals("")) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!(c == '0') && !(c == '1')) {
                return false;
            }
        }
        return true;
    }


}
