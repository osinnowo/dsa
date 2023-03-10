import java.util.*;

public class SortBracket {
    public static String sortBracket1(String str) {
        StringBuilder sb = new StringBuilder(str);
        int left = 0;
        int right = sb.length() - 1;
        while(left < right) {
            while(left < right && !(sb.charAt(left) == ')')) { left++; }
            while(left < right && !(sb.charAt(right) == '(')) { right--; }
            sb.deleteCharAt(left); sb.deleteCharAt(right - 1);
            sb.insert(left, '('); sb.insert(right, ')');
            left++; right--;
        }
        return sb.toString();
    }

    public static String sortBracket2(String str) {
        StringBuilder sb = new StringBuilder(str);
        int left = 0;
        int right = sb.length() - 1;
        while(left < right) {
            if(sb.charAt(left) == '(') { left++; continue;} 
            while(left < right) {
                if(sb.charAt(right) == '(') {
                    sb.deleteCharAt(left); sb.deleteCharAt(right - 1);
                    sb.insert(left, '('); sb.insert(right, ')');
                    left++; right--;
                    break;
                }
                right--;
            }
        }
        return sb.toString();
    }
}
