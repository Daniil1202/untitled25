import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();

        employeesList.add(new Employees("Константин", 2, "231133", 5));
        employeesList.add(new Employees("Василий", 4, "231133", 9));
        employeesList.add(new Employees("Илья", 3, "231133", 2));
        employeesList.add(new Employees("Алексей", 7, "231133", 4));

        for (Employees employees: employeesList){
            System.out.println(employees);
        }
        System.out.println(employeesList.);





    }

}