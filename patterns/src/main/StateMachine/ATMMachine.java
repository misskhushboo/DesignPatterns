package main.StateMachine;

public class ATMMachine {

    IATM_Machine_States currentStatus;
    //Need reference of other states even if it's not the current state
    IATM_Machine_States card_inserted_state;
    IATM_Machine_States no_card_State;

    public ATMMachine(IATM_Machine_States currentStatus){
        this.card_inserted_state=new HasCardState();
        this.no_card_State=new NoCardState();
        this.currentStatus=currentStatus;
    }

    IATM_Machine_States getNoCardState(){
        return no_card_State;
    }
    IATM_Machine_States getCardInsertedState(){
        return card_inserted_state;
    }

    //The implementation of below method depends on the current state.
    //Offload task to appropriate state
    void insertCard(){
        currentStatus.insertCard();
    }

    void withdrawCash(){
        currentStatus.withdrawCash();
    }
    void ejectCard(){
        currentStatus.ejectCard();
    }

    public void setCurrentState( IATM_Machine_States state){
        this.currentStatus=state;
    }

}

