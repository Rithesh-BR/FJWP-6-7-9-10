class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.displayInfo();

        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;
        student2.displayInfo();
    }
}
