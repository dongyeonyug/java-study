public class Forjava {
    public static void main(String[] args) {
    //use label
        outer:
        for(int i=0; i<3; i++){
            for(int k=0; k<4; k++){
                if(i==0 && k==2)
                    continue outer;
                    System.out.println(i+","+k);

            }
        }

    }
}
