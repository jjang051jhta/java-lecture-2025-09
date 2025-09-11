package test;

public class Test06 {
    public static void main(String[] args) {
        int [] unit={50000, 10000, 5000,1000,500,100,50};
        int money = 839_989_320;
        int total = unit.length;
        for(int i=0;i<unit.length;i++) {
            int rest = money/unit[i];
            if(rest==0) continue;
            System.out.println(unit[i]+"원권 "+rest+" 장");
            money %= unit[i];
        }
    }
}
