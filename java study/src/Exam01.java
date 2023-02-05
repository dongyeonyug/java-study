public class Exam01 {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        System.out.println(p1.i);//다음과 같이 필드에 직접 접근하는 코드는 바람직하지 않음 때문에 외부에서 필드에 접근 못하도록 작성해야함<---정보은닉
        p1.print();
        System.out.println("-----------");
        Child c1=new Child();
        System.out.println(c1.i);
        c1.print();
        System.out.println("-----------");
        Parent p2 = new Child();//참조타입은 Parent 인스턴스는 Child
        System.out.println(p2.i);//필드는 오버라이딩 되어도 부모타입을 따라간다.
        p2.printII();
        p2.print();

    }
}
