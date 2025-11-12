package CreditCard;
import Card.Card;

// Inheritance: CreditCard inherits from the Card class, reusing its properties and methods.
// Liskov Substitution Principle: This class can be substituted for its parent class, Card.
public class CreditCard extends Card {

    public CreditCard(String cardNo, String name){
        super(cardNo, name);
    }

    // Polymorphism: This method overrides the pay() method from the parent class to provide a specific implementation for credit card payments.
    @Override
    public void pay(){
        System.out.println("Payment done using Credit Card");
    }
}