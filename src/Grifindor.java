public class Grifindor extends Hogvarts {
    private int honor;
    private int nobility;
    private int courage;

    public Grifindor(String name, int magic, int transgress, int honor, int nobility, int courage) {
        super(name, magic, transgress);
        this.honor = honor;
        this.nobility = nobility;
        this.courage = courage;
    }


    public int getHonor() {
        return honor;
    }
    public int getNobility() {
        return nobility;
    }
    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Grifindor{" +
                "honor=" + honor +
                ", nobility=" + nobility +
                ", courage=" + courage +
                ", name='" + name + '\'' +
                ", magic=" + magic +
                ", transgress=" + transgress +
                '}';
    }

    public int calculateSum() {
        return nobility + honor + courage;
    }

    public void compare(Grifindor student) {
        int sum1 = calculateSum();
        int sum2 = student.calculateSum();
        if (sum1 > sum2) {
            System.out.println(name + " лучший Грифиндорец, чем " + student.name);
    } else if (sum1 < sum2) {
            System.out.println(name + " худший грифиндорец, чем " + student.name);
        } else if (sum1 == sum2) {
            System.out.println(name + " такой же, как и " + student.name);
        }
    }
}
