import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {
        List<student> Students = Arrays.asList(new student("Alok", 22, 92, "Arts"),
                new student("Rohit", 25, 85, "science"),
                new student("Sunil", 27, 80, "Arts"),
                new student("vivek", 23, 77, "Science"));
        Map< String , student> studentMap = Students.stream().collect(Collectors.toMap(student :: getName, Function.identity()) );
        System.out.println(studentMap);
    }
}
    class student{
        private String name;
        private int Roll_no;
        private int Marks;
        private String Section;

        public student(String name, int roll_no, int marks, String section) {
            this.name = name;
            Roll_no = roll_no;
            Marks = marks;
            Section = section;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll_no() {
            return Roll_no;
        }

        public void setRoll_no(int roll_no) {
            Roll_no = roll_no;
        }

        public int getMarks() {
            return Marks;
        }

        public void setMarks(int marks) {
            Marks = marks;
        }

        public String getSection() {
            return Section;
        }

        public void setSection(String section) {
            Section = section;
        }

        @Override
        public String toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", Roll_no=" + Roll_no +
                    ", Marks=" + Marks +
                    ", Section='" + Section + '\'' +
                    '}';
        }
    }
