public class Sheep implements Domesticatable, Tradable{
    /* A Sheep class that implements the interface Domesticable and Drivable
     */
        @Override
        public String sound() {
            return "Mehhhhh!";
        }

        @Override
        public int getPrice() {
            return 17;
        }
}
