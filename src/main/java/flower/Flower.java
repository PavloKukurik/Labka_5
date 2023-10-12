package flower;

public class Flower {
    private int price;
    private FlowerColor color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor newColor) {
        color = newColor;
    }
}

