package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Winter");
        } else if (monthNumber == 6) {
            System.out.println("Summer");

        } else{
                System.out.println("Wrong month number");
         };
    }
}
