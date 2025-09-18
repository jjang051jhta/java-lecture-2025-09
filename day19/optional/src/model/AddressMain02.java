package model;

import java.util.Optional;

public class AddressMain02 {
    public static void main(String[] args) {
        User user01 = new User("uaser01",null);
        User user02 = new User("uaser02",new Address("장항로 27"));
        printStreet(user01);
        printStreet(user02);
    }

    private static void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("unknown")
        );
    }
    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user)
                .map(User::getAddress) //user.getAddress()처리
                .map(Address::getStreet);
        /*
        return Optional.ofNullable(user)
                .map(u -> u.getAddress()) //user.getAddress()처리
                .map(a -> a.getStreet());
        */
    }
}
