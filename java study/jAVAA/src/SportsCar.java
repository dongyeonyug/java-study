public class SportsCar extends Ca2{

    //부모가 기본생성자가 없기에 반드시 super()를 호출
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("빠른구동");
    }
}
