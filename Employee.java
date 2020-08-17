public class Employee {
    String name, address;
    int year_of_joining, salary;
    public Employee(String n, int y, int s, String a)
    {
        name=n;
        year_of_joining=y;
        salary=s;
        address=a;
    }
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Robert", 1994, 10000, "64C-WallStreet");
        Employee e2 = new Employee("Sam", 2000, 20000, "68D-WallStreet");
        Employee e3 = new Employee("John", 1999, 15000, "26B-WallStreet");
        //print info
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        System.out.println(e1.name+"\t\t"+e1.year_of_joining+"\t\t\t\t"+e1.address);
        System.out.println(e2.name+"\t\t"+e2.year_of_joining+"\t\t\t\t"+e2.address);
        System.out.println(e3.name+"\t\t"+e3.year_of_joining+"\t\t\t\t"+e3.address);
    }
}
