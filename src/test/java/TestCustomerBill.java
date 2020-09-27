import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCustomerBill {

    CalculateBill calculateBill;
    @Before
    public void setUp() throws Exception {
        calculateBill =  new CalculateBill();
    }

    @Test
    public void testRegularCustomer(){

        assertEquals(5000D,calculateBill.calculateBillForCustomer(5000D,CustomerType.REGULAR).doubleValue(),0);
        assertEquals(9500D, calculateBill.calculateBillForCustomer(10000D,CustomerType.REGULAR).doubleValue(),0);
        assertEquals(13500D, calculateBill.calculateBillForCustomer(15000D,CustomerType.REGULAR).doubleValue(),0);

    }

    @Test
    public void testPremiumCustomer(){
        assertEquals(3600D, calculateBill.calculateBillForCustomer(4000D,CustomerType.PREMIUM).doubleValue(),0);
        assertEquals(7000D, calculateBill.calculateBillForCustomer(8000D,CustomerType.PREMIUM).doubleValue(),0);
        assertEquals(10200D, calculateBill.calculateBillForCustomer(12000D,CustomerType.PREMIUM).doubleValue(),0);
        assertEquals(15800D, calculateBill.calculateBillForCustomer(20000D,CustomerType.PREMIUM).doubleValue(),0);

    }


}
