import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Employee_detail {

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("Alok",22,"mumbai",25000),
                new Employee("Rohit",25,"noida",30000),
                new Employee("Sunil",27,"Delhi",35000),
                new Employee("vivek",23,"bihar",2000));
        List<Integer> money= emp.stream().filter(p -> p.getSalary() >20000).map(u -> u.getSalary()).collect(Collectors.toList());
        System.out.println("Salary of employee is "+ money);

    }
}

    class Employee {

        private String Emp_name;
        private int Emp_age;
        private String Emp_zone;
        private int salary;
        //public Object displayEmp_name;

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "Emp_name='" + Emp_name + '\'' +
                    ", Emp_age=" + Emp_age +
                    ", Emp_zone='" + Emp_zone + '\'' +
                    ", salary=" + salary +
                    '}';
        }


        public Employee(String emp_name, int emp_age, String emp_zone, int salary) {
            Emp_name = emp_name;
            Emp_age = emp_age;
            Emp_zone = emp_zone;
            this.salary = salary;




        }
    }

