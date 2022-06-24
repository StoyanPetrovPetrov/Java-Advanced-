package guild;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guild {
    private String name;
    private int capacity;
    List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        roster = new ArrayList<>();
    }
    public void addPlayer(Player player){
        if (this.roster.size() < this.capacity){
            this.roster.add(player);
        }
    }
    public boolean removePlayer(String name){
        return this.roster.removeIf(s->s.getName().equals(name));
    }
    public void promotePlayer(String name){
        Player player = this.roster.stream().filter(s->s.getName().equals(name)).findFirst().orElse(null);
        if (null != player || !player.getRank().equals("Member")) {
            player.setRank("Member");
        }
    }
    public void demotePlayer(String name){
        Player player = this.roster.stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
        if (player != null && !player.getRank().equals("Trial")) {
            player.setRank("Trial");
        }
    }
    public Player[] kickPlayersByClass(String clazz){
        List<Player> playersToRemove = this.roster.stream().filter(s -> s.getClazz().equals(clazz)).collect(Collectors.toList());
        this.roster.removeAll(playersToRemove);
        return playersToRemove.toArray(Player[]::new);

    }
    public int count(){
        return this.roster.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String report(){
        return "Players in the guild: " + this.getName() + ":" + System.lineSeparator() +
                this.roster.stream().map(Player::toString).collect(Collectors.joining(System.lineSeparator()));
    }

}
