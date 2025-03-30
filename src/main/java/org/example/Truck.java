package org.example;

public class Truck {

    private int id;
    private String name;
    private String model;
    private int capacity;
    private String driverName;

    Truck(){

    }

    Truck(String name,String model,int capacity,String driverName){
        this.name = name;
        this.model = model;
        this.capacity = capacity;
        this.driverName = driverName;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", driverName='" + driverName + '\'' +
                '}';
    }
}
