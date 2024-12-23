package stringProblems;

public class Reverse {
    public static void reverseString(char[] s) {
        if(s.length != 1){
            int j = s.length-1;
            for(int i = 0; i < s.length/2; i++){
                char temp;
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                j--;
            }
        }
    }

    public static int reverse(int x) {
        int rev = 0;
        boolean isNegative = false;
        if(x <10 && x>0){
            return x;
        } else{
            if(x < 0) isNegative = true;
            x = Math.abs(x);
            while(x > 0){
                if(rev > Integer.MAX_VALUE / 10) return 0;
                rev = rev*10 + x%10;
                x /= 10;
            }
        }

        return isNegative ? -rev : rev;
    }
}
