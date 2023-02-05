public class VendingMachineMain {

    //static method는 클래스 메소드-->인스턴스를 생성하지 않아도 (메모리에 올라가 있다==)사용가능
    public static void main(String[] args) {
        //instance 생성
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
        Mathbean calculation=new Mathbean();

        //VAR
        int Num=3;
        int Num2=4;

        //VendingMachine 인스턴스의 method사용
        String product=vm1.pushProductButton(1);
        String product2=vm1.pushProductButton(2);
        System.out.println(product);//println 1
        System.out.println(product2);//println 1-1


        //Mathbean 인스턴스의 method사용
        calculation.printClassName();//println2
        calculation.printNumber(Num);//println3

        int NumOne=calculation.getOne();
        System.out.println(NumOne);//println4
        int Plus=calculation.plus(Num,Num2);
        System.out.println(Plus);//println5

        //use static method
        VendingMachine.printversion();//println6
    }
}
