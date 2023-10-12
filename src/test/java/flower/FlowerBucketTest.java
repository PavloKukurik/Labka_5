package flower;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;


public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
//    public void testPrice() {
//        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
//        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
//        Flower flower = new Rose();
//        flower.setPrice(10);
//        FlowerPack flowerPack = new FlowerPack(flower, quantity);
//        flowerBucket.add(flowerPack);
//        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
//    }
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);  // Set the Rose's price to the random price you generated
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }

}
