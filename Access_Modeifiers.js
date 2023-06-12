
Access modifiers in TypeScript are used to control the visibility and accessibility of class members (properties and methods). 
They help in implementing the concept of encapsulation in object-oriented programming. 
TypeScript provides three access modifiers: public, private, and protected typescripttutorial.net.





Public: 

By default, all class members in TypeScript are public. This means they can be accessed from anywhere,
within the class or outside the class, without any restrictions. You can use the public keyword explicitly,
but its not necessary since its the default behavior

class MyClass {
  public myPublicProperty: string;

  public myPublicMethod(): void {
    console.log("I'm a public method");
  }
}







Private:

The private access modifier restricts the visibility of a class member to the same class only.
You cannot access private properties or methods outside the class; attempting to do so will result in a compile-time error.
class MyClass {
  private myPrivateProperty: string;

  private myPrivateMethod(): void {
    console.log("I'm a private method");
  }
}







Protected:

The protected access modifier allows access to class members within the same class and its subclasses.
It provides a way to share properties and methods between a base class and its derived
classes while keeping them inaccessible outside the class hierarchy.

class MyBaseClass {
  protected myProtectedProperty: string;

  protected myProtectedMethod(): void {
    console.log("I'm a protected method");
  }
}

class MyDerivedClass extends MyBaseClass {
  useProtectedMembers(): void {
    console.log(this.myProtectedProperty);
    this.myProtectedMethod();
  }
}

Using access modifiers in TypeScript helps you control the visibility of your class members,
  increasing the security and maintainability of your code. 
  Its essential to choose the appropriate access modifier depending on the desired level of
  encapsulation and access control javatpoint.com.



READONLY:

Yes, there is a readonly access modifier in TypeScript. The readonly modifier is used to mark class properties as immutable, which means they can only be assigned a value during their declaration or within the constructor of the same class typescripttutorial.net.

Here's an example of using the readonly modifier in a TypeScript class:

class Person {
  readonly birthDate: Date;

  constructor(birthDate: Date) {
    this.birthDate = birthDate;
  }
}

const person = new Person(new Date(1990, 12, 25));
person.birthDate = new Date(1991, 12, 25); // This will result in a compile-time error
In this example, the birthDate property is marked as readonly, which means it can only be initialized in the constructor of the Person class. Attempting to assign a new value to the birthDate property outside the constructor will result in a compile-time error.

You can also consolidate the declaration and initialization of a readonly property in the constructor like this:

class Person {
  constructor(readonly birthDate: Date) {
    this.birthDate = birthDate;
  }
}
It is important to note that the readonly modifier is a part of TypeScript's type system and is only used by the compiler to check for illegal property assignments. Once the TypeScript code is compiled to JavaScript, all notions of readonly are gone, and there's no protection against property assignments at runtime mariusschulz.com.





























MMORE EXPLANANTION
**************************************************************************************************************



Access modifiers in TypeScript provide control over the visibility and accessibility of class members (properties and methods). TypeScript supports three access modifiers: public, protected, and private. Here's an overview of each access modifier:

Public:
The public access modifier allows class members to be accessed from anywhere, including outside the class.

Example:

typescript
Copy code
class Person {
  public name: string;

  constructor(name: string) {
    this.name = name;
  }

  public greet() {
    console.log(`Hello, my name is ${this.name}.`);
  }
}

const person = new Person('John');
console.log(person.name); // Accessing public property
person.greet(); // Calling public method
In the above example, the name property and the greet method are marked as public. They can be accessed from outside the class, allowing external code to read the name property and invoke the greet method.

Protected:
The protected access modifier restricts class members to be accessed within the class and its subclasses. It prevents access from outside the class hierarchy.

Example:

typescript
Copy code
class Person {
  protected age: number;

  constructor(age: number) {
    this.age = age;
  }

  protected getAge(): number {
    return this.age;
  }
}

class Employee extends Person {
  private department: string;

  constructor(age: number, department: string) {
    super(age);
    this.department = department;
  }

  public getDepartment(): string {
    return this.department;
  }

  public getAgeAndDepartment(): string {
    return `Age: ${this.getAge()}, Department: ${this.getDepartment()}`;
  }
}

const employee = new Employee(30, 'IT');
console.log(employee.getAgeAndDepartment()); // Accessing protected method
console.log(employee.getAge()); // Error: Protected member can only be accessed within the class hierarchy
In the above example, the age property and the getAge method are marked as protected in the Person class. They are accessible within the class and its subclasses. The Employee class, which extends Person, can access the age property through the getAge method. However, the age property cannot be accessed directly from external code.

Private:
The private access modifier restricts class members to be accessed only within the class itself. They are not accessible from outside the class or its subclasses.

Example:

typescript
Copy code
class Person {
  private address: string;

  constructor(address: string) {
    this.address = address;
  }

  private getAddress(): string {
    return this.address;
  }
}

const person = new Person('123 Main St');
console.log(person.getAddress()); // Error: Private member cannot be accessed outside the class
In the above example, the address property and the getAddress method are marked as private. They can only be accessed within the Person class itself, and any attempt to access them from outside the class will result in an error.

Access modifiers in TypeScript provide encapsulation and control over the accessibility of class members. They allow you to define the desired level of visibility and enforce access rules within your codebase. By properly using access modifiers, you can enhance the security and maintainability of your TypeScript classes.


























































