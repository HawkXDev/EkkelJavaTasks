package operators;

public class BitwiseOperators {

    public static void main(String[] args) {
        int value1 = 0xAAAAAAAA;  // 10101010101010101010101010101010
        int value2 = 0x55555555;  // 01010101010101010101010101010101

        // Bitwise AND
        int andResult = value1 & value2;
        System.out.println("andResult = " + Integer.toBinaryString(andResult));

        // Bitwise OR
        int orResult = value1 | value2;
        System.out.println("orResult = " + Integer.toBinaryString(orResult));

        // Bitwise NOT
        int notResult1 = ~value1;
        System.out.println("notResult1 = " + Integer.toBinaryString(notResult1));

        int notResult2 = ~value2;
        System.out.println("notResult2 = " + Integer.toBinaryString(notResult2));

        // Bitwise left shift
        int leftShiftResult = value1 << 2;
        System.out.println("leftShiftResult = " + Integer.toBinaryString(leftShiftResult));

        // Bitwise right shift
        int rightShiftResult = value1 >> 2;
        System.out.println("rightShiftResult = " + Integer.toBinaryString(rightShiftResult));

        // Bitwise unsigned right shift
        int unsignedRightShiftResult = value1 >>> 2;
        System.out.println("unsignedRightShiftResult = " + Integer.toBinaryString(unsignedRightShiftResult));
    }

    /* Output:
        andResult = 0
        orResult = 11111111111111111111111111111111
        notResult1 = 1010101010101010101010101010101
        notResult2 = 10101010101010101010101010101010
        leftShiftResult = 10101010101010101010101010101000
        rightShiftResult = 11101010101010101010101010101010
        unsignedRightShiftResult = 101010101010101010101010101010
    */

}
