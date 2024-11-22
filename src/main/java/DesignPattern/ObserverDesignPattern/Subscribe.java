package DesignPattern.ObserverDesignPattern;

public class Subscribe implements Observer{
    String name;
    Subscribe(String name){
        this.name=name;
    }

    @Override
    public void notified(String title ) {
        System.out.println("hy "+this.name+" new video is uploaded "+title );
    }
}
