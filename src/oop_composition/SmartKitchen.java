package oop_composition;

public class SmartKitchen {

    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishwasher;

    public SmartKitchen() {

        brewMaster = new CoffeMaker();
        iceBox = new Refrigerator();
        dishwasher = new DishWasher();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }
    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag,boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishwasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffe();
        iceBox.orderFood();
        dishwasher.doDishes();
    }
}

class CoffeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffe() {
        if (hasWorkToDo) {
            System.out.println("brewing coffe");
            hasWorkToDo = false;
        }
    }

}

class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }

}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("washing dishes");
            hasWorkToDo = false;
        }
    }

}