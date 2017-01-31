public class ByValueOfReference {

    public static void main(String[] args) {

        /* Example of alternating the object reference value */
        Person p = new Person("Mike", 25);
        printObjectAndReinitiallizeIt(p);
        System.out.println("After method call Name: " + p.name + " age: " + p.age);

        /* Example of modifying a field of the passed object */
        p = new Person("Lala", 25);
        printObjectAndModifyField(p);
        System.out.println("After method call Name: " + p.name + " age: " + p.age);

    }

    private static class Person {

        Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        String name;
        Integer age;
    }

    private static void printObjectAndReinitiallizeIt(Person p) {
        System.out.println(" Input --> Name: " + p.name + " age: " + p.age);
        p = new Person("Reveka", 25);
        System.out.println(" Output --> Name: " + p.name + " age: " + p.age);
    }

    private static void printObjectAndModifyField(Person p) {
        System.out.println(" Input --> Name: " + p.name + " age: " + p.age);
        p.name = "Changed Name";
        p.age = 1;
        System.out.println(" Output --> Name: " + p.name + " age: " + p.age);
    }
}
