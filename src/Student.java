public class Student extends Person{
    private String city;
    private double avgAssess;

    public Student(String firstName, String lastName, String city, double avgAssess) {
        super(firstName, lastName);
        this.city = city;
        this.avgAssess = avgAssess;
    }

    public String geCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getAvgAssess() {
        return avgAssess;
    }

    public void setAvgAssess(double avgAssess) {
        this.avgAssess = avgAssess;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(city +" "+ avgAssess+ " ");
    }
}
