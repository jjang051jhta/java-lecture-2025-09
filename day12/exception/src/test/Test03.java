package test;

import test.exception.EmailValidException;

public class Test03 {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();
        String email = "fhdshjfds";
        try {
            emailValidator.validate(email);
            System.out.println("정상적인 이멜입니다.");
        } catch (EmailValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
