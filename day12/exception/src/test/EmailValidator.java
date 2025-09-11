package test;

import test.exception.EmailValidException;
import test.exception.WeakPasswordException;

public class EmailValidator {
    public void validate(String email) {
        String emailReg = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if(email==null || email.isBlank()) {
            throw new EmailValidException("이메일은 필수 입력사항입니다.");
        }
        if(!email.matches(emailReg)) {
            throw new EmailValidException("잘못된 이메일 형식입니다.");
        }
    }
}
