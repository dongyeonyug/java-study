public class Bus2 extends Ca2{

    public Bus2(){

        super("coke");
        System.out.println("bus");
    }

    //부모가 가진 추상메소드는 자식에서 반드시 구현해 줘야 한다.
    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
