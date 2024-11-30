package class_2410_lb83.week10_encapsulation.deficient_encapsulation.before;

// public data field diubah access modifier menjadi private data field
// jika diperlukan, tambahkan validasi sebelum melakukan set value
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
