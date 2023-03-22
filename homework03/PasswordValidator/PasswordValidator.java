package homework03.PasswordValidator;

import java.time.temporal.ValueRange;

public class PasswordValidator {

    static boolean checkPassword(String login, String password, String confirmPassword) {
        String exceptionMessageLogin = getExceptionMessage(login, "Логин");
        String exceptionMessagePassword = getExceptionMessage(password, "Пароль");
        if (exceptionMessageLogin != null) {
            try {
                throw new WrongLoginException(exceptionMessageLogin);
            } catch (WrongLoginException e) {
                System.err.println(e);
                return false;
            }
        } else if (exceptionMessagePassword != null) {
            try {
                throw new WrongPasswordException(getExceptionMessage(password, "Пароль"));
            } catch (WrongPasswordException e) {
                System.err.println(e);
                return false;
            }
        } else if (!password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException("Пароль и подтверждение не совпадают");
            } catch (WrongPasswordException e) {
                System.err.println(e);
                return false;
            }
        }
        return true;
    }

    static String getExceptionMessage(String str, String strName) {
        if (str.length() > 20) {
            return strName + " слишком длинный";
        }
        ValueRange range01 = ValueRange.of(48, 57);
        ValueRange range02 = ValueRange.of(65, 90);
        ValueRange range03 = ValueRange.of(97, 122);
        for (int i = 0; i < str.length(); i++) {
            char symbolLogin = str.charAt(i);
            if (!range01.isValidIntValue(symbolLogin) && !range02.isValidIntValue(symbolLogin) && !range03.isValidIntValue(symbolLogin) && symbolLogin != '_') {
                return strName + " содержит недопустимые символы";
            }
        }
        return null;
    }
}
