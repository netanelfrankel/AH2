public class Solution {

    public static boolean isPrime(int num){
        if (num % 2 == 0 && num !=2 || num < 2) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num);  i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
