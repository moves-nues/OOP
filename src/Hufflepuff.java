public class Hufflepuff extends Hogvarts {

    private int hardworking;
    private int layal;
    private int honest;

    public Hufflepuff(String name, int magic, int transgress, int hardworking, int layal, int honest) {
        super(name, magic, transgress);
        this.hardworking = hardworking;
        this.layal = layal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLayal() {
        return layal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", layal=" + layal +
                ", honest=" + honest +
                ", magic=" + magic +
                ", transgress=" + transgress +
                '}';
    }
    public int calculateHaffSum() {
        return hardworking + layal + honest;
    }

    public void compareHaff(Hufflepuff student) {
        int sum1 = calculateHaffSum();
        int sum2 = student.calculateHaffSum();
        if (sum1 > sum2) {
            System.out.println(name + " лучший пуффендуец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " худший пуффендуец, чем " + student.name);
        } else if (sum1 == sum2) {
            System.out.println(name + " такой же, как и  " + student.name);
        }
    }
}
