package nl.novi.javaprogrammeren.one;

public class Person {
    private String name;
    private String job;
    private int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    String getName2() {
        return this.name;
    }

    protected String getName3() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                " name = '" + name + '\'' +
                ", job = '" + job + '\'' +
                ", age = '" + age +
                "' }";
    }
}
