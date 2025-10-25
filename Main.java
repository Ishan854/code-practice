 
class Animal{
    public void eat(){
        System.out.println("Parent Animal Eating");
    }
    public void sleep(){
        System.out.println("Parent Animal Sleeping");
    }
    public Animal(){
        System.out.println("Constructor of an Animal");
    }
}

 class Dog extends Animal {
    Dog(){
        super();
    }
    public void bark(){
        System.out.println("Child Dog  of a Parent Animal is barking Woof! Woof!");
    }
    @Override
    public void eat(){
        System.out.println("Overriding eat method now the dog is eating from the child");
    }
    
}
 class Cat extends Animal {

    public void meow(){
        System.out.println("Meow! Meow! Meow!");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog an = new Dog();
        an.eat();
        an.sleep();
        an.bark();
    }
    
}
