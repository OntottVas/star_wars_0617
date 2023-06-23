public class StarWars {
    public static void main(String[] args) {
        XWing redOne = new XWing();
        XWing redTwo = new XWing();
        XWing redThree = new XWing();
        XWing redFour = new XWing();
        XWing redFive = new XWing();

        MilleniumFalcon milleniumFalcon = new MilleniumFalcon();

        System.out.println(redOne.fasterThan(milleniumFalcon));
        System.out.println(redTwo.fasterThan(redFive));
        System.out.println(milleniumFalcon.fasterThan(redThree));

        int counter = 0;
        while (milleniumFalcon.fasterThan(redFour)) {
            counter++;
            redFour.hyperJump();
        }
        System.out.println(counter + " time(s) Red Four has to hyper jump to be faster than the Millenium Falcon");

    }
}