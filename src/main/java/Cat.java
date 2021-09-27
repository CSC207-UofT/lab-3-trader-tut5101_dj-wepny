public class Cat implements Domesticatable, Tradable{

    /**
        The cat class, creates a cat with a certain rating and relative price..
     */

    private int price;

    /**
       Construct a cat with a rating and a price.
     */
    public Cat(int price){

        this.price = price;

    }

    /**
    Methods overridden from the interfaces.
     */
    @Override
    public String sound(){
        return "Meow";
    }

    @Override
    public int getPrice(){
        return this.price;
    }

}
