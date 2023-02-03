
public class Person {
    //인스턴스 필드(static 사용x) 선언  인스턴스 필드는 인스턴스를 만들어야만 사용가능함
    String name;
    String address;
    boolean isVip;

    //class 필드
    static  int count=10;
    static{//클래스 필드는 static 블록에서 초기화가능
        count=100;
    }

    public void printName(){ //인스턴스 메소드
        System.out.println(count);
    }

    public static void printCount(){ //클래스 메소드(인스턴스 없이도 사용가능)
        //System.out.println(name); static한 메소드에서는 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
        System.out.println(count);
    }


}
