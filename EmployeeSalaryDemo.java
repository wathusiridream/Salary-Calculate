import java.util.Scanner;

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x;

        do {
            // รับค่า name , age , hourlyPay , hours จากผู้ใช้
            System.out.print("Enter person's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter person's age: ");
            int age = scanner.nextInt();
            System.out.print("Enter salary pay per hour: ");
            int hourlyPay = scanner.nextInt();
            System.out.print("Enter hours worked: ");
            int hours = scanner.nextInt();

            scanner.nextLine(); // ล้างบรรทัดเพิ่มเติมหลังจากการใช้ nextInt()

            Person p = new Person(name, age);
            Employee e = new Employee(name, age, hourlyPay);
            System.out.println("\n--Employee Details--");
            System.out.println(p.toString());
            System.out.println(e.toString());
            System.out.println(e.payDay(hours));

            System.out.println("Do you want to do it again? (y/n):");
            x = scanner.next().charAt(0);
            scanner.nextLine(); // ล้างบรรทัดเพิ่มเติมหลังจากการใช้ next()

        }while (x == 'y' || x == 'Y');
    }
}
