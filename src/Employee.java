import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String middleName;
    private String surname;
    private int department;
    private int salary;

    public Employee(String name, int department, String surname, String middleName,int salary) {
        this.name = name;
        this.department = department;
        this.surname = surname;
        this.middleName = middleName;
        this.salary=salary;
        this.id++;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;

        return department == employee.department && Objects.equals(name, employee.name) && Objects.equals(middleName, employee.middleName) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(middleName);
        result = 31 * result + Objects.hashCode(surname);
        result = 31 * result + department;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{"
                +"id="+id+
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +'\''+
                ", department=" + department +
                '}';
    }
    public String withoutDep() {
        return id + " " + name + " " + middleName + " " + surname+" "+salary;
    }
}
