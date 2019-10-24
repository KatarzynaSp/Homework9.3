public class ConverterTest {
    public static void main(String[] args) {

        int limit = 7;
        for (int i = 1; i <= limit; i++) {
            System.out.println(i + " dzień tygodnia to " + CalandarConverter.convertDayToString(i));
        }
    }
}