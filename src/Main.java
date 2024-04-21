public class Main {
    public static void main(String[] args){
        Grifindor harryPotter = new Grifindor(
                "Гарри Поттер", 75, 90, 55, 87, 100);

        Grifindor hermionaGranger = new Grifindor(
                "Гермиона Грэйнджер", 97, 70, 56, 87, 78);

        Grifindor ronUizly = new Grifindor(
                "Рон Уизли", 45, 10, 70, 55, 84);

        Hufflepuff zahariaSmit = new Hufflepuff(
                "Захария Смит", 60, 98, 23, 66, 46);

        Hufflepuff sedricDigore = new Hufflepuff(
                "Седрик Дигори", 100,100,89, 67, 86);
        Hufflepuff jastin = new Hufflepuff(
                "Джастин", 60,78,34,76,56);



        //соревнование внутри факультета
        harryPotter.compare(hermionaGranger);
        hermionaGranger.compare(ronUizly);
        harryPotter.compare(ronUizly);

        zahariaSmit.compareHaff(sedricDigore);
        zahariaSmit.compareHaff(jastin);
        jastin.compareHaff(sedricDigore);

        //Соревнование между факультетов
        harryPotter.external(hermionaGranger);
        harryPotter.external(ronUizly);
        ronUizly.external(hermionaGranger);

        harryPotter.external(sedricDigore);
        hermionaGranger.external(zahariaSmit);
        jastin.external(ronUizly);
        hermionaGranger.external(sedricDigore);


    }
}