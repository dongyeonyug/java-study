public class Child extends Parent{

    public int i=15;//필드에 대한 오버라이딩


//    public void printII(){
//        System.out.println(4*i);
//    }
    public void print(){//메소드에 대한 오버라이딩
        System.out.println("child "+i);
    }
}
