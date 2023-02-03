public class Ca2Exam {
    public static void main(String[] args) {
//        Ca2 cc2=new Ca2("yaha");

        Bus2 bb2=new Bus2();
        bb2.run();

        SportsCar s1=new SportsCar("booya!");
        s1.run();


        Ca2[] array=new Ca2[2];
        array[0]=new Bus2();
        array[1]=new SportsCar("SpCAR");

        for(Ca2 cc2:array){
            cc2.run();
        }


    }
}
