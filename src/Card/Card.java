package Card;

import PaymentMethod.PaymentMethod;

// Abstraction: This class represents a generic card, abstracting away the details of specific card types.
// Encapsulation: The card's data (cardNo, userName) is kept private and accessed through public methods.
public class Card implements PaymentMethod {
    private String cardNo;
    private String userName;

    public Card(String cardNo, String name){
        this.cardNo = cardNo;
        this.userName = name;
    }

    public String getCardNo(){
        return cardNo;
    }

    public String getUserName(){
        return userName;
    }


    @Override
    public void pay() {

    }
}