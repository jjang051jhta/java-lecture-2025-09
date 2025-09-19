package review04.enumeration;

public enum Grade {
    BASIC("베이직",10),GOLD("골드",20),DIAMOND("다이아",30);
    private final int percent;
    private final String name;

    //상수처럼 사용 가능...
    //MANAGER("매니저",2), ADMIN("최고관리자",10),GUEST("손님",1)

    Grade(String name, int percent) {
        this.percent = percent;
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public String getName() {
        return name;
    }

    public int discount(int price) {
        return price/percent*100;
    }
}
