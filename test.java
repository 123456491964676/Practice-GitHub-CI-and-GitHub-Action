// 父类：动物

class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    public void makeSound() {
        System.out.println(name + "发出动物叫声");
    }
}

// 子类：猫（继承自动物）
class Cat extends Animal {

    public Cat(String name) {
        super(name); // 调用父类构造方法
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "发出喵喵叫声");
    }

    // 猫特有的行为
    public void climbTree() {
        System.out.println(getName() + "正在爬树");
    }
}

// 测试类
public class Main {

    public static void main(String[] args) {
        // 创建猫对象
        Cat myCat = new Cat("小花");

        // 调用继承自父类的方法
        myCat.eat();        // 输出：小花正在吃东西

        // 调用重写后的方法
        myCat.makeSound();  // 输出：小花发出喵喵叫声

        // 调用子类特有方法
        myCat.climbTree();  // 输出：小花正在爬树

        // 多态示例
        Animal animal = new Cat("小黑");
        animal.makeSound(); // 输出：小黑发出喵喵叫声
    }
}
