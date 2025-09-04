package testselenium.com.Bai2OOP;

// Employee (abstract class) co code chung (displayInfo()) logic bắt buộc (calculateBonus()).
// Workable (interface) quy định hành vi chung (tất cả nhân viên đều phải work()),
// nhưng cách làm khác nhau.
// Developer và Tester vừa chia sẻ code chung từ abstract class,
// vừa tuân theo hợp đồng từ interface.

// Interface
interface Workable {
    void work();
}

// Abstract class
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method
    abstract double calculateBonus();

    // Normal method
    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

// Developer class
class Developer extends Employee implements Workable {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.1; // 10% bonus
    }

    @Override
    public void work() {
        System.out.println("Developer is coding");
    }
}

// Tester class
class Tester extends Employee implements Workable {
    Tester(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.05; // 5% bonus
    }

    @Override
    public void work() {
        System.out.println("Tester is testing");
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Employee dev = new Developer("Alice", 5000);
        Employee tester = new Tester("Bob", 4000);

        dev.displayInfo();
        System.out.println("Bonus: " + dev.calculateBonus());
        ((Workable) dev).work(); // cast sang interface để gọi work()

        System.out.println();

        tester.displayInfo();
        System.out.println("Bonus: " + tester.calculateBonus());
        ((Workable) tester).work();
    }
}
