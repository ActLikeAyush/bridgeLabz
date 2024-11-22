package DesignPattern.ObserverDesignPattern;

public interface Subject {
    void subscribe(Observer obj);
    void unsubscribe(Observer obj);
    void notifyChanges(String title);
}
