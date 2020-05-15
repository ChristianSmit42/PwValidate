import jdk.internal.org.objectweb.asm.commons.JSRInlinerAdapter;

public class Password {

    private  String password = "";
    public String errorMessage = "";

    public void setPassword(String pw) {
        this.password = pw;
    }

    public String getPassword() {
        return password;
    }

    public boolean validate() {
        boolean isMinLength = validateLength();
        boolean hasNumber = validateNumber();
        boolean hasLowerUpper = validateCase();
        return isMinLength && hasNumber && hasLowerUpper;
    }

    /* Check password for LENGTH */
    public boolean validateLength() {
        if (this.password.length() > 8) {
            return true;
        }
        errorMessage += " -Länge < 8- ";
        return false;
    }

    /* Check password for NUMBER */
    public boolean validateNumber() {

        if (this.password.matches(".*\\d.*")) {
            return true;
        }
        errorMessage += " -keine Ziffer- ";
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
    public boolean validateCase() {
        boolean chkLower = false;
        boolean chkUpper = false;
        char[] chars = this.password.toCharArray();
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) {
                chkLower = true;
            }
            if (Character.isUpperCase(aChar)) {
                chkUpper = true;
            }
        }
        if (!chkLower) {
            errorMessage += " -Need lower Case- ";
        }
        if (!chkUpper) {
            errorMessage += " -Need upper Case- ";
        }
        return (chkUpper && chkLower);
    }

}
