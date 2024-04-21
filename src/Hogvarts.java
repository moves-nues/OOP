public class Hogvarts {
    protected String name;
    protected int magic;
    protected int transgress;

    public int getMagic() {
        return magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public Hogvarts(String name, int magic, int transgress) {
        this.name = name;
        this.magic = magic;
        this.transgress = transgress;

    }

    public String getName() {
        return name;
    }

    public int calculateExtSum() {
        return magic + transgress;
    }

    public void external(Hogvarts student) {
        int sum1 = calculateExtSum();
        int sum2 = student.calculateExtSum();
        if (sum1 > sum2) {
            System.out.println(name + " лучший по магии и трансгрессии, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " худший по магии и трансгрессии, чем  " + student.name);
        } else if (sum1 == sum2) {
            System.out.println(name + " такой же, как и " + student.name);
        }
    }
}
