package it.polimi.ingsw.model.gameboard.characters;

public class Character12 implements CharacterCard{
    private int index;
    private int cost;

    public Character12() {
        this.index = 12;
        this.cost = 3;
    }

    @Override
    public void play() {
        this.cost++;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return  "index: " + index +
                "\tcost: " + cost;
    }
}