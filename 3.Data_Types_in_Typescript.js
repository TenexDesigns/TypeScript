In TypeScript, types are used to enforce strict typing, which helps catch potential issues at compile-time and provides better documentation for codebases. Here are some of the basic types in TypeScript:

Primitive types: These are the fundamental types in TypeScript, similar to JavaScript's primitive types. Examples include:
number: Represents both integers and floating-point values.
string: Represents a sequence of characters.
boolean: Represents a true or false value.
null: Represents an intentionally empty value.
undefined: Represents a value that has not been assigned yet.
Example:

   let age: number = 25;
   let firstName: string = 'John';
   let isActive: boolean = true;
Array type: Represents a collection of elements of the same type. You can use either the Type[] syntax or the Array<Type> syntax to define an array type.
Example:

   let numbers: number[] = [1, 2, 3];
   let names: Array<string> = ['Alice', 'Bob', 'Charlie'];
Tuple type: Represents an array with a fixed number of elements, where each element can have a different type.
Example:

   let personInfo: [string, number] = ['Alice', 30];
Enum type: Represents a collection of named constants.
Example:

   enum Color {
     Red,
     Green,
     Blue,
   }

   let myColor: Color = Color.Red;
Object type: Represents a non-primitive type, such as an object, function, or array.
Example:

   let user: { name: string; age: number } = {
     name: 'John',
     age: 25,
   };
Function type: Represents the type of a function, including its parameters and return type.
Example:

   let greet: (name: string) => string = (name) => `Hello, ${name}`;
Union type: Represents a value that can be one of several types. Use the | operator to specify multiple types.
Example:

   let value: number | string = 42;
   value = 'hello';
These basic types can be combined to create more complex, custom types. TypeScript also provides advanced type features such as type inference, conditional types, type guards, mapped types, and utility types blog.logrocket.com.








MORE EXPLAANNTION
***************************************************************************************************************************





TypeScript introduces static typing to JavaScript, allowing developers to define types for variables, function parameters, return values, and more. This helps catch type-related errors during development and provides better code documentation and tooling support. Here are some commonly used types in TypeScript:

Basic Types:

number: Represents numeric values, including integers and floating-point numbers.
string: Represents textual data.
boolean: Represents a logical value - true or false.
null and undefined: Represents absence of a value.
any: Represents a dynamic type that allows values of any type. Avoid using it as it bypasses type checking.
void: Represents the absence of a return value. Typically used for functions that don't return anything.
Arrays:

Type[]: Represents an array of values of a specific type. For example, number[] represents an array of numbers.
Array<Type>: An alternative syntax for defining an array type. For example, Array<number> represents an array of numbers.
Objects and Interfaces:

object: Represents a generic JavaScript object.
{} or { key: Type }: Represents an object with specific key-value pairs.
interface: Allows defining a custom object type with properties and their types. Interfaces provide a way to enforce a structure on objects. For example:
typescript
Copy code
interface Person {
  name: string;
  age: number;
}
Functions:

(parameter: Type) => ReturnType: Represents a function type with a specific parameter and return type. For example:
typescript
Copy code
const add: (a: number, b: number) => number = (a, b) => a + b;
Union and Intersection Types:

Type1 | Type2: Represents a type that can be either Type1 or Type2. For example, number | string represents a value that can be either a number or a string.
Type1 & Type2: Represents a type that has all the properties of Type1 and Type2. For example:
typescript
Copy code
interface Name {
  firstName: string;
  lastName: string;
}

interface Age {
  age: number;
}

type Person = Name & Age;
These are just a few examples of the types available in TypeScript. TypeScript also supports advanced type features like generics, type aliases, mapped types, conditional types, and more, which can greatly enhance the expressiveness and safety of your code.

TypeScripts type system provides compile-time type checking, tooling support, and enhanced code documentation, making it easier to catch and prevent errors while writing JavaScript code.
























