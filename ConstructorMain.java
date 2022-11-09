public class ConstructorMain {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", 293672946);
        Person person2 = new Person("Jackie", "Chan", "Shanghai", 123124124);
        Person person3 = new Person("Sherlock", "Holmes", "London", 377421235);
        person1.personInfo();
        person2.personInfo();
        person3.personInfo();
    }
}


