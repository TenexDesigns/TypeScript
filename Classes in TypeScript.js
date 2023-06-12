
Classes in TypeScript provide a way to define and create objects with properties and methods. They are an essential part of object-oriented programming in TypeScript. Here's an overview of working with classes in TypeScript:

Class Declaration:
You can declare a class using the class keyword followed by the class name. Inside the class body, you can define properties, methods, and constructors.

Example:

class Person {
  name: string;
  age: number;

  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }

  sayHello() {
    console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
  }
}
In the above example, the Person class is declared with name and age properties and a sayHello method. The constructor is used to initialize the name and age properties when a new object is created.

Creating Objects:
To create an object from a class, you use the new keyword followed by the class name and any required constructor arguments.

Example:


const john = new Person('John', 25);
john.sayHello(); // Output: Hello, my name is John and I am 25 years old.
In the above example, a new Person object named john is created with the name "John" and age 25. The sayHello method is then called on the john object.

Class Inheritance:
TypeScript supports class inheritance, allowing you to create a new class that inherits properties and methods from a base (parent) class. This promotes code reuse and allows for hierarchical class structures.

Example:


class Student extends Person {
  grade: number;

  constructor(name: string, age: number, grade: number) {
    super(name, age);
    this.grade = grade;
  }

  study() {
    console.log(`${this.name} is studying in grade ${this.grade}.`);
  }
}
In the above example, the Student class extends the Person class, inheriting its properties and methods. The Student class adds a new property grade and a study method. The super keyword is used in the constructor to call the parent class constructor and initialize the inherited properties.

Access Modifiers:
TypeScript provides access modifiers (public, protected, and private) to control the visibility and accessibility of class members.

public: Members are accessible from anywhere.
protected: Members are accessible within the class and its subclasses.
private: Members are only accessible within the class itself.
Example:


class Car {
  private brand: string;
  protected year: number;
  public color: string;

  constructor(brand: string, year: number, color: string) {
    this.brand = brand;
    this.year = year;
    this.color = color;
  }

  startEngine() {
    console.log('Engine started.');
  }
}
In the above example, the brand property is private, the year property is protected, and the color property is public. The startEngine method is accessible from anywhere.

Classes in TypeScript provide a way to model real-world objects with properties and behaviors. They facilitate code organization, encapsulation, and code reuse. With TypeScript's static typing, you can define types for class members, ensuring type safety and better tooling support.







MORE EXPLANANTION
*******************************************************************************************************


Classes in TypeScript are a fundamental concept in object-oriented programming (OOP) and provide a way to create reusable components. They were introduced in ECMAScript 6 and are supported by TypeScript with additional features such as member visibility, abstract classes, generic classes, and arrow function methods digitalocean.com. Classes in TypeScript are compiled to plain JavaScript functions to ensure cross-platform and browser compatibility tutorialsteacher.com.

Here's a basic example of a class in TypeScript:

class Employee {
  empCode: number;
  empName: string;

  constructor(code: number, name: string) {
    this.empName = name;
    this.empCode = code;
  }

  getSalary(): number {
    return 10000;
  }
}
This example defines an Employee class with two properties empCode and empName, a constructor to initialize these properties, and a method getSalary to return the salary of the employee.

In TypeScript, you can also use features like member visibility (public, private, and protected), abstract classes, and inheritance to create more complex class structures. Here's an example showcasing inheritance and member visibility:

abstract class Person {
  protected name: string;

  constructor(name: string) {
    this.name = name;
  }

  abstract display(): void;
}

class Employee extends Person {
  private empCode: number;

  constructor(empCode: number, name: string) {
    super(name);
    this.empCode = empCode;
  }

  display(): void {
    console.log(`Employee Code: ${this.empCode}, Name: ${this.name}`);
  }
}

const emp = new Employee(1, "Alice");
emp.display(); // Output: Employee Code: 1, Name: Alice
In this example, we define an abstract class Person with a protected property name and an abstract method display. We then create an Employee class that extends Person, adds a private property empCode, and implements the display method.

Classes in TypeScript are a powerful tool to create reusable components with object-oriented programming concepts such as encapsulation and inheritance. They provide a more familiar and structured syntax for creating and organizing code in a type-safe manner.






















