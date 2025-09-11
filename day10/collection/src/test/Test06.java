package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,City> cityMap = new HashMap<>();
        while (true) {
            String str = scanner.nextLine();
            if(str.equals("그만")) break; //서울,10,10
            String splitArray [] = str.split(",");
            String name = splitArray[0].trim();
            int longitude = Integer.parseInt(splitArray[1]);
            int latitude = Integer.parseInt(splitArray[2]);
            City city = new City(splitArray[0],longitude,latitude);
            cityMap.put(name,city);
        }
        while (true) {
            String str = scanner.nextLine();
            if(str.equals("그만")) break; //서울,10,10
            System.out.println(cityMap.get(str));
        }
    }
}
