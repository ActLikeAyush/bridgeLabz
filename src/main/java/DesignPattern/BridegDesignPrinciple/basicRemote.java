package DesignPattern.BridegDesignPrinciple;

public class basicRemote extends Remote{

    basicRemote(TV tv){
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
}

