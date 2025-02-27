class Vehicle {
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle {
    void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String args[]){
        Vehicle obj = new Bike();
        obj.run();
    }
}