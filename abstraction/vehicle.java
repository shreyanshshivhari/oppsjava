package p1.abstraction;

abstract public class vehicle {
    int no_tyre;
    void common(){
        System.out.println("this is common");
    }
    abstract void stop();
    public static void main(String[] args) {
        car car = new car();
        car.no_tyre = 4;
        car.stop();
    }
}
