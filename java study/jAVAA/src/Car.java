public class Car {

    private String name;
    public Car(){
        System.out.println("Im ride");
    }
    public Car(String name){
        this.name=name;
    }

    public String carName(){
        return this.name;
    }
    public void move(){
        System.out.println("Run");
    }

    @Override
    public String toString() {
        return "Car!!!";
    }
}
