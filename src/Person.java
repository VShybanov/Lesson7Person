public class Person {
    private final String template = "Зателефонувати громадянину %s %s із міста %s за номером %s";
    public String personInfo(String firstName, String lastName, String city, String telNumber) {
        return String.format(template, firstName, lastName, city, telNumber);
    }
}
