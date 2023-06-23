import java.util.Random;

public class XWing extends RebelShip implements HyperDrive {

    public XWing(){
        super(150, true);
    }

    @Override
    public void hyperJump() {
        Random random = new Random();
        setVelocity(getVelocity() + random.nextDouble(0,101));
    }

    @Override
    public boolean caughtByTractorBeam() {
        return getVelocity() < 10000 && isItBroken();
    }

    @Override
    public String toString() {
        return "X-Wing:" + super.toString();
    }
}
