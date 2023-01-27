package Week1;

public class Main10 {

    int employeeId;
    int salary;
    String dept;

    Main10(int empid, int sal,String d) {
        employeeId = empid;
        salary = sal;
        dept = d;
    }


    public static void main(String[] args) {
        Main10 harsha = new Main10(101,3000,"Testing");
        Main10 varsha = new Main10(102,5000,"Engineering");
        System.out.println(harsha.employeeId + " Salary "+harsha.salary+" Dept "+harsha.dept);
        System.out.println(varsha.employeeId + " Salary "+varsha.salary+" Dept "+varsha.dept);

    }
}
