package lessons.lesson11;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person
                ("Mariia",
                        "Vitaliivna",
                        "Revenko",
                        45,
                        "teacher");
        person1.displayInfo();

        Person person2 = new Person
                ("Ivan",
                        "Ivanovych",
                        "Korniienko",
                        45,
                        "plumber");
        person2.displayInfo();

        Person person3 = new Person
                ("Anna",
                        "Vladyslavivna",
                        "Sokolova",
                        29,
                        "administrator");
        person3.displayInfo();

        person3.setProfession("manager");
        person3.displayInfo();
    }
}
