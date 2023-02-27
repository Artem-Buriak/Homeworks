package homework5;

public class Racetrack extends Barrier{
    String type = "доріжку довжиною ";

    public Racetrack(int param) {
        super(param);
        this.param = param;
    }

    public boolean overcome(Member member) {
        if (member.maxRun >= param) {
            System.out.println(member.type+" "+member.name+ " здолав "+type+param);
            return true;
        } else {
            System.out.println(member.type+" "+member.name+ " не зміг здолати "+type+param);
            return false;
        }
    }
}
