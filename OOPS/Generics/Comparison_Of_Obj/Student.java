package OOPS.Generics.Comparison_Of_Obj;

public class Student implements Comparable<Student> {

    String name;
    float marks;

    public Student(float marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks - o.marks);

//        if(diff==0 then both are equal)
//            if not then
//                if diff >0 old has less marks
//                otherwise old has more marks

        return diff;
    }
}
