package review;

public class DiscountService {
    /*
    public int discount(String grade,int price) {
        int discountPercent = 0;
        if(grade.equals("BASIC")) {
            discountPercent=10;
        } else if(grade.equals("GOLD")) {
            discountPercent=20;
        } else if(grade.equals("DIAMOND")) {
            discountPercent=30;
        }
        return price * discountPercent / 100;
    }
     */
    public int discount(String grade,int price) {
        int discountPercent = 0;
        if(grade.equals(StringGrade.BASIC)) {
            discountPercent=10;
        } else if(grade.equals(StringGrade.GOLD)) {
            discountPercent=20;
        } else if(grade.equals(StringGrade.DIAMOND)) {
            discountPercent=30;
        }
        return price * discountPercent / 100;
    }


    public int discount(Grade grade,int price) {
        int discountPercent = 0;
        if(grade == Grade.BASIC) {
            discountPercent=10;
        } else if(grade == Grade.GOLD) {
            discountPercent=20;
        } else if(grade == Grade.DIAMOND) {
            discountPercent=30;
        }
        return price * discountPercent / 100;
    }
}
