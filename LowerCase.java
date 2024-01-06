/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String result = "";
        for (int i = 0 ; i < s.length() ; i++) {
            if ((int) (s.charAt(i))>= 65 && (int) (s.charAt(i)) <= 90) {
                result = result + ((char) ((int) s.charAt(i) + 32));
            } else {
                result = result + s.charAt(i);
            }
        }
        return result;
    }
}