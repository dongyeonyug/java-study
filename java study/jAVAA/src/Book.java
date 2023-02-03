public class Book {


    private String title;
    private int price=0;//field price

    //필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter,getter
    //setter,getter==price property

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return this.price*2;//this는 내 자신 인스턴스->인스턴스 필드를 사용할때
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
