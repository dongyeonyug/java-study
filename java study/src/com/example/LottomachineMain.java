package com.example;

public class LottomachineMain {

    public static void main(String[] args) {

        //변수가 45개필요
        Ball[] balls=new Ball[45];

        for(int i=0; i<45; i++){
            balls[i]=new Ball(i+1);
        }

        //인터페이스는 인스턴스가 될 수 없지만 참조타입은 될 수 있다.
        LottoMachine lottomachine=new LottoMachineIMPL();
        lottomachine.setBalls(balls);
        lottomachine.mix();
        Ball[] result=lottomachine.getBalls();

        for(int i=0; i<result.length; i++){
            System.out.println(result[i].getNumber());
        }
    }
}
