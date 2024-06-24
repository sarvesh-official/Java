package Oops;

public class Oops {

    public static void main(String[] args) {

        //* Non Parameterized Constructors
        Student s1 = new Student();

        s1.name = "Sarvee";

        // & Parameterized Constructors

        Student s2 = new Student("Sarvesh");
        Student s3 = new Student(20);

        s1.marks[0] = 100;
        s1.marks[1] = 200;
        s1.marks[2] = 300;
        //! Using Copy Constructor
        Student s4 = new Student(s1);


        System.out.println(s4.name);

        s1.marks[2] = 400;

        
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }

        Fish shark = new Fish();

        Dog doggy = new Dog();

        doggy.eat();
        doggy.legs = 4;

        System.out.println(doggy.legs);


        // ! Method Overriding
        Human newHuman = new Human();
        Indian newIndian = new Indian();
        newHuman.eat();
        newIndian.eat();


        //^ Abstract Class
        Home newHome = new Home();
        newHome.color();
        newHome.size();


        // New Concept
        Vehicle newVehicle = new Car();
        newVehicle.print();
    }

}






class Student {

    String name;
    int age;
    float percentage;
    int marks[];

    void setName(String newName) {
        name = newName;
    }

    //! Shallow Copy

    //* Changes in the s1 variable will be reflected */
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    
    // ! Deep Copy

    //* Changes in the s1 variable will not be reflected */
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name) {

        marks = new int[3];
        this.name = name;
    }

    Student(int age) {

        marks = new int[3];
        this.age = age;
    }

    Student() {

        marks = new int[3];
        System.out.println("constructor is called");
    }

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}



class Pen {
    String color;
    int tip;
    
    // Getter Functions
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // Setter Functions
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }



}




class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String p) {
        password = p;
        System.out.println(password);
    }
}



// * Single Inheritance
//* */ Base Class
class Animal {
    String color;
    
    void eat() {
        System.out.println("eats");
    }
    
    void breathe() {
        System.out.println("breathes");
    }
}

// & Derived Class
class Fish extends Animal {
    int fins;
    
    void swim(){}
}
// * Multilevel Inheritance

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String bread;
}


// * Hierarchial Inheritance

class cow extends Mammal {
    String bread;
}

class cat extends Mammal {
    String color;

}

class donkey extends Mammal {
    boolean  hasTail;
}



class Human {

    void eat() {
        System.out.println("eats anything");
    }
}


class Indian extends Human {
    void eat() {
        System.out.println("eats spicy food");
    }
}



// * Abstract Classes

abstract class Bricks {

    abstract void color();

    void size() {
        System.out.println("Size is 10x5x2");
    }
}


class Home extends Bricks {
    void color() {
        System.out.println("Red");
    }
}

class Flat extends Bricks {
    void color() {
        System.out.println("White");
    }
}


// ! Interfaces

interface ChessPlayer {
    void moves();
}


class Queen implements ChessPlayer {
    public void moves() {
            System.out.println("up , down , left , right , diagonal");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
            System.out.println("up , down , left , right ");
    }
}
class King implements ChessPlayer {
    public void moves() {
            System.out.println("up , down , left , right , diagonal - (by 1 step)");
    }
}


//* */ Static

class Student1 {

    String name;
    int age;

    static String schoolName;


    void setName(String name) {

        this.name = name;
    }

    String getName() {
        return this.name;   
    }
}


// Problems


class Vehicle {
    void print() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("This is a car");
    }

    void hello() {
        System.out.println("Hi from car");
    }
}