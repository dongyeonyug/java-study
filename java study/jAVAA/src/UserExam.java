public class UserExam {

    public static void main(String[] args) {
        User u1=new User("22@do.com","park");

        System.out.println(u1);

        System.out.println(u1.getEmail());
        System.out.println(u1.getName());
        System.out.println(u1.getPassword());

        User u2=new User("22@do.com","park","323");

        System.out.println(u2);

        System.out.println(u2.getEmail());
        System.out.println(u2.getName());
        System.out.println(u2.getPassword());

    }
}
