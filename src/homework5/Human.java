package homework5;

public class Human extends Member{

    public Human(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.type = "Людина";
    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }
}
