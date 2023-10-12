package flower.filters;
import flower.Item;

public interface SearchFilter {
    boolean match(Item item);
}
