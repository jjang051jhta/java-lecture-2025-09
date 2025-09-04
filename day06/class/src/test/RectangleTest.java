package test;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(2,2,8,7);
        System.out.println("면적은 "+myRect.square());
        //myRect.show();
        myRect.showTextBlock();
        Rectangle rect02 =new Rectangle(3,3,15,4);
        rect02.showTextBlock();
        if(myRect.contain(rect02)){
            System.out.println("myRect는 rect02를 포함합니다.");
        }else {
            System.out.println("myRect는 rect02를 포함하지 않습니다.");
        }
    }
}
