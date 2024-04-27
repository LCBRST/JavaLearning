package otherSrc.Exp;

import java.util.ArrayList;
import java.util.List;

// 定义抽象类表示人类
abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    // 抽象方法，不同类型的人可能有不同的行为
    abstract void action();
}

// 定义接口表示地点类
interface Location {
    String getLocationName();
}

// 大学类实现地点接口，表示大学地点
class University implements Location {
    String name;
    List<Course> courses;
    List<Teacher> teachers;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    @Override
    public String getLocationName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}

// 课程类，表示大学开设的课程
class Course {
    String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// 教师类，表示大学的教师
class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// 学生类继承自人类，同时实现接口，表示一个学生
class Student extends Person implements Location {
    String locationName;

    public Student(String name) {
        super(name);
    }

    // 重载父类方法
    @Override
    void action() {
        System.out.println(name + "在" + locationName + "上大学");
    }

    // 实现接口方法
    @Override
    public String getLocationName() {
        return locationName;
    }

    // 多态，通过参数类型不同实现不同的行为
    void setLocation(Location location) {
        this.locationName = location.getLocationName();
    }
}

// 测试类
public class Test {
    public static void main(String[] args) {
        University university = new University("湛江大学");
        Student xiaoming = new Student("小明");
        xiaoming.setLocation(university);
        xiaoming.action();

        Course math = new Course("数学");
        Teacher teacher = new Teacher("张老师");
        university.addCourse(math);
        university.addTeacher(teacher);

        System.out.println(university.getName() + "开设了课程：" + university.getCourses().get(0).getName());
        System.out.println(university.getName() + "的教师有：" + university.getTeachers().get(0).getName());
    }
}
