package main.java;

public class Conversions {

    public static StringBuilder toHex(int decimalNumber) {
        final String HEX = "0123456789abcdef";

        if (decimalNumber <= 0)
            return new StringBuilder("");
        StringBuilder str_res = new StringBuilder("");

        while (decimalNumber != 0) {
            int index = decimalNumber % 16;
            str_res.insert(0, HEX.charAt(index));
            decimalNumber /= 16;
        }
        return str_res;
    }

    public static StringBuilder toBinary(int decimalNumber) {

        if (decimalNumber <= 0)
            return new StringBuilder();
        else {
            StringBuilder res = new StringBuilder();
            while (decimalNumber != 0) {
                res.insert(0, decimalNumber % 2);
                decimalNumber = decimalNumber / 2;
            }
            return res;
        }
    }

    public static int toDecimal(String binaryNumber) {

        if (binaryNumber == null || binaryNumber.equals(""))
            return 0;
        else {
            int res = 0;
            String[] spl = binaryNumber.split("");

            for (int i = 0; i < binaryNumber.length(); i++) {
                int index = binaryNumber.length() - 1 - i;
                res = res + Integer.parseInt(spl[index]) * (int) Math.pow(2, i);
            }
            return res;
        }
    }

}
