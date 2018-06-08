public class Teacher extends Person {
    private String cathedral;
    private int salary;

    public Teacher(String firstName, String lastName, String cathedral, int salary) {
        super(firstName, lastName);
        this.cathedral = cathedral;
        this.salary = salary;
    }

    public String getCathedral() {
        return cathedral;
    }

    public void setCathedral(String cathedral) {
        this.cathedral = cathedral;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(cathedral +" "+ salary);
    }
}
