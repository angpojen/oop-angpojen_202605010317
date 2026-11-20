
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ali", "001");
        Person p2 = new Student("John", "002");
        Person p3 = new Lecturer("David", "003");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
