package test;

public class Day {
    private String work; //하루의 할 일을 나타내는 문자열
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.print("할 일이 없습니다 , ");
        else System.out.print("해야할 일은 "+work+"입니다 , ");
    }
    public void show(int day) {
        if(work == null) System.out.print("할 일이 없습니다 , ");
        else System.out.print(day+"일에 해야할 일은 "+work+"입니다 , ");
    }
}
