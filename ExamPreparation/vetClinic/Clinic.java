package vetClinic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public void add(Pet pet){
        if (this.data.size() < this.capacity){
            this.data.add(pet);
        }
    }
    public boolean remove(String name){
        return data.removeIf(pet -> pet.getName().equals(name));
    }
    public Pet getPet(String name, String owner){
        return data.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst()
                .orElse(null);

    }
    public Pet getOldestPet(){
        Pet oldestPet = null;
        int max = 0;
        for (Pet datum : data){
            if (datum.getAge() > max){
                max = datum.getAge();
                oldestPet = datum;
            }

        }
        return oldestPet;


    }
    public int getCount(){
        return data.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The clinic has the following patients:")).append("\n");
        for (Pet datum : data){
            sb.append(String.format("%s %s",datum.getName(),datum.getOwner())).append("\n");
        }
        return sb.toString().trim();
    }


}
