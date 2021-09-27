import java.util.List;

public class Villager implements Tradable, Domesticatable {

    public Villager() {}

    @Override
    public String sound() {
        return "Hmmm";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
