public class StringExam {

    public static void main(String[] args) {


        //String은 불변 클래스

        String s1="hello";
        String s2="hello";
        String s3=new String("hello");//new가 쓰이면 메모리상에 새로운 객체 생성
        String s4=new String("hello");

        //s1,s2의 경우 같은 객체,
        if(s1==s2){//==는 같은 것을 참조 하냐는 뜻
            System.out.println("ok");
        }
        if(s1==s3){
            System.out.println("k0");
        }
        if(s1==s4){
            System.out.println("o0p");
        }
        //단순 값이 같은지 묻는 것
        if(s1.equals(s4)){
            System.out.println("o0p");
        }



    }
}
