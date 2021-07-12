public class Main {

    public static void main(String[] args)
    {

        Student student1 = new Student("Sophie",  "CS-2",14);
        Student student2 = new Student("Sophie",  "CS-2",14);
        Student student3 = new Student("Ann",  "CS-2",14);
        System.out.println("Student1 hashCode: "+student1.hashCode());
        System.out.println("Student2 hashCode: "+student2.hashCode());
        System.out.println("Student3 hashCode: "+student3.hashCode());
        System.out.println("Student1 equals student2 : "+student1.equals(student2));
        System.out.println("Student1 equals student3 : "+student1.equals(student3));


      }
}
