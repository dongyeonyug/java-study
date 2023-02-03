package com.example.myproject;


import com.example.fw.Controller;

public class FirstControler extends Controller {

    //추상클래스를 상속받으면 반드시 추상메소드를 오버라이딩 해야 한다.
    @Override
    public void run() {
        System.out.println("d11");

    }
}
