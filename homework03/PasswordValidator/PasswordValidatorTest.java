package homework03.PasswordValidator;

public class PasswordValidatorTest {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(PasswordValidator.checkPassword("dcwwd4c", "aaa", "aaa"));
        System.out.println(PasswordValidator.checkPassword("dcwwd4ceeeeeeeeeeeeeeeeeeeeeeeeeee", "aaaa", "aaaa"));
        System.out.println(PasswordValidator.checkPassword("dcwwd4c)", "aaaa", "aaaa"));
        System.out.println(PasswordValidator.checkPassword("dc4c", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaa"));
        System.out.println(PasswordValidator.checkPassword("dcwwd4c", "a)aa", "a)aa"));
        System.out.println(PasswordValidator.checkPassword("dcwwd4c", "aaa", "a)aa"));
    }
}
