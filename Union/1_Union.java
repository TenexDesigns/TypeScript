In TypeScript, a union type allows you to represent a value that can be one of several types. You use the `|` (pipe) character to separate the types in a union. For example:

```typescript
// Union of number and string
let myUnion: number | string;
myUnion = 10;     // Valid
myUnion = "Hello"; // Valid
// myUnion = true; // Error: Type 'boolean' is not assignable to type 'number | string'
```

Here, `myUnion` can be either a `number` or a `string`. Attempting to assign a value of any other type (e.g., `boolean`) will result in a compilation error.

### Using Unions with Functions:

Unions are commonly used with function parameters or return types to handle different types of inputs or outputs. Here's an example:

```typescript
// Function with a union type parameter
function display(value: number | string): void {
    console.log(value);
}

display(42);      // Valid
display("Hello"); // Valid
// display(true); // Error: Argument of type 'boolean' is not assignable to parameter of type 'number | string'
```

### Unions in Interfaces:

Unions can also be used in interfaces to allow for different types for certain properties:

```typescript
interface Car {
    brand: string;
    model: string;
    year: number | string; // Union type for the 'year' property
}

let myCar: Car = {
    brand: "Toyota",
    model: "Camry",
    year: 2022 // Valid
    // year: "2022" // Valid
    // year: true // Error: Type 'boolean' is not assignable to type 'number | string'
};
```

### Type Guards:

When working with union types, you may need to narrow down the type within a block of code. This is often done using type guards, such as `typeof` or `instanceof`. For example:

```typescript
function displayLength(value: number | string): void {
    if (typeof value === "number") {
        console.log("Length of the number:", value.toString().length);
    } else {
        console.log("Length of the string:", value.length);
    }
}

displayLength(42);      // Output: Length of the number: 2
displayLength("Hello"); // Output: Length of the string: 5
```

In this example, the `typeof value === "number"` check is a type guard that allows TypeScript to treat `value` as a `number` within the corresponding block.

Unions are powerful and flexible, enabling you to work with a variety of types in a type-safe manner.




  ...
