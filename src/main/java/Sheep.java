public class Sheep implements Domesticatable, Tradable{
    /* A Sheep class that implements the interface Domesticable and Tradable
     */
        private int price = 17;

        public Sheep() {
            this.price = 17;
        }
        @Override
        public String sound() {
            return "Mehhhhh!";
        }

        @Override
        public int getPrice() {
            return this.price;
        }
}
