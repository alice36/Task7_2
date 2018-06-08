public class School {
    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", "Poznań", 5.2);
        student.printInfo();

        Teacher teacher = new Teacher("Izabela", "Nowak", "IT", 2500);
        teacher.printInfo();
    }
}
