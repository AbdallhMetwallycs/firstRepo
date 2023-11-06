package chapter8;

import java.util.Objects;
import java.util.Scanner;



public class PasswordValidator {
    static Scanner scanner = new Scanner(System.in);
    private static final String username = "abdallhmetoo";

    public static void main(String[] args) {

        String newPass = updatePassword();
        scanner.close();
        passwordValidator(newPass);
    }

    public static void passwordValidator(String newPass) {
        if (checkPasswordLength(newPass)>8 && checkSpecialCharacters(newPass) && checkUpperCase(newPass) && checkUsername(newPass) && checkOldPassword(newPass)) {
            System.out.println(" Password Updated Successfully ");
        }else System.out.println("ur password is missing a rule !!");

    }

    private static boolean checkUpperCase(String newPass){
        boolean bool = false;
        for (int i = 0; i < checkPasswordLength(newPass); i++) {
            if (i != 0 && Character.isUpperCase(newPass.charAt(i))){
                i++;
                bool = true;
            }
        }
        return bool;

    }
    private static boolean checkUsername(String newPass){
        return Objects.equals(newPass, username);

    }
    private static boolean checkOldPassword(String newPass){
        boolean bool = false;
        String oldPassword = "01146835871Metoo@";
        if (newPass.equals(oldPassword)) {
            System.out.println(" the new password is the same as the old one");
            bool = true;
        }
        return bool;
    }
    private static boolean checkSpecialCharacters(String newPass) {
        boolean bool = false;
        for (int i = 0; i < checkPasswordLength(newPass); i++)
            if (newPass.charAt(i) == '@') bool = true;
            else if (newPass.charAt(i) == '!') bool = true;
            else if (newPass.charAt(i) == '#') bool = true;
            else if (newPass.charAt(i) == '%') bool = true;
            else if (newPass.charAt(i) == '^') bool = true;
            else if (newPass.charAt(i) == '&') bool = true;
            else if (newPass.charAt(i) == '*') bool = true;
        return bool;
    }

    public static String updatePassword() {
        System.out.println(" 1- at least 1 character\n 2- contain uppercase letter\n 3- contain special character");
        System.out.println(" 4- not the same as old password \n 5- not the same as username");
       System.out.println(" enter a new password");
        return scanner.nextLine();

    }

    private static int checkPasswordLength(String newPass) {
        return newPass.length();
    }
}
