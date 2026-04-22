package ExceptionPratice;

public class CashPayment extends Payment{
    private String cashReciptNumber;

    public CashPayment(String shopName, String productName, long productPrice, String cashReciptNumber) {
        super(shopName, productName,productPrice);
        this.cashReciptNumber = cashReciptNumber;
    }
}
