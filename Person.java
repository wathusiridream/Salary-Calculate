public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person name: "+ name  + "\n" + "Age: " + age;
    }

    public boolean equals(Person p) {
        if (p.name.equals(name) && p.age == age){
            return true;
        } else {
            return false;
        }
    }

}