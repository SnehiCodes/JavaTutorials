public class construct{
    public static void main(String[] args) {

        Human human1 = new Human("Rick",65,71);
        Human human2 = new Human("Dick",45,39);

        System.out.println(human2.name);
        System.out.println(human2.age);

        human2.eat();
        human1.drink();

    }
}

class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void drink()
    {
        System.out.println((this.name+" is drinking ."));
    }
}