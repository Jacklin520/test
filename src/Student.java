import java.util.Objects;

/**
 * @Author: jacklin
 * @Date: 2019/10/13 22:56
 * @Version 1.0
 */
public class Student {
    private String name;
    private  int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
//        Student s1 =new Student("小明",10);
////        Student s2 =new Student("小明",10);
////        System.out.println(s1.hashCode());
////        System.out.println(s2.hashCode());
        StringBuffer s1= new StringBuffer("linzhe");
        s1.append("sb");
        System.out.println(s1);
    }
}
