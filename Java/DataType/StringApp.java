public class StringApp {
 
    public static void main(String[] args) {
         
        // Character VS String 
        System.out.println("Hello World"); // String-->""
        System.out.println('H'); // Character-->''
    //  System.out.println('Hello world'); // error ''는 string(문자열)이 아닌 Character(문자)
        System.out.println("H"); 
     
        System.out.println("Hello "
                + "World");
         
        // new line
        System.out.println("Hello \nWorld");
         
        // escape
        System.out.println("Hello \"World\"");// Hello "World"
    }
 
}