package test;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        //Circle circle = new Circle();
        Circle [] circles = new Circle[3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i< circles.length;i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int radius = scanner.nextInt();
            circles[i] = new Circle(x,y,radius);
        }
        for(int i=0;i< circles.length;i++) {
            circles[i].show();
        }
        for(Circle circle:circles) {
            circle.show();
        }
        int bigIdx = 0;
        for(int i=1;i< circles.length;i++) {
            if(circles[i].getArea() > circles[bigIdx].getArea()) {
                bigIdx=i;
            }
        }
        System.out.println("""
                제일 큰 원은 %d번째 원이고 면적은 %f이다
                """.formatted(bigIdx+1,
                circles[bigIdx].getArea()));
        circles[bigIdx].show();
    }
}
