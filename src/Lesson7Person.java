public class Lesson7Person {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.personInfo("Will","Smith","New York",293672946));
        System.out.println(Person.personInfoStatic("Jackie","Chan","Shanghai",1231241241));
        System.out.println(person.personInfo("Sherlock","Holmes","London",377421235));
    }
}
