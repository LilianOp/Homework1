package HW6.online;

public class Cats extends Animals {
    public Cats(String name) {
        super(name);
        this.runMax = 200;
        this.swimMax = 0;
    }


    @Override
    public void swimming(int swim) {
        System.out.println(name + " не умеет плавать!");

    }
}