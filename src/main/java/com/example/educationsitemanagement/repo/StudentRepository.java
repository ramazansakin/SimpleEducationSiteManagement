package com.example.educationsitemanagement.repo;

import com.example.educationsitemanagement.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

// Cloneable -> Marker Interface
public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    {
        students.addAll(
                Arrays.asList(
                        new Student("John", "Doe",
                                "Im Software Developer , 32 years-old, bla-bla", null, true),
                        new Student("Alice", "Brown",
                                "Im Mechanical Developer , 25 years-old, bla-bla", null, true),
                        new Student("John", "Smith",
                                "Im Software Developer , 32 years-old, bla-bla", null, true),
                        new Student("Allie", "Curd",
                                "Im Software Developer , 32 years-old, bla-bla", null, true),
                        new Student("Micheal", "Sarky",
                                "Im Software Developer , 32 years-old, bla-bla", null, true),
                        new Student("John2", "Doe",
                                "Im Software Developer , 32 years-old, bla-bla", null, true),
                        new Student("Alice2", "Brown",
                                "Im Mechanical Developer , 25 years-old, bla-bla", null, true),
                        new Student("John2", "Smith",
                                "Im Software Developer , 32 years-old, bla-bla", null, true),
                        new Student("Allie2", "Curd",
                                "Im Software Developer , 32 years-old, bla-bla", null, true),
                        new Student("Micheal2", "Sarky",
                                "Im Software Developer , 32 years-old, bla-bla", null, true)

                )
        );
    }

    // CRUD -> Create, Read, Update, Delete
    public Student getById(Integer id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAll() {
        return students;
    }

    public boolean create(Student student) {
        boolean isAdded = students.add(student);
        return isAdded;
    }

    // create method with just Student then add id
    public Student update(Student student, int id) throws CloneNotSupportedException {
        Student byId = getById(id);
        if (byId == null) {
            return null;
        }
        // 4 ways to update the object
        // 1. directly reference to the incoming object
//        byId = student;

        // 2. copy constructor
//        byId = new Student(student);

        // 3. Clone
//        Object clone = student.clone();
//        getById(id) = (Student) clone;

        // Clone vs Copy Constructor
        // - The copy constructor is much easier to implement. We do not need to implement the Cloneable interface and handle CloneNotSupportedException.
        // - The clone method returns a general Object reference. Therefore, we need to typecast it to the appropriate type.
        // - We can not assign a value to a final field in the clone method. However, we can do so in the copy constructor.


        // 4. Manuel mapping
        // PUT vs PATCH Http Methods
        byId.setName(student.getName());
        byId.setSurname(student.getSurname());
        byId.setAbout(student.getAbout());

        return byId;
    }

    public boolean delete(Integer id) {
        Student byId = getById(id);
        if (byId == null)
            return false;

        boolean isRemoved = students.remove(byId);
        return isRemoved;
    }

    public static void main(String[] args) {
        // static methods, static variables can be used without an object
        StudentRepository repository = new StudentRepository();

//        // test-1 getById
//        Student byId = repository.getById(1);
//        System.out.println(byId);
//
//        // test-2 getById
//        byId = repository.getById(12);
//        System.out.println(byId);

//        // test-1 getAll
//        List<Student> all = repository.getAll();
//        System.out.println(all);

//        // test-1 create
//        List<Course> courses = new ArrayList<>();
//        courses.addAll(Arrays.asList(
//                new Course("Learn Python: The Complete Python Programming Course",
//                        "Learn A-Z everything about Python, from the basics, to advanced topics like Python GUI, Python Data Analysis, and more!",
//                        49.99, 1000, 700, 8.5, null),
//                new Course("DevOps Beginners to Advanced | Decoding DevOps with Projects",
//                        "Begin DevOps Career As an Absolute Beginner | Linux, AWS, Scripting, Jenkins, Ansible, Docker, K8s, N-Tier Projects",
//                        69.99, 500, 350, 7.8, null)
//        ));
//        Student student = new Student("Test", "Surname", "Some spesific details", courses);
//        boolean isNewStudentCreated = repository.create(student);
//        if (isNewStudentCreated)
//            System.out.println("New Student created successfully");
//        else
//            System.out.println("There is a problem on creating new student!");
//
//        List<Student> all = repository.getAll();
//
//        // FunctionalInterface
//        // Lambda Operations
//        // Streams
//        // Method Reference
//        // static and default methods on java8 Interface
//        Consumer<? super Student> a = (x) -> System.out.println(x); // System.out::println;
//        all.forEach(a);


        // test-1 update
        Student upStudent = new Student("Ramazan", "Sakin",
                "Im Software Developer , 32 years-old, bla-bla", null, false);

        //System.out.println(upStudent);

        try {
            Student updatedStudent = repository.update(upStudent, 1);
            if (updatedStudent == null) {
                System.out.println("Student couldnt be updated because the student has no id or " +
                        "not found on the repo!");
            } else {
                System.out.println("Updated Student : " + updatedStudent);
                System.out.println("All Students:");

                MyStudentIterable myStudentIterable = new MyStudentIterable(repository.getAll());
                myStudentIterable.forEach( student -> System.out.println("Student : " + student) );

            }

        } catch (CloneNotSupportedException e) {
            System.err.println("A problem occurred while updating a student!");
        }


//        // typo fix
//        // test-1 delete - successfull case
//        int id = 1;
//        // Auto-boxing / unboxing
//        // auto-casting
//        boolean isDeleted = repository.delete(id);
//        if (isDeleted)
//            System.out.println("Current Student by Id " + id + " deleted successfully");
//        else
//            System.out.println("There is a problem on deleting the student by id : " + id);
//
//        List<Student> all = repository.getAll();
//        Consumer<? super Student> a = (x) -> System.out.println(x); // System.out::println;
//        all.forEach(a);
//
//
//        // test-1 delete - error case
//        id = 12;
//        // Auto-boxing / unboxing
//        // auto-casting
//        isDeleted = repository.delete(id);
//        if (isDeleted)
//            System.out.println("Current Student by Id " + id + " deleted successfully");
//        else
//            System.out.println("There is a problem on deleting the student by id : " + id);
//
//        Consumer<? super Student> a2 = (x) -> System.out.println(x); // System.out::println;
//        all.forEach(a2);

    }

}


class MyStudentIterable implements Iterable<Student> {

    private List<Student> students;

    public MyStudentIterable(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        students.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return Iterable.super.spliterator();
    }
}