package HW5;

public class Worker {
    private String fio;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Worker (String fio, String position, String email, String telephone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
        System.out.println("FIO: " + fio);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Telephone number: " + telephone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    String getFio() {
        return this.fio;
    }
    String getPosition() {
        return this.position;
    }
    String getEmail() {
        return this.email;
    }
    String getTelephone() {
        return this.telephone;
    }
    int getSalary() {
        return this.salary;
    }
    int getAge() {
        return this.age;
    }

}
