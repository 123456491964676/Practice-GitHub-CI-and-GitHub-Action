// 父类：Animal（动物）

class Animal {

    // 属性
    private String name;
    private int age;

    // 构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 行为：父类通用方法
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // 获取动物信息的方法
    public void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 子类：Cat（猫）
class Cat extends Animal {

    // 子类独有的属性
    private String furColor;

    // 构造方法：需要调用父类的构造方法
    public Cat(String name, int age, String furColor) {
        super(name, age); // 调用父类构造方法
        this.furColor = furColor;
    }

    // 子类独有的行为
    public void meow() {
        System.out.println("The cat is meowing: Meow~Meow~");
    }

    // 重写父类的方法（示例：自定义行为）
    @Override
    public void eat() {
        System.out.println("The cat is eating fish.");
    }

    // 显示猫的详细信息
    public void showCatInfo() {
        info(); // 调用父类的 info 方法
        System.out.println("Fur color: " + furColor);
    }
}

// 测试类
public class Main {

    public static void main(String[] args) {
        // 创建父类对象
        Animal animal = new Animal("Generic Animal", 5);
        animal.info();
        animal.eat();
        animal.sleep();

        System.out.println();

        // 创建子类对象
        Cat cat = new Cat("Kitty", 3, "White");
        cat.showCatInfo(); // 显示猫信息
        cat.eat();         // 调用重写方法
        cat.meow();        // 猫独有行为

        cat.sleep();       // 调用父类方法
    }
}
