public class Slitherin extends Hogvarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resour;
    private int power;


    public Slitherin(String name, int magic, int transgress, int cunning, int determination, int ambition, int resour, int power) {
        super(name, magic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resour = resour;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResour() {
        return resour;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Slitherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resour=" + resour +
                ", power=" + power +
                ", magic=" + magic +
                ", transgress=" + transgress +
                '}';
    }public int calculateSlithSum() {
        return ambition + resour + cunning + power + determination;
    }

    public void compare(Slitherin student) {
        int sum1 = calculateSlithSum();
        int sum2 = student.calculateSlithSum();
        if (sum1 > sum2) {
            System.out.println(name + " > " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " < " + student.name);
        } else if (sum1 == sum2) {
            System.out.println(name + " = " + student.name);
        }
    }
}
