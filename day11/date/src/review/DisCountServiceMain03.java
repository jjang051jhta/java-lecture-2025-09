package review;

public class DisCountServiceMain03 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService  discountService = new DiscountService();

        int basic =  discountService.discount(Grade.BASIC,price);
        int gold =  discountService.discount(Grade.GOLD,price);
        int diamond =  discountService.discount(Grade.DIAMOND,price);
        //int vip =  discountService.discount("vip",price);
        //오타 방지 / 타입 안정성
        System.out.println("BASIC 할인금액 : "+basic);
        System.out.println("GOLD 할인금액 : "+gold);
        System.out.println("DIAMOND 할인금액 : "+diamond);

        Grade grades[] =  Grade.values();
        for(Grade grade : grades) {
            System.out.println(grade+" / " +grade.ordinal() +" / "+grade.name());
        }
    }
    //GUEST(1,"손님"),MANAGER(2,"매니저"),ADMIN(3,"최고 관리자");
}
