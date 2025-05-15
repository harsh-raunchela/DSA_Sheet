package Day_7.MultiplyStrings;

import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger bign1 = new BigInteger(num1);
        BigInteger bign2 = new BigInteger(num2);

        BigInteger result = bign1.multiply(bign2);

        String resultStr = result.toString();

        return resultStr;
    }
}
