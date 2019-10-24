public class CalandarConverter {

    static final int MONDAY = 1;
    static final int TUESDAY = 2;
    static final int WEDNESDAY = 3;
    static final int THURSDAY = 4;
    static final int FRIDAY = 5;
    static final int SATURDAY = 6;
    static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {

        switch (dayNumber) {
            case CalandarConverter.MONDAY:
                return "Poniedziałek";
            case CalandarConverter.TUESDAY:
                return "Wtorek";
            case CalandarConverter.WEDNESDAY:
                return "Sroda";
            case CalandarConverter.THURSDAY:
                return "Czwartek";
            case CalandarConverter.FRIDAY:
                return "Piątek";
            case CalandarConverter.SATURDAY:
                return "Sobota";
            case CalandarConverter.SUNDAY:
                return "Niedziela";
            default:
                return "Tydzień ma tylko 7 dni.";
        }
    }
}