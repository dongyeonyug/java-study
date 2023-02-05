public class VendingMachine {
    //field(가지는 것들)
    //생성자
    //method

    public String pushProductButton(int menuID){

        String juice="";

        switch (menuID){

            case 1:
                juice= "coke";
                break;
            case 2:
                juice= "soda";
                break;
            case 3:
                juice= "fanta";
                break;
            default:
                break;
        }
        return juice;
    }


    public static void printversion(){
        System.out.println("v1.0");
    }
}
