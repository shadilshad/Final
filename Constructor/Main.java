import java.util.Scanner;

class Student {

    int id;
    String name;
    int age;
    String department;
    double cgpa;

    Student() {
        id = 0;
        name = "Not Assigned";
        age = 0;
        department = "Unknown";
        cgpa = 0.0;
    }


    Student(int id, String name, int age, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.cgpa = cgpa;
    }

    // Constructor Overloading
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        age = 18;
        department = "CSE";
        cgpa = 7.5;
    }

    
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
        this.department = s.department;
        this.cgpa = s.cgpa;
    }

    void display() {
        System.out.println("-----------------------------");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("CGPA       : " + cgpa);
    }

    void isEligible() {
        if (cgpa >= 7.5)
            System.out.println(name + " is Eligible for Placement.");
        else
            System.out.println(name + " is Not Eligible for Placement.");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Details");

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("CGPA: ");
        double cgpa = sc.nextDouble();

    
        Student s1 = new Student(id, name, age, dept, cgpa);

        Student s2 = new Student();

        Student s3 = new Student(102, "Alex");
 
        Student s4 = new Student(s1);

        System.out.println("\nStudent 1");
        s1.display();
        s1.isEligible();

        System.out.println("\nStudent 2");
        s2.display();
        s2.isEligible();

        System.out.println("\nStudent 3");
        s3.display();
        s3.isEligible();

        System.out.println("\nStudent 4 (Copy of Student 1)");
        s4.display();
        s4.isEligible();

        sc.close();
    }
}