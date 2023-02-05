package com.example;

//1~45까지 써있는 Ball을 로또 기계에 넣는다.
//로또 기계에 있는 Ball들을 섞는다.
//섞인 Ball중에서 6개를 꺼낸다.
public interface LottoMachine {

    //인터페이스의 모든 필드들은 public static
    int Max_Ball_Count=45;
    int Return_Ball_Count=6;

    //인터페이스의 메소드는 전부 추상메소드
    public void setBalls(Ball[] balls);
    public void mix();
    public Ball[] getBalls();
    
}
