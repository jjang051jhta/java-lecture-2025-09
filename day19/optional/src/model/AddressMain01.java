package model;

public class AddressMain01 {
    public static void main(String[] args) {
        User user01 = new User("uaser01",null);
        User user02 = new User("uaser02",new Address("장항로 27"));
        printStreet(user01);
        printStreet(user02);
    }

    private static void printStreet(User user) {
        String userStreet = getUserStreet(user);
        if(userStreet!=null) {
            System.out.println(userStreet);
        } else {
            System.out.println("unknown");
        }

    }
    static String getUserStreet(User user) {
        if(user==null) {
            return null;
        }
        Address address = user.getAddress();
        if(address==null) {
            return null;
        }
        return address.getStreet();
    }
}
