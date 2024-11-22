package DesignPattern.BridegDesignPrinciple;

public class AdvanceRemote extends Remote{

    AdvanceRemote(TV tv){
        super(tv);
    }
    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void changeChannel(String Channel) {
        tv.changeChannel(Channel);
    }
    public void upVolume(int percentages){
        System.out.println("Volume percent is "+percentages);
    }
}
