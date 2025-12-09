package com.meznat;

public class GoldStall implements Stall{
    private String stallName;
    private int cost;
    private String ownerName;
    private int tvSet;
    public GoldStall() {
        this.stallName = null;
        this.cost = 0;
        this.ownerName = null;
        this.tvSet = 0;
    }

    public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
        this.stallName = stallName;
        this.cost = 0;
        this.ownerName = ownerName;
        this.tvSet = 0;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTvSet() {
        return tvSet;
    }

    public void setTvSet(int tvSet) {
        this.tvSet = tvSet;
    }

    @Override
    public void display() {

    }
}
