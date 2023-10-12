package flower;

public class Flower {
    private int price;
    private FlowerColor color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int value) {
        this.price = value;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor colour) {
        this.color = colour;
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
