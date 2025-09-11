package test;

import test.exception.WeakPasswordException;

public class Test02 {
    //비밀번호 정책 위반 (Unchecked)
    //요구: 길이 8 이상  위반 시 WeakPasswordException(Unchecked) 발생하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        String myPassword = "abcdefG8";
        /*
        try {
            validate(myPassword);
            System.out.println("정상적인 패스워드입니다.  "+myPassword);
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
         */
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(myPassword);
            System.out.println("정상적인 패스워드입니다.  "+myPassword);
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    static  void validate(String password) {
        if(password==null || password.length()<8) {
            throw new WeakPasswordException("패스워드는 8자 이상이어야 합니다.");
        }
    }
}
