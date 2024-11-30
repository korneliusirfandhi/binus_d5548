package class_2410_lb83.week08_abstraction.multifaceted_abstraction.before;

// multifaceted -> banyak responsibility (fowler = large class)
// extract class
public class Transaction {
    private String customerName, customerEmail, customerPhone, customerAddress;
    private String productName, productCategory;
    private double productPrice;
    private String logisticProvider, logisticService;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getLogisticProvider() {
        return logisticProvider;
    }

    public void setLogisticProvider(String logisticProvider) {
        this.logisticProvider = logisticProvider;
    }

    public String getLogisticService() {
        return logisticService;
    }

    public void setLogisticService(String logisticService) {
        this.logisticService = logisticService;
    }
}
