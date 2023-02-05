public class Array2 {

    public static void main(String[] args) {

        ItemForArray[] array1;
        ItemForArray array2[];

        array1=new ItemForArray[5];
        array2=new ItemForArray[5];

        array1[0]=new ItemForArray(500,"item01");
        array2[1]=new ItemForArray(1000,"item02");

        ItemForArray array3[]={new ItemForArray(507,"apple"),new ItemForArray(343,"banana")};

        System.out.println(array1[0].getName());
        System.out.println(array1[0].getPrice());
        System.out.println(array2[1].getName());
        System.out.println(array2[1].getPrice());
        System.out.println(array3[0].getPrice());
        System.out.println(array3[1].getPrice());

    }

}