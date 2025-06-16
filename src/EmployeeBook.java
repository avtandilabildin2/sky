import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees=new Employee[10];
    private int counter=0;
    public void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length ; i++) {
            System.out.println(employees[i]);
        }
    }
    public void sumOfSalary(Employee[] employees) {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getSalary();
        }
        System.out.println("Сумма зарплат: "+sum);
    }
    public void minimumSalary(Employee[] employees) {
        int minimumSalary=employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary()<minimumSalary) {
                minimumSalary=employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: "+minimumSalary);
    }
    public void maximumSalary(Employee[] employees) {
        int maximumSalary=employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary()>maximumSalary) {
                maximumSalary=employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: "+maximumSalary);
    }
    public void averageSalary(Employee[] employees) {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getSalary();
        }
        int averageSalary=sum/employees.length;
        System.out.println("Среднее значение зарплат: "+averageSalary);
    }
    public void nameMiddleNameSurname(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName()+" "+employees[i].getMiddleName()+" "+employees[i].getSurname());
        }
    }
    public void percentageSalary(Employee[] employees, int percentage) {
        for (int i = 0; i < employees.length; i++) {
            int percent=employees[i].getSalary()*10/100;
            int result=employees[i].getSalary()+percent;
            employees[i].setSalary(result);
        }
    }
    public void minSalaryDepartment(Employee[] employees, int department) {
        int minSalary=employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                if(employees[i].getSalary()<minSalary) {
                    minSalary=employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе: "+minSalary);
    }
    public void maxSalaryDepartment(Employee[] employees, int department) {
        int maxSalary=employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                if(employees[i].getSalary()>maxSalary) {
                    maxSalary=employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата по отделу: "+maxSalary);
    }
    public void sumSalaryDepartment(Employee[] employees, int department) {
        int sumSalary=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                sumSalary+=employees[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат: "+sumSalary);
    }
    public void averageSalaryDepartment(Employee[] employees, int department) {
        int count = 0;
        int sumSalary=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                count++;
                sumSalary+=employees[i].getSalary();
            }
        }
        int averageSalary=sumSalary/count;
        System.out.println("Средняя зарплата по отделу: "+averageSalary);
    }
    public void percentageSalaryDepartment(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                int percent=employees[i].getSalary()*10/100;
                int result=employees[i].getSalary()+percent;
                employees[i].setSalary(result);
            }
        }
    }
    public void printEmployeesOfDepartment(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public void lessThan(Employee[] employees,int salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()<salary) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public void moreThan(Employee[] employees,int salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()>=salary) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public boolean addEmployee(Employee employee) {
        employees[counter]=employee;
        counter++;
        if(counter==employees.length) {
            return false;
        }
        return true;
    }
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId()==id) {
                employees[i]=null;
            }
        }
    }
    public Employee getEmployee(int id) {
        return employees[id];
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof EmployeeBook that)) return false;

        return Arrays.equals(employees, that.employees);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(employees);
    }

    @Override
    public String toString() {
        return "EmployeeBook{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
