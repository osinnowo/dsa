public class Palindrome {
    public static boolean isPalindrome1(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right) {
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++; right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))) { left++; }
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))) { right--; }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) return false;
            left++; right--;
        }
        return true;
    }
}