public abstract class RebelShip implements SpaceShip {
    private double velocity;
    private boolean isItBroken;

    public RebelShip(float velocity, boolean isItBroken) {
        this.velocity = velocity;
        this.isItBroken = isItBroken;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public boolean isItBroken() {
        return isItBroken;
    }

    public void setItBroken(boolean itBroken) {
        isItBroken = itBroken;
    }

    public abstract boolean caughtByTractorBeam();

    public double howFast() {
        return velocity;
    }

    public boolean fasterThan(SpaceShip spaceShip) {
        if (spaceShip instanceof RebelShip) {
            return this.velocity > spaceShip.howFast() && ((RebelShip) spaceShip).isItBroken;
        }
        if(spaceShip instanceof MilleniumFalcon) {
            return this.velocity > spaceShip.howFast() * 2;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rebel ship{velocity=" + velocity + ", is it broken=" + isItBroken + "}";
    }
}
