package test;

import test.exception.WeakPasswordException;

public class PasswordValidator {
    public void validate(String password) {
        if(password==null || password.length() < 8) {
            throw new WeakPasswordException("패스워드는 8자 이상이어야 합니다.");
        }
        if(!password.matches(".*[0-9].*")) {
            throw new WeakPasswordException("패스워드는 숫자를 포함해야 합니다.");
        }
        if(!password.matches(".*[a-z].*")) {
            throw new WeakPasswordException("패스워드는 소문자 하나 이상을 포함해야 합니다.");
        }
        if(!password.matches(".*[A-Z].*")) {
            throw new WeakPasswordException("패스워드는 대문자 하나 이상을 포함해야 합니다.");
        }
    }
}
