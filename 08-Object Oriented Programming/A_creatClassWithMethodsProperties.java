
class Employee {

    int salary;
    String name;

    int getSalary() {
        System.out.printf("Salary is: " + salary);
        return 0;
    }

    void setName() {
        name = "Saddam Ansari";
    }

    String getName() {
        System.out.println("Hello " + name);
        return null;
    }
}

public class A_creatClassWithMethodsProperties {

    public static void main(String[] args) {
        Employee saddam = new Employee();
        saddam.salary = 41;
        saddam.name = "Ritesh";
        saddam.setName();
        saddam.getName();
        saddam.getSalary();

    }
}
