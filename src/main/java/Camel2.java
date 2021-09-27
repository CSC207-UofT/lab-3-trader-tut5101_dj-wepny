/* A class that implements Tradable and Domesticable, mimiking a camel.
 */
public class Camel2 implements Domesticatable, Tradable{

    private static int price;

    public Camel2(String type) {
        if(type.equalsIgnoreCase("expensive")){
            price = 1000000;
        }
        else{
            price = 100000;
        }
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String sound() {
        return "Bleeearrrrr";
    }
}
