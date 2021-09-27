/*
 *This is the class Camel which implements Drivable, Domesticatable, Tradable
 */

public class Camel implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Camel() {
        this.maxSpeed = 2;
    }

    @Override
    public String sound() {
        return "Nuzz!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
