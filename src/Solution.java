public class Solution {

    public static boolean isPrime(int i){
        if(i % 2 == 0 && i > 2 || i < 2 ){
            return false;
        }
        else if (i % 3 == 0 && i > 3 || i % 5 == 0 & i > 5 || i % 7 == 0 && i > 7 ){
            return false;
        }
        return true;
    }
}
