
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("0001", "John","Doe",8000);

        System.out.println(employee1.toString());
        System.out.println("\n" + employee1.introduceYourself());

        Employee employee2 = new Developer("0002", "Jane","Doe", 10000, "Java", 5);
        System.out.println(employee2.toString());
        System.out.println("\n" + employee2.introduceYourself());

        Employee employee3 = new Tester ("0003", "Nolan", "Grayson", 9000, true, 20);
        System.out.println(employee3.toString());
        System.out.println("\n" + employee3.introduceYourself());
    }
}
