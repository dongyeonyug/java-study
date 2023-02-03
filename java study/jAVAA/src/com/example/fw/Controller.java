package com.example.fw;

public abstract class Controller {

    protected void init(){
        System.out.println("초기화");
    }

    protected void close(){
        System.out.println("마무리하는 코드");

    }

    public abstract void run();

    //내가 가지고 있는 메소드를 호출
    //어떤 순서를 갖고 있다. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init();
        this.run();
        this.close();
    }
}
