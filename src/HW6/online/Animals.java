package HW6.online;

public abstract class Animals {

    protected String name;
    protected int runMax;
    protected int swimMax;

    public Animals(String name) {
    this.name = name;

}
String getName(){
        return this.name;
}

int getRun() {
        return this.runMax;
}
int getSwim() {
        return this.swimMax;
}

public void running(int distanceRun) {
        if(runMax >= distanceRun ) {
            System.out.println(name + " пробежал " + distanceRun + " метров");
        } else System.out.println("Попробуйте ввести другое значение.");

}
public void swimming (int distanceSwim) {
    if(swimMax >= distanceSwim ) {
        System.out.println(name + " проплыл " + distanceSwim + " метров");
    } else System.out.println("Попробуйте ввести другое значение.");
}


}
