package StreamAPI;

class Employee {
    private int id;
    private String name;
//    private String department;
    private double salary;

//    public Employee(int i, String alice, int i1){};
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

}