public class binToDec {

    public static void binDec(int binNum) {
        int target = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            // the logic to get the last digit.
            int lastDigit = binNum % 10;
            decNum = decNum + (int) (lastDigit * Math.pow(2, pow));

            pow++;
            // now erase the last digit.
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + target + " = " + decNum);
    }

    public static void main(String[] args) {
        binDec(1000);
    }
}
