package homework5;

public abstract class Barrier {

    protected int param;

    protected Barrier(int param) {
        this.param = param;
    }

    public abstract boolean overcome(Member member);
}
