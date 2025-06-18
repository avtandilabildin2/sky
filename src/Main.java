public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee employee1=new Employee("employee1",1,"employee1","employee1",12_000,1);
        Employee employee2=new Employee("employee2",2,"employee2","employee2",12_000,2);
        Employee employee3=new Employee("employee3",3,"employee3","employee3",12_000,3);
        Employee employee4=new Employee("employee4",4,"employee4","employee4",12_000,4);
        Employee employee5=new Employee("employee5",5,"employee5","employee5",12_000,5);
        Employee employee6=new Employee("employee6",1,"employee6","employee6",12_000,6);
        Employee employee7=new Employee("employee7",2,"employee7","employee7",12_000,7);
        Employee employee8=new Employee("employee8",3,"employee8","employee8",12_000,8);
        Employee employee9=new Employee("employee9",4,"employee9","employee9",12_000,9);
        Employee employee10=new Employee("employee10",5,"employee10","employee10",12_000,10);
        employees[0]=employee1;
        employees[1]=employee2;
        employees[2]=employee3;
        employees[3]=employee4;
        employees[4]=employee5;
        employees[5]=employee6;
        employees[6]=employee7;
        employees[7]=employee8;
        employees[8]=employee9;
        employees[9]=employee10;
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(employees[0]);
        employeeBook.addEmployee(employees[1]);
        employeeBook.addEmployee(employees[2]);
        employeeBook.addEmployee(employees[3]);
        employeeBook.addEmployee(employees[4]);
        employeeBook.addEmployee(employees[5]);
        employeeBook.addEmployee(employees[6]);
        employeeBook.addEmployee(employees[7]);
        employeeBook.addEmployee(employees[8]);
        employeeBook.addEmployee(employees[9]);
    }
    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length ; i++) {
            System.out.println(employees[i]);
        }
    }
    public static void sumOfSalary(Employee[] employees) {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getSalary();
        }
        System.out.println("Сумма зарплат: "+sum);
    }
    public static void minimumSalary(Employee[] employees) {
        int minimumSalary=employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary()<minimumSalary) {
                minimumSalary=employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: "+minimumSalary);
    }
    public static void maximumSalary(Employee[] employees) {
        int maximumSalary=employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary()>maximumSalary) {
                maximumSalary=employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: "+maximumSalary);
    }
    public static void averageSalary(Employee[] employees) {
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getSalary();
        }
        int averageSalary=sum/employees.length;
        System.out.println("Среднее значение зарплат: "+averageSalary);
    }
    public static void nameMiddleNameSurname(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName()+" "+employees[i].getMiddleName()+" "+employees[i].getSurname());
        }
    }
    public static void percentageSalary(Employee[] employees, int percentage) {
        for (int i = 0; i < employees.length; i++) {
            int percent=employees[i].getSalary()*10/100;
            int result=employees[i].getSalary()+percent;
            employees[i].setSalary(result);
        }
    }
    public static void minSalaryDepartment(Employee[] employees, int department) {
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
    public static void maxSalaryDepartment(Employee[] employees, int department) {
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
    public static void sumSalaryDepartment(Employee[] employees, int department) {
        int sumSalary=0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                sumSalary+=employees[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат: "+sumSalary);
    }
    public static void averageSalaryDepartment(Employee[] employees, int department) {
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
    public static void percentageSalaryDepartment(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                int percent=employees[i].getSalary()*10/100;
                int result=employees[i].getSalary()+percent;
                employees[i].setSalary(result);
            }
        }
    }
    public static void printEmployeesOfDepartment(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment()==department) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public static void lessThan(Employee[] employees,int salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()<salary) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
    public static void moreThan(Employee[] employees,int salary){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()>=salary) {
                System.out.println(employees[i].withoutDep());
            }
        }
    }
}
