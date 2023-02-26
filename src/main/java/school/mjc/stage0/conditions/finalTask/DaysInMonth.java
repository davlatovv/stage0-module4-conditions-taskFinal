package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        try {
            if (year < 0 || month < 1 || month > 12) {
                System.out.println("invalid date");
            } else {
                int days = 0;
                switch (month) {
                    case 1: // January
                    case 3: // March
                    case 5: // May
                    case 7: // July
                    case 8: // August
                    case 10: // October
                    case 12: // December
                        days = 31;
                        break;
                    case 4: // April
                    case 6: // June
                    case 9: // September
                    case 11: // November
                        days = 30;
                        break;
                    case 2: // February
                        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                            days = 29;
                        } else {
                            days = 28;
                        }
                        break;
                }
                System.out.println(days);
            }
        } catch (NumberFormatException e) {
            System.out.println("invalid date");
        }
    }
}
