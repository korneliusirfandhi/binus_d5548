package class_2410_la83.week10_encapsulation.deficient_encapsulation.before;

// deficient encapsulation
// - ada public data field
// - logic di setter/getter kurang (hanya boleh allow set age min 0)
public class Person {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
