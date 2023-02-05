//Bus는 Car를 상속
public class Bus extends Car{

    public void move(){
        System.out.println("KickBack");
    }

    public void sound(){
        System.out.println("안내방송 입니다.");
    }
}
