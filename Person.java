public class Person {
    String name;
    String surname;
    String city;
    long phoneNumber;

    public Person(String name, String surname, String city, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    void personInfo() {
        System.out.println("Позвонить гражданину " + name + surname + " из города " + city + " можно по номеру " + phoneNumber + ".");
    }
}
