import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String myString = input.next();
        System.out.println(checkPalindrome(myString));



    }
    public static boolean checkPalindrome(String s) {
        boolean palindrome = true;
        Stack stackS = new Stack();
        Queue<Character> queueS = new LinkedList<>();
        char[] toArray = s.toCharArray();
        for (int i = 0; i < toArray.length; i++) {
            stackS.add(toArray[i]);
            queueS.add(toArray[i]);
        }
        while (!stackS.empty()){
            if (stackS.pop() != queueS.remove()){
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
