public class Person {
    private static final String template = "Зателефонувати громадянину %s %s із міста %s за номером %d";
    public String personInfo(String firstName, String lastName, String city, long telNumber) {
        return String.format(template, firstName, lastName, city, telNumber);
    }

    public static String personInfoStatic(String firstName, String lastName, String city, long telNumber) {
        return String.format(template, firstName, lastName, city, telNumber);
    }
}
