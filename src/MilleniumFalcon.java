public class MilleniumFalcon implements SpaceShip, HyperDrive {
    private double experience;

    public MilleniumFalcon() {
        this.experience = 100;
    }

    @Override
    public double howFast() {
        return experience * 2;
    }

    @Override
    public boolean fasterThan(SpaceShip spaceShip) {
        return spaceShip.howFast() < this.howFast();
    }

    @Override
    public void hyperJump() {
        this.experience += 500;
    }

    @Override
    public String toString() {
        return "Millenium Falcon{expirience=" + experience + '}';
    }
}
