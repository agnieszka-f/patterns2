package patterns2.patterns2.fasada.api;

import patterns2.patterns2.fasada.Item;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private final List<ItemDto> items = new ArrayList<>();

    public void addItem(final ItemDto item) {
        items.add(item);
    }

    public List<ItemDto> getItems() {
        return items;
    }
}
