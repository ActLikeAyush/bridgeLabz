package DesignPattern.BridegDesignPrinciple;

public class TvOne implements TV{

    @Override
    public void on() {
        System.out.println("Turn On the Tv1");
    }

    @Override
    public void off() {
        System.out.println("Turn Off the Tv1");
    }

    @Override
    public void changeChannel(String Channel) {
        System.out.println("change the channel of tv1 to: "+Channel);
    }
}
