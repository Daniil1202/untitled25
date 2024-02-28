public class Employees implements Comparable {
    private String name;
    private int serviceNumber;
    private String phoneNumber;
    private int workExperience;

    public Employees(String name, int serviceNumber, String phoneNumber, int workExperience) {
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.phoneNumber = phoneNumber;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public int compareTo(Object o) {
        return hashCode() - o.hashCode();
    }

    @Override
    public String toString() {
        return "Employees{" +
                " Имя сотрудника = '" + name + '\'' +
                ", табельный номер = " + serviceNumber +
                ", номер телефона = '" + phoneNumber + '\'' +
                ", стаж работы = " + workExperience +
                '}';
    }
}
