/* A class motorcycle that implements Tradable and Drivable.
 */
public class Motorcycle implements Tradable, Drivable{
    private int maxSpeed;

    /**
     * constructs a Motorcycle

     */
    public Motorcycle() {
        this.maxSpeed = 100;
    }
    /**
     * obtain the price of the motorcycle
     *
     * @return the price of the motorcycle
     */
    public int getPrice(){
        return 100;
    }
    /**
     * upgrades the speed of the motorcycle
     *
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 25;
    }

    /**
     * downgrades the speed of the motorcycle
     *
     */
    public void downgradeSpeed(){
        this.maxSpeed = this.maxSpeed - 25;
    }
    /**
     *obtains the max speed of the motorcycle
     *
     * @return the max speed of the motorcycle
     */
    @Override
    public int getMaxSpeed(){
        return this.maxSpeed;
}

}
