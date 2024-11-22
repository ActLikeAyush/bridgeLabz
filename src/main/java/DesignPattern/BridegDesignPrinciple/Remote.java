package DesignPattern.BridegDesignPrinciple;

public abstract class Remote {
    protected TV tv;
    Remote(TV tv){
        this.tv=tv;
    }
    public abstract void on();
    public abstract void off();
    public abstract void changeChannel(String Channel);
}
