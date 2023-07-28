
class Student{
    int rollno;
    String name;
    int balance;
    //constructor is been created
    Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
        this.balance=balance;
    }
    void displayInformation()
    {
        System.out.println(rollno+" "+name);
    }

    void withdraw(double amount)
    {
        balance-=amount;
        System.out.println("Balance after withdraw "+balance);
    }

    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Balance after deposit "+balance);
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Student s1=new Student(111,"Karan");
        Student s2=new Student(222,"Aryan");

        s1.displayInformation();
        s2.displayInformation();

        s1.balance=1000;
        //withdraw and deposit
        s1.withdraw(50);
        s1.deposit(1000);

    }
}