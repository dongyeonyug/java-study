public class Array {

    public static void main(String[] args) {

        int[] array1=new int[5];
        for(int i=0;i<5;i++){
            array1[i]=i+1;
        }

        int[]array2=new int[]{1,2,3,4,5};
        int[]array3={2,3,4,5,6};

        for(int i=0;i<5;i++){
            System.out.println(array1[i]);
        }

        System.out.println("-----------");

        for(int i=0;i<5;i++){
            System.out.println(array2[i]);
        }

        System.out.println("-----------");

        for(int i=0;i<5;i++){
            System.out.println(array3[i]);
        }

    }
}
