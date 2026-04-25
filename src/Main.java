public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 17, 88);
        Student student2 = new Student("Alesha", 18, 93);
        Student student3 = new Student("Eldar", 18, 99);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student1.isExcellent());
        System.out.println(student2.isExcellent());
        System.out.println(student3.isExcellent());

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(300);
        System.out.println(bankAccount.getBalance());
    }
}
