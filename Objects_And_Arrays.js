In TypeScript, objects and arrays are fundamental data structures used to store and manipulate collections of data. Here's an overview of how to use objects and arrays in TypeScript, their mutability, available methods, overriding, and some relevant information about them:

Objects:

Usage: Objects in TypeScript are created using curly braces {} and consist of key-value pairs. The keys are strings, and the values can be of any type. Objects are useful for representing structured data.

typescript
Copy code
const person = {
  name: "John",
  age: 25,
  isAdmin: true,
};
Data Type Modification: The types of object properties are determined at the time of object creation. You cannot directly change the data type of an existing object property without assigning a new value of a different type to that property.

Methods: Objects in TypeScript can have methods, which are functions defined as properties of an object. These methods can perform actions or manipulate the object's data.

typescript
Copy code
const person = {
  name: "John",
  greet: function() {
    console.log(`Hello, ${this.name}!`);
  },
};

person.greet(); // Output: Hello, John!
Overriding: Object properties can be overridden by assigning new values to them.

typescript
Copy code
const person = {
  name: "John",
  age: 25,
};

person.age = 30; // Overriding the 'age' property
Arrays:

Usage: Arrays in TypeScript are created using square brackets [] and can store elements of any type in a specific order. Arrays are useful for storing and manipulating collections of similar or related data.

typescript
Copy code
const numbers: number[] = [1, 2, 3, 4, 5];
const fruits: string[] = ["apple", "banana", "orange"];
Data Type Modification: Arrays in TypeScript are mutable, meaning you can modify their elements, including changing the data type of individual elements.

typescript
Copy code
const numbers: (number | string)[] = [1, 2, "three", 4, "five"];
numbers[2] = 3; // Changing the data type of an element
Methods: Arrays in TypeScript come with several built-in methods that provide convenient ways to manipulate and access their elements. Some commonly used methods include push(), pop(), shift(), unshift(), slice(), splice(), forEach(), map(), filter(), and many more. These methods help with adding, removing, modifying, or iterating over array elements.

typescript
Copy code
const numbers: number[] = [1, 2, 3, 4, 5];

numbers.push(6); // Add an element at the end
numbers.pop(); // Remove the last element

numbers.forEach((num) => {
  console.log(num); // Output: 1, 2, 3, 4, 5
});
Overriding: The entire array can be overridden by assigning a new array to the same variable.

typescript
Copy code
let numbers: number[] = [1, 2, 3];
numbers = [4, 5, 6]; // Overriding the entire array
Relevant Information:

Objects and arrays can be nested, allowing you to create complex data structures.
TypeScript provides type annotations for objects and arrays, enabling type checking during development and providing better tooling support.
Arrays have a length property that gives the number of elements in the array.
Both objects and arrays can be serialized to JSON using JSON.stringify() and deserialized using JSON.parse().
TypeScript offers type inference, which automatically determines the types of object properties and array elements based on the assigned values.
Object destructuring and array destructuring can be used to extract values from objects and arrays more conveniently.
Understanding how to work with objects and arrays in TypeScript is crucial for handling and manipulating data effectively. By leveraging their properties, methods, and type system, you can create and manipulate complex data structures with confidence and maintainability.



















