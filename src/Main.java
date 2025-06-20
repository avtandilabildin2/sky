public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee employee1=new Employee("employee1",1,"employee1","employee1",12_000);
        Employee employee2=new Employee("employee2",2,"employee2","employee2",12_000);
        Employee employee3=new Employee("employee3",3,"employee3","employee3",12_000);
        Employee employee4=new Employee("employee4",4,"employee4","employee4",12_000);
        Employee employee5=new Employee("employee5",5,"employee5","employee5",12_000);
        Employee employee6=new Employee("employee6",1,"employee6","employee6",12_000);
        Employee employee7=new Employee("employee7",2,"employee7","employee7",12_000);
        Employee employee8=new Employee("employee8",3,"employee8","employee8",12_000);
        Employee employee9=new Employee("employee9",4,"employee9","employee9",12_000);
        Employee employee10=new Employee("employee10",5,"employee10","employee10",12_000);
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

}
