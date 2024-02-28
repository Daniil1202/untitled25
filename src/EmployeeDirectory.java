import java.util.*;

public class EmployeeDirectory {
    private  List<Employees> employeesList;

   private EmployeeDirectory(){
       employeesList = new ArrayList<>();
   }
   public void addEmployees(Employees employees){
       employeesList.add(employees);
   }
    public List<Employees> getExperience(int workExperience){
       return employeesList.stream().filter((e) -> e.getWorkExperience() == workExperience).toList();

    }
    public List<String>  getSearchNameByPhone(String name){
       return employeesList.stream().filter((e) -> e.getName().equals(name)).map(Employees::getPhoneNumber).toList();

    }
    public Employees searchEmployeeBySeviceNumber(int serviseNumber){
       return employeesList.stream().filter((e) -> e.getServiceNumber() == serviseNumber).findFirst().orElse(null);

    }



}
