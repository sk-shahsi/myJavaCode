package com.meznat;

public class PremiumStall implements Stall{
    private String stallName;
    private int cost;
    private String ownerName;
    private int projector;
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
    public int getProjector() {
        return projector;
    }
    public void setProjector(int projector) {
        this.projector = projector;
    }
    public PremiumStall() {
        this.stallName = null;
        this.cost = 0;
        this.ownerName = null;
        this.projector = 0;
    }
    public PremiumStall(String stallName, int cost,String ownerName,int projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
    }

    @Override
    public void display() {

    }
}
