package flower;

public class Flower {
    private int price;
    private FlowerColor color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public enum FlowerColor {
        RED("#FF0000");

        private final String hexCode;

        FlowerColor(String hexCode) {
            this.hexCode = hexCode;
        }

        @Override
        public String toString() {
            return hexCode;
        }
    }
}
