package homework5;

public abstract class Member {
    public String type;
    public String name;
    public int maxJump;
    public int maxRun;

    public abstract void run();
    public abstract void jump();
}
