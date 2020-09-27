public class CalculateBill {

    public Double calculateBillForCustomer(Double aShopingBil, CustomerType aCustomertype) {
        switch (aCustomertype) {
            case PREMIUM:
                return  aShopingBil - calculateDiscountForPremiumCustomer(aShopingBil);

            case REGULAR:
                return  aShopingBil - calculateDiscountForRegularCustomer(aShopingBil);

            default:
                throw new RuntimeException("invalid customer type");
        }
       }

    private Double calculateDiscountForRegularCustomer(Double aShopingBil) {
        double discount = 0L;
        if (aShopingBil > 5000 && aShopingBil <= 10000) {
            discount = (aShopingBil-5000)*0.1;
        } else if (aShopingBil > 10000) {
            discount = 500 + (aShopingBil-10000)*0.2;
        }
        return  discount;
    }

    private Double calculateDiscountForPremiumCustomer(Double aShopingBil) {
        double discount = 0L;

        if(aShopingBil <= 4000) {
            discount = aShopingBil*0.1;
        } else if (aShopingBil > 4000 && aShopingBil <= 8000) {
            discount = 400 + (aShopingBil-4000)*0.15;
        } else if (aShopingBil > 8000 && aShopingBil <= 12000) {
            discount = 400 + 600  + (aShopingBil-8000)*0.2;
        } else if (aShopingBil > 12000) {
            discount = 1000+ 800 + (aShopingBil-12000)*0.3;
        }
        return discount;
    }
}
