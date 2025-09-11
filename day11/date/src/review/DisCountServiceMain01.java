package review;

public class DisCountServiceMain01 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService  discountService = new DiscountService();
        int vip =  discountService.discount("VIP",price);
        int basic =  discountService.discount("BASIC",price);
        int gold =  discountService.discount("GGOLD",price);
        int diamond =  discountService.discount("DIAMOND",price);
        System.out.println("BASIC 할인금액 : "+basic);
        System.out.println("GOLD 할인금액 : "+gold);
        System.out.println("DIAMOND 할인금액 : "+diamond);
        System.out.println("VIP 할인금액 : "+vip);
    }
}
