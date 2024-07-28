package DataStructures;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringSimilarityChecker {

    public static boolean isUniqueChar(String text){
        // Assume all are ASCII Strings
        if (text.length()> 128) {
            return false;
        }

        boolean[] charIndexTracker = new boolean[128];

        for (int i = 0; i < text.length(); i++) {

            int intValueOfChar = text.charAt(i);
            if (charIndexTracker[intValueOfChar]) {
                return false;
            }

            charIndexTracker[intValueOfChar] = true;

        }
        return true;
    }


    public static boolean isUniqueChars(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println("int value: " +val+" of char:" + str.charAt(i));

            // binary for 33554439 = 10000000000000000000000111 and 33554432 = 10000000000000000000000000. so (checker & (1 << val)) = 10000000000000000000000000 = 33554432
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1<<val);
        }
        return true;
    }

    public static void main(String[] args) {


        int a = 12; // binary: 1100
        int b = 6;  // binary: 0110

        // Bitwise AND
        int andResult = a & b; // binary: 0100, decimal: 4
        System.out.println("a & b: " + andResult);

        // Bitwise OR
        int orResult = a | b; // binary: 1110, decimal: 14
        System.out.println("a | b: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // binary: 1010, decimal: 10
        System.out.println("a ^ b: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // binary: ...11110011 (in 32-bit system)
        System.out.println("Not a: " + notResult);

        // Left Shift
        int leftShiftResult = a << 2; // binary: 110000, decimal: 48
        System.out.println("a << 2: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 2; // binary: 0011, decimal: 3
        System.out.println("a >> 2: " + rightShiftResult);

        // Unsigned Right Shift
        int unsignedRightShiftResult = a >>> 2; // binary: 0011, decimal: 3
        System.out.println("a >>> 2: " + unsignedRightShiftResult);

        System.out.println("##############################################################");
//        System.out.println("IsUnique char in the list: " + isUniqueChar("abcd  "));
        System.out.println("IsUnique char in the list: " + isUniqueChars("azbcz"));
    }
}