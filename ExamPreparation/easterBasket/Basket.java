package easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    private String material;
    private int capacity;
    List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public void addEgg(Egg egg){
        if (this.data.size() < this.capacity){
            this.data.add(egg);
        }
    }
    public boolean removeEgg(String color){
        return data.removeIf(egg -> egg.getColor().equals(color));
    }
    public Egg getStrongestEgg(){
        return this.data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
    }
    public Egg getEgg(String color){
        return this.data.stream().filter(s -> s.getColor().equals(color)).findFirst().orElse(null);
    }
    public int getCount(){
        return this.data.size();

    }
    public String report(){
        return this.material + " basket contains:" + System.lineSeparator() +
                this.data.stream().map(Egg::toString).collect(Collectors.joining(System.lineSeparator()));
    }
}
