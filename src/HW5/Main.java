package HW5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Pushkin A S", "Director", "pushkin@mail.ru", "+79651234569", 100000, 222);
        Worker worker2 = new Worker("Ivanov I I", "manager", "ivanov@mail.ru", "+79654565874", 35000, 25);
        System.out.println("---------------------------");


        Worker[] persons = new Worker[5];

        {
            persons[0] = new Worker("Pushkin A S", "Director", "pushkin@mail.ru", "+79651234569", 100000, 222);
            persons[1] = new Worker("Ivanov I I", "manager", "ivanov@mail.ru", "+79654565874", 35000, 25);
            persons[2] = new Worker("Petrov P P", "manager", "petrov@mail.ru", "+8546525145", 40000, 30);
            persons[3] = new Worker("Sidorov S S", "manager", "sidorov@mail.ru", "+8546525146", 45000, 35);
            persons[4] = new Worker("Siglov S S", "manager", "siglov@mail.ru", "+8546525147", 50000, 41);
        };
    printArray(persons);
    }



        public static void printArray (Worker[]persons){
            System.out.println("40.: ");
            for (int i = 0; i < 5; i++)
                if (persons[i].getAge() > 40) {
                    System.out.println(persons[i].getFio());
                    System.out.println(persons[i].getPosition());
                    System.out.println(persons[i].getEmail());
                    System.out.println(persons[i].getTelephone());
                    System.out.println(persons[i].getSalary());
                    System.out.println(persons[i].getAge());
                }

        }

    }


