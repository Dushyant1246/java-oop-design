// Class responsible for bill calculation
class BillGenerator {

    // Method to generate total bill amount for a customer
    public static double generateBill(BillingCustomer customer) {
        double totalAmount = 0;
        for (BillingProduct product : customer.getBillingProducts()) {
            totalAmount += product.getTotalPrice();
        }
        return totalAmount;
    }
}