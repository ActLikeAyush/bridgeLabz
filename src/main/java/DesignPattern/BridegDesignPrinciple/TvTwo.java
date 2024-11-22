package DesignPattern.BridegDesignPrinciple;

public class TvTwo implements TV{

    @Override
    public void on() {
        System.out.println("Turn On the Tv2");
    }

    @Override
    public void off() {
        System.out.println("Turn Off the Tv2");
    }

    @Override
    public void changeChannel(String Channel) {
        System.out.println("change the channel of tv2 to: "+Channel);
    }
}
