package DesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class myChannel implements Subject{

    List<Observer> subscriber=new ArrayList<>();

    @Override
    public void subscribe(Observer obj) {
        this.subscriber.add(obj);
    }

    @Override
    public void unsubscribe(Observer obj) {
        this.subscriber.remove(obj);
    }

    @Override
    public void notifyChanges(String title) {
        for(Observer ob:subscriber){
            ob.notified(title);
        }
    }
}
