package PaymentService;
import PaymentMethod.PaymentMethod;

import java.util.HashMap;

// Single Responsibility Principle: This class has a single responsibility: to manage and process payments.
public class PaymentService {
    HashMap<String , PaymentMethod> paymentmethods;

    public PaymentService(){
        paymentmethods = new HashMap<>();
    }
    public void addpaymentmethod(String name, PaymentMethod pm){
          paymentmethods.put(name,pm);
    }
    public void makepayment(String name ){
      PaymentMethod pm = paymentmethods.get(name);

      pm.pay();
    }

}
