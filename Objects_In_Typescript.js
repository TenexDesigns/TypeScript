In TypeScript, objects are fundamental data structures that allow you to store and manipulate collections of key-value pairs.
Objects are defined using curly braces {} and can have properties and methods associated with them.
Heres an overview of objects in TypeScript:

1.Object Creation:
Objects in TypeScript can be created using object literals or through object instantiation using classes or constructor functions.

      a. Object Literal:

            const person = {
              name: "John",
              age: 25,
              isAdmin: true,
            };
      b. Class Instantiation:

            class Person {
              name: string;
              age: number;

              constructor(name: string, age: number) {
                this.name = name;
                this.age = age;
              }
            }

            const john = new Person("John", 25);


2.Object Properties:

Object properties represent the values associated with specific keys in an object.
Properties can have different data types, including primitive types, arrays, other objects, and functions.

Accessing Object Properties:

console.log(person.name); // Output: "John"
console.log(john.age); // Output: 25


3.Modifying Object Properties:

person.age = 30;
john.name = "John Doe";


4.Object Methods:
Object methods are functions associated with an object. They can perform actions or operations related to the object's data.



5.Defining Object Methods:

const person = {
  name: "John",
  age: 25,
  greet: function() {
    console.log(`Hello, my name is ${this.name} and I'm ${this.age} years old.`);
  },
};

person.greet(); // Output: "Hello, my name is John and I'm 25 years old."


6.Object Destructuring:

Object destructuring allows you to extract properties from an object and assign them to variables.

const person = {
  name: "John",
  age: 25,
};

const { name, age } = person;
console.log(name); // Output: "John"
console.log(age); // Output: 25


7.Object Spread Operator:

The object spread operator allows you to create a new object by copying properties from an 
existing object and adding or overriding properties.

const person = {
  name: "John",
  age: 25,
};

const updatedPerson = { ...person, age: 30 };
console.log(updatedPerson); // Output: { name: "John", age: 30 }
Objects in TypeScript are versatile and provide a convenient way to organize and manipulate data.
They can be used to represent entities, data structures, configuration objects, and much more. 
Understanding how to work with objects effectively will help you build complex data models and create modular and reusable code.












DIFFERENCE OF CLASS INSTANCIATION AND OBJECT LITERALS
***********************************************************************************************************************


  In TypeScript, the first object is an instance of the Person class, while the second object is
  a plain JavaScript object created using object literal notation.

Class Instance:


class Person {
  name: string;
  age: number;

  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }
}

const john = new Person("John", 25);
The Person class defines a blueprint for creating objects that represent a person. 
It has two properties, name and age, and a constructor that initializes these properties when a Person
object is created using the new keyword.

By instantiating the class with new Person("John", 25), you create a new instance of the Person class with
  specific values for name and age. The john object is of type Person and has access to the properties
  and methods defined in the Person class.

Object Literal:

const person = {
  name: "John",
  age: 25,
};
The object literal notation {} is used to create a plain JavaScript object directly. 
It allows you to define properties and their values in a concise manner.

In this case, the person object has name and age properties with specific values assigned to them.


Differences:

The class Person provides a blueprint for creating objects with specific properties and methods.
It allows you to define behavior and encapsulate functionality related to a person.
The object literal { name: "John", age: 25 } is a single object with predefined property values.
It does not have any associated behavior or predefined methods.
Using a class allows you to create multiple instances of objects with the same structure and behavior,
  whereas the object literal creates a single object with fixed property values.

Both approaches have their use cases. Classes are useful for creating complex data models, 
  encapsulating behavior, and enabling code reusability. Object literals are suitable for simple,
  one-off objects or when you dont need the additional functionality provided by classes.








MORE EXPLANANTION
*************************************************************




In TypeScript, objects are used to group and pass around data, and they can be represented through object types. There are two ways to define object types in TypeScript: using object type literals and interfaces.

Here's an example of defining an object type using an object type literal:

type Person = {
  name: string;
  age: number;
};

function greet(person: Person) {
  return "Hello " + person.name;
}
Here's an example of defining an object type using an interface:

interface Person {
  name: string;
  age: number;
}

function greet(person: Person) {
  return "Hello " + person.name;
}
In both examples above, we've written functions that take objects containing the properties name (which must be a string) and age (which must be a number) typescriptlang.org.

Object type literals and interfaces are very similar, and you can use either semicolons or commas as separators. Trailing separators are allowed and optional exploringjs.com.

In TypeScript, there are two different concepts related to objects: Object (uppercase "O") and object (lowercase "o"). Object is the type of all instances of the class Object, while object is the type of all non-primitive values (primitive values are undefined, null, booleans, numbers, bigints, strings). With the object type, you can't access any properties of a value 2ality.com.













