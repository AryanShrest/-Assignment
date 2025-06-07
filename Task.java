//  1.Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car with method display() method to print details of the Car.
// class Vehicle {
//     void drive() {
//         System.out.println("Driving the vehicle...");
//     }
// }

// class Car extends Vehicle {
//     void display() {
//         System.out.println("Car Details: Brand - Toyota, Model - Corolla, Year - 2022");
//     }

//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.drive();
//         myCar.display();
//     }
// }

// 2.Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method.
// class Employee {
//     void work() {
//         System.out.println("Employee is working...");
//     }

//     double getSalary() {
//         return 30000.0;
//     }
// }

// class HRManager extends Employee {
//     @Override
//     void work() {
//         System.out.println("HR Manager is recruiting new employees...");
//     }

//     public static void main(String[] args) {
//         HRManager hr = new HRManager();
//         hr.work();
//         System.out.println("Salary: " + hr.getSalary());
//     }
// }


// 3.Imagine that you are building a geometry calculator program. You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles. To achieve this, you decide to use a multilevel inheritance hierarchy.
// class Shape {
//     void displayShape() {
//         System.out.println("Calculating area of a shape...");
//     }
// }

// class Rectangle extends Shape {
//     double length = 5, width = 4;

//     double calculateArea() {
//         return length * width;
//     }
// }

// class Square extends Rectangle {
//     double side = 6;

//     double calculateAreaSquare() {
//         return side * side;
//     }
// }

// class Circle extends Shape {
//     double radius = 3;

//     double calculateAreaCircle() {
//         return Math.PI * radius * radius;
//     }

//     public static void main(String[] args) {
//         Square sq = new Square();
//         Circle c = new Circle();

//         sq.displayShape();
//         System.out.println("Rectangle Area: " + sq.calculateArea());
//         System.out.println("Square Area: " + sq.calculateAreaSquare());
//         System.out.println("Circle Area: " + c.calculateAreaCircle());
//     }
// }


// 4. Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.
// class Vehicle {
//     void startEngine() {
//         System.out.println("Engine started.");
//     }

//     void stopEngine() {
//         System.out.println("Engine stopped.");
//     }
// }

// class Car extends Vehicle {
//     void drive() {
//         System.out.println("Driving the car...");
//     }
// }

// class Motorcycle extends Vehicle {
//     void ride() {
//         System.out.println("Riding the motorcycle...");
//     }

//     public static void main(String[] args) {
//         Car car = new Car();
//         Motorcycle bike = new Motorcycle();

//         System.out.println("Car:");
//         car.startEngine();
//         car.drive();
//         car.stopEngine();

//         System.out.println("\nMotorcycle:");
//         bike.startEngine();
//         bike.ride();
//         bike.stopEngine();
//     }
// }

// 5.Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.
// class Shape {
//     double calculateArea() {
//         return 0;
//     }
// }

// class Rectangle extends Shape {
//     double length = 10;
//     double width = 5;

//     @Override
//     double calculateArea() {
//         return length * width;
//     }

//     double calculatePerimeter() {
//         return 2 * (length + width);
//     }
// }

// class Circle extends Shape {
//     double radius = 7;

//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }

//     double calculateCircumference() {
//         return 2 * Math.PI * radius;
//     }

//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();
//         Circle c = new Circle();

//         System.out.println("Rectangle Area: " + r.calculateArea());
//         System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());

//         System.out.println("Circle Area: " + c.calculateArea());
//         System.out.println("Circle Circumference: " + c.calculateCircumference());
//     }
// }

// 6.Let's examine the Java program given. It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and a method called displayDetails(). This method is responsible for outputting the title and author of a book. The remaining classes inherit both the constructor and methods of the Book class as they extend it.
// class Book {
//     String title, author;

//     Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }

//     void displayDetails() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//     }
// }

// class FictionBook extends Book {
//     FictionBook(String title, String author) {
//         super(title, author);
//     }
// }

// class NonFictionBook extends Book {
//     NonFictionBook(String title, String author) {
//         super(title, author);
//     }
// }

// class TechnicalBook extends Book {
//     TechnicalBook(String title, String author) {
//         super(title, author);
//     }

//     public static void main(String[] args) {
//         FictionBook fb = new FictionBook("Harry Potter", "J.K. Rowling");
//         NonFictionBook nfb = new NonFictionBook("Sapiens", "Sapiens ");
//         TechnicalBook tb = new TechnicalBook("Java Programming", "James Gosling");

//         System.out.println("Fiction Book:");
//         fb.displayDetails();

//         System.out.println("\nNon-Fiction Book:");
//         nfb.displayDetails();

//         System.out.println("\nTechnical Book:");
//         tb.displayDetails();
//     }
// }
