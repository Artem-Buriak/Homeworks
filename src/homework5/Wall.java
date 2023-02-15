package homework5;

public class Wall extends Barrier{

    String type = "стіну висотою ";

    public Wall(int param) {
        super(param);
        this.param = param;
    }

    public boolean overcome(Member member) {
        if (member.maxJump >= param) {
            System.out.println(member.type+" "+member.name+ " здолав "+type+param);
            return true;
        } else {
            System.out.println(member.type+" "+member.name+ " не зміг здолати "+type+param);
            return false;
        }
    }
}
