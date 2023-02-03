public class Carexam1 {
    public static void main(String[] args) {

        Bus b1=new Bus();
        b1.move();
        //b1.sound();

        Car c1=new Bus();//인스턴스는 Bus지만 Car가 가진 메소드만 사용가능
        c1.move();//메소드가 오버라이딩 되면 무조건 오버라이딩 된 메소드가 실행된다.

        Bus b2=(Bus)c1;//c1이 참조하는 Bus인스턴스를 원래 형태로 참조해서 사용하겠다는 뜻
        b2.sound();


        Car c2=new SuperCar();
        //이 경우 SuperCar클래스가 여러 메소드를 가지고 있다고 해도
        //Car의 메소드 밖에 사용할 수 없다.


        c2.move();

    }
    }

