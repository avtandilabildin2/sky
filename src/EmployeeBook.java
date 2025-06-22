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
    public int getSum() {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null) {
                sum+=employees[i].getSalary();
            }
        }
        return sum;
    }
    public Employee getMinimumSalaryEmployee() {
       Employee minSalaryEmployee=null;
       for (int i = 0; i < employees.length; i++) {
           if(minSalaryEmployee  == null || employees[i] != null && employees[i].getSalary() < minSalaryEmployee.getSalary()){
               minSalaryEmployee   = employees[i];
           }
       }
       return minSalaryEmployee;
    }
    public Employee getMaximumSalaryEmployee() {
        Employee maxSalaryEmployee=null;
        for (int i = 0; i < employees.length; i++) {
            if(maxSalaryEmployee  == null || employees[i] != null && employees[i].getSalary() >maxSalaryEmployee.getSalary()){
                maxSalaryEmployee   = employees[i];
            }
        }

        return maxSalaryEmployee;

    }
    public void getAverageSalary() {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i]!=null) {
                sum+=employees[i].getSalary();
            }
        }
        int averageSalary=sum/employees.length;
        System.out.println("Среднее значение зарплат: "+averageSalary);
    }
    public void printNameMiddleNameSurname() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName()+" "+employees[i].getMiddleName()+" "+employees[i].getSurname());
        }
    }
    public void printPercentageSalary(int percentage) {
        for (int i = 0; i < employees.length; i++) {
            int percent=employees[i].getSalary()*10/100;
            int result=employees[i].getSalary()+percent;
            employees[i].setSalary(result);
        }
    }
    public void getMinSalaryInDepartment(int department) {

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
    public void getMaxSalaryInDepartment(int department) {
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
    public void printSumSalaryDepartment(int department) {
        int sumSalary=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                sumSalary+=employees[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат: "+sumSalary);
    }
    public void printAverageSalaryInDepartment( int department) {
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
    public void getPercentageSalaryDepartment(int department) {
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
    public void getMinThan(int salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()<salary&&employees[i]!=null) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public void getMaxSalary(int salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()>=salary) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public boolean addEmployee(Employee employee) {
        if(counter==employees.length) {
            return false;
        }
        if(employees[counter]!=null) {
            employees[counter]=employee;
            counter++;
            return true;
        }
        return false;
    }
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId()==id) {
                employees[i]=null;
                counter--;
            }
        }

    }
    public Employee getEmployee(int id) {
        Employee temp=null;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null&&employees[i].getId()==id) {
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
