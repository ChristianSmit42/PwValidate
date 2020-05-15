public class Password {

    public static boolean validate(String pw) {
        return true;
    }

    /* Check password for LENGTH */
    public static boolean checkLength(String pw) {
        if (pw.length() > 8) {
            return true;
        }
        return false;
    }


    /* Check password for NUMBER */
    public static boolean checkForNumber(String pw) {

        if (pw.matches(".*\\d.*")) {
            return true;
        }
        return false;

        /*boolean chk = false;
        char[] chars = pw.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chk != true) {
                chk = Character.isDigit(chars[i]);
            }
        }
        return chk;*/
    }


    /* Check password for CASE */
    public static boolean checkCase(String pw) {
        boolean chkLower = false;
        boolean chkUpper = false;
        char[] chars = pw.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i]) == true) {
                chkLower = true;
            }
            if (Character.isUpperCase(chars[i]) == true) {
                chkUpper = true;
            }
        }
        return (chkUpper && chkLower);
    }

}
