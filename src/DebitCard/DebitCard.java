package DebitCard;
import Card.Card;

// Inheritance: DebitCard inherits from the Card class, reusing its properties and methods.
// Liskov Substitution Principle: This class can be substituted for its parent class, Card.
public class DebitCard extends Card {

    public DebitCard(String cardNo, String name){
        super(cardNo, name);
    }

    // Polymorphism: This method overrides the pay() method from the parent class to provide a specific implementation for debit card payments.
    @Override
    public void pay(){
        System.out.println("Payment done using Debit Card");
    }
}