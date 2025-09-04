//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Circle pizza = new Circle();
        Rect rect = new Rect();
        rect.name="정사각형";
        rect.width=100;
        rect.height=100;
        rect.getInfo();
                       //Heap 메모리에 올라옴
        pizza.radius=24;
        //Stack area에 올라온다.
        pizza.name="도민호";
        System.out.println(pizza.getArea());
        pizza.getInfo();

        Circle dunkin = new Circle();
        dunkin.name="던킨도넛";
        double dunkinArea = dunkin.getArea();
        System.out.println(dunkinArea);
        dunkin.getInfo();
    }
}