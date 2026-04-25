public class Student {
    private String name;
    private int age;
    private int grade;
    public Student(String name, int age, int grade) {
        if (name.isEmpty() || age <= 0 || grade < 0 || grade > 100) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public boolean isExcellent() {
        if (grade >= 90) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
}
