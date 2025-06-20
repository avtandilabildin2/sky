import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees=new Employee[10];
    private int counter=0;
    public void printAllEmployees() {
        for (int i = 0; i < employees.length ; i++) {
           if (employees[i]!=null) {
               System.out.println(employees[i]);
           }
        }
    }
    public int printSumOfSalary() {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null) {
                sum+=employees[i].getSalary();
            }
        }
        return sum;
    }
    public Employee minimumSalary() {
        Employee temp=null;
        if(employees[0]!=null) {
            temp=employees[0];
        }
        int minimumSalary=employees[0].getSalary();
        int index=0;
        for (int i = 1; i < employees.length; i++) {
            if(employees[i]!=null&&employees[i].getSalary()<minimumSalary){
                minimumSalary=employees[i].getSalary();
                index = i;
            }
        }
        temp=employees[index];
        return temp;
    }
    public Employee maximumSalary() {
        Employee temp=null;
        int index=0;
        int maximumSalary=employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary()>maximumSalary&&employees[i]!=null) {
                maximumSalary=employees[i].getSalary();
                index = i;
            }
        }
        temp=employees[index];
        return temp;


    }
    public void averageSalary() {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getSalary();
        }
        int averageSalary=sum/employees.length;
        System.out.println("Среднее значение зарплат: "+averageSalary);
    }
    public void nameMiddleNameSurname() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName()+" "+employees[i].getMiddleName()+" "+employees[i].getSurname());
        }
    }
    public void percentageSalary(int percentage) {
        for (int i = 0; i < employees.length; i++) {
            int percent=employees[i].getSalary()*10/100;
            int result=employees[i].getSalary()+percent;
            employees[i].setSalary(result);
        }
    }
    public void minSalaryDepartment(int department) {

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
    public void maxSalaryDepartment(int department) {
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
    public void sumSalaryDepartment(int department) {
        int sumSalary=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                sumSalary+=employees[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат: "+sumSalary);
    }
    public void averageSalaryDepartment( int department) {
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
    public void percentageSalaryDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                int percent=employees[i].getSalary()*10/100;
                int result=employees[i].getSalary()+percent;
                employees[i].setSalary(result);
            }
        }
    }
    public void printEmployeesOfDepartment( int department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public void lessThan(int salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()<salary) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public void moreThan(int salary){
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
        Employee temp=null;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId()==id&&employees[i]!=null) {
                temp=employees[i];
            }
        }
        return temp;
    }


    public int getCounter() {
        return counter;
    }
    @Override
    public String toString() {
        return "EmployeeBook{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
