package com.haohao.demo03;

/*
If a member variable uses the static keyword, the variable no longer belongs to the object itself, but to the class it belongs to.
Multiple objects share the same data.
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("XiaoMing",19);
        Student.classroom = "classroom101";
        Student two = new Student("LiHua",16);

        System.out.println("Name:" + one.getName() + ", Age:" + one.getAge()
                + ", Classroom:" + Student.classroom + ", ID:" + one.getId());
        System.out.println("Name:" + two.getName() + ", Age:" + two.getAge()
                + ", Classroom:" + Student.classroom + ", ID:" + two.getId());
    }
}
