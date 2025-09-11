package test;

import test.exception.NotEnoughStockException;

public class Test06 {
    public static void main(String[] args) {
        /*
        재고 부족 (Unchecked + 상태 포함)
        요구: NotEnoughStockException(sku, available, requested) 던지는 프로그램을 작성하시오.
        메시지/필드 포함.
         */
        Inventory inventory = new Inventory(5);
        try {
            inventory.take("빵", 7);
        } catch (NotEnoughStockException e) {
            System.out.println(e.getMessage());
            System.out.println("재고 : "+e.getAvailable()+", 요청 : "+e.getRequest());
        }
    }
}
