Interfaces in TypeScript are a powerful way to define contracts within your code and they define the syntax for classes to follow. They are used for type-checking and ensure that a class meets a particular contract. Interfaces are not to be converted to JavaScript. It’s just part of TypeScript. If you see the compiled file, interface has been removed. 

To declare an interface, you use the `interface` keyword. Here is an example:
```typescript
interface Printable {
    print(): void;
}
```
In this example, the `Printable` interface includes a single method `print` that takes no arguments and does not return a value ([Source 7](https://learncodeweb.com/typescript/typescript-interfaces-with-example/)).

Interfaces can also include properties:
```typescript
interface ClockInterface {
    currentTime: Date;
    setTime(d: Date): void;
}
```
In this example, the `ClockInterface` interface includes a property `currentTime` and a method `setTime` ([Source 0](https://www.typescriptlang.org/docs/handbook/interfaces.html)).

A class can implement an interface to enforce a certain contract:
```typescript
class Clock implements ClockInterface {
    currentTime: Date = new Date();
    setTime(d: Date) {
        this.currentTime = d;
    }
}
```
In this example, the `Clock` class implements the `ClockInterface` interface ([Source 0](https://www.typescriptlang.org/docs/handbook/interfaces.html)).

Interfaces can be used to describe function types:
```typescript
interface Args {
  name: string;
  age: number;
}
interface Return {
  name: string;
  age: number;
  doubledAge: number
}
function ageDoubler({name, age}: Args): Return {
  return {
    name,
    age, 
    doubledAge: age * 2,
  }
}
```
In this example, the `Args` and `Return` interfaces are used to type the arguments and return value of the `ageDoubler` function ([Source 2](https://prismic.io/blog/typescript-interfaces)).

Interfaces can include optional properties, which are declared by appending a question mark (`?`) to the property name:
```typescript
interface Person {
	name: string;
	age: number;
	color?: string; 
}
```
In this example, the `color` property of the `Person` interface is optional ([Source 2](https://prismic.io/blog/typescript-interfaces)).

Interfaces can be used with generics to create components that can work with multiple data types:
```typescript
interface StackSpec<T> {
    (elements: Array<T>): void
}
```
In this example, the `StackSpec` interface uses a generic parameter `T` ([Source 3](https://blog.logrocket.com/understanding-using-interfaces-typescript/)).

Interfaces can also include read-only properties, which cannot be changed once they are initialized:
```typescript
interface TeslaModelS {
    readonly length: number;
    readonly width: number;
    readonly wheelbase: number;
    readonly seatingCapacity: number;
}
```
In this example, the `TeslaModelS` interface includes read-only properties ([Source 3](https://blog.logrocket.com/understanding-using-interfaces-typescript/)). 

Interfaces can be extended using the `extends` keyword to create a new interface that inherits the properties and methods of the one it is extending:
```typescript
interface Child extends Parent {
}
```
In this example, the `Child` interface extends the `Parent` interface ([Source 8](https://www.tutorialspoint.com/typescript/typescript_interfaces.htm)).

Interfaces can also be used to define complex types using union types. For example:
```typescript
interface RunOptions { 
   program: string; 
   commandline: string[] | string | (() => string); 
} 
```
In this example, the `RunOptions` interface includes a `commandline` property that can be an array of strings, a string, or a function that returns a string ([Source 8](https://www.tutorialspoint.com/typescript/typescript_interfaces.htm)).

In conclusion, interfaces are a fundamental part of TypeScript, providing a way of defining contracts within your code and interacting with objects in a consistent manner. They offer a way to define custom types and ensure that variables, function parameters, returned values, and objects adhere to a certain structure.


  ..
