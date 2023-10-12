package flower;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.parameters.P;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public int getPrice() {
        int total = 0;
        for (FlowerPack pack : flowerPacks) {
            total += pack.flower().getPrice() * pack.quantity();
        }
        return total;
    }
}

record FlowerPack(Flower flower, int quantity) {}

class Rose extends Flower {}
