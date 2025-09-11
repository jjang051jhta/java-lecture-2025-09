package test.exception;

public class NotEnoughStockException extends RuntimeException {
    //클래스
    private final String sku;
    private final int available;
    private final int request;

    public NotEnoughStockException(String sku, int available, int request) {
        super("재고부족 : "+sku+" available : "+available +" request : "+request);
        this.sku = sku;
        this.available = available;
        this.request = request;
    }

    public String getSku() {
        return sku;
    }

    public int getAvailable() {
        return available;
    }

    public int getRequest() {
        return request;
    }
}
