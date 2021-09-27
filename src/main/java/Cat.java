public class Cat implements Tradable, Domesticatable, Drivable {

    private int maxSpeed;

    public Cat() {
        this.maxSpeed = 1;
    }

    /**
     * Returns the sound of this Cat.
     * @return String representing this cat's sound
     */
    @Override
    public String sound() {
        return "Meow";
    }

    /**
     * a method!!!!!
     * @return int
     */
    @Override
    public int getPrice() {
        return 5;
    }

    /**
     * Upgrades the maximum speed of this Cat by 1.
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    /**
     * Downgrades the maximum speed of this Cat by 1.
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    /**
     * Returns the maximum speed of this Cat.
     * @return int representing maximum speed of the Cat.
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * String representation of this Cat object.
     * @return String with the cat's id and maximum speed.
     */
    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }
}