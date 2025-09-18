package model;

public class AddressMain01 {
    public static void main(String[] args) {
        User user01 = new User("uaser01",null);
        User user02 = new User("uaser01",new Address("장항로 27"));
        printStreet(user01);
        printStreet(user02);
    }

    private static void printStreet(User user02) {
         
    }
}
