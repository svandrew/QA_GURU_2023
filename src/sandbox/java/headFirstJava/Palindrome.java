package headFirstJava;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^а-яё0-9a-z]","");

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("казак"));
        System.out.println(isPalindrome("abbc"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
        System.out.println(isPalindrome("арозаупаланалапуазора"));
        System.out.println(isPalindrome("А роза упала на лапу Азора!"));
        System.out.println(isPalindrome("ёа"));
    }
}
