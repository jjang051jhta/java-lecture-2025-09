package model;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class AddressMain03 {
    public static void main(String[] args) {
        User user01 = new User("uaser01",null);
        User user02 = new User("uaser02",new Address("장항로 27"));
        printStreet(user01);
        printStreet(user02);
    }

    private static void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                },
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("unknown");
                    }
                }
        );
    }
    //Optional은 메서드 리턴값으로 시용하는게 좋다.
    //get()은 직접 사용 금지
    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user)
                .map(new Function<User, Address>() {
                    @Override
                    public Address apply(User user) {
                        return user.getAddress();
                    }
                }) //user.getAddress()처리
                .map(new Function<Address, String>() {
                    @Override
                    public String apply(Address address) {
                        return address.getStreet();
                    }
                });
    }
}
