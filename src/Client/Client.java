package Client;

import CreditCard.CreditCard;
import DebitCard.DebitCard;
import PaymentService.PaymentService;

// Open/Closed Principle: The system is open to extension (new payment methods can be added) but closed for modification (the PaymentService and Client classes don't need to change).
// Dependency Inversion Principle: The Client depends on the PaymentService abstraction, not on concrete payment method implementations.
public class Client {
    public static void main(String[] args) {
        PaymentService ps =  new PaymentService();
        ps.addpaymentmethod("KANCHERLA_GOUTHAM_DEBIT",new CreditCard("1234", "Goutham Kancherla"));
        ps.addpaymentmethod("KANCHERLA_GOUTHAM_CREDIT",new DebitCard("12345", "Goutham Kancherla"));
        ps.makepayment("KANCHERLA_GOUTHAM_CREDIT");
        ps.makepayment("KANCHERLA_GOUTHAM_DEBIT");

    }
}
