
//추상 클래스는 인스턴스화 될 수 없다.
public abstract class Ca2 {

    //기본 생성자가 없을 경우 자식 클래스에서 생성자를 따로 만들어주고 부모 생성자에 값을 전해줘야 한다.
    public Ca2(String name){
        System.out.println("Hi"+name);
    }

    public abstract void run();
}
