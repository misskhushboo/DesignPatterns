package com.design.StateMachine;

public class IStateMachine {

    public static void main(String[] args) {
        new ATMMachine(new NoCardState());
    }
}

//ATM machine has a state
interface IATM_Machine_States {
    void insertCard();
    void withdrawCash();
    void ejectCard();
}

//Two States - Either there's no card or it has card.
class NoCardState implements IATM_Machine_States {
    private ATMMachine atmmachine;
    NoCardState (){

    }
    public void insertCard(){
        System.out.println("No card no cash");
        atmmachine.setCurrentState(atmmachine.getCardInsertedState());
    }
    public void withdrawCash(){
        System.out.println("You cannot withdraw cash if no card is inserted");
    }
    public void ejectCard(){

        System.out.println("No card is in box, hence cannot eject card");
    }
}

class HasCardState implements IATM_Machine_States {
    private ATMMachine atmmachine;

    public HasCardState (){

    }
    public void insertCard(){

        System.out.println("Card is now inserted");

    }
    public void withdrawCash(){

        System.out.println("Withdrawing cash");
    }
    public void ejectCard(){

        System.out.println("Going to eject card. Changing state..");
        atmmachine.setCurrentState(atmmachine.getNoCardState());
    }
}