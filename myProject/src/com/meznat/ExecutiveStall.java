package com.meznat;

public class ExecutiveStall implements Stall{
    private String stallName;
    private int cost;
    private String ownerName;
    private int screen;
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
    public int getScreen() {
        return screen;
    }
    public void setScreen(int screen) {
        this.screen = screen;
    }
    public ExecutiveStall() {
        this.stallName = null;
        this.cost = 0;
        this.ownerName = null;
        this.screen = 0;
    }
    public ExecutiveStall(String stallName,int cost,String ownerName,int screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
    }

    @Override
    public void display() {

    }
}
