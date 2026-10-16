package main.observer;

import java.util.ArrayList;
import java.util.List;

//Subject has aggregation relationship
class WhatsAppSubject {

    List<IFollower> followerList=new ArrayList<>();
    public void addFollowerObserver(IFollower follower){
        followerList.add(follower);
    }
    public void notifyObserver(String message){
        for(IFollower follower: followerList){
            follower.sendMessage(message);
        }
    }
}

//Observer
interface IFollower{
    public void sendMessage(String message);
}

//Observer
class classA implements IFollower{
    public void sendMessage(String message){
        System.out.println("ClassA:received message"+ message);

    }
}

//Observer
class classB implements IFollower{
    public void sendMessage(String message){
        System.out.println("ClassB:received message"+ message);

    }
}

public class WhatsAppNotification{
    public static void main(String args[]) {
        WhatsAppSubject whatsAppSubject = new WhatsAppSubject();
        whatsAppSubject.addFollowerObserver(new classA());
        whatsAppSubject.addFollowerObserver(new classB());
        whatsAppSubject.addFollowerObserver(new classA());
        whatsAppSubject.notifyObserver("I am writing the code");
    }
}
/*
Output:
ClassA:received messageI am writing the code
ClassB:received messageI am writing the code
ClassA:received messageI am writing the code
 */