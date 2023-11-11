Certainly! Here's an overview of TypeScript operators with code samples:

### Arithmetic Operators:
```typescript
let a: number = 10;
let b: number = 5;
let result: number;

result = a + b; // Addition
result = a - b; // Subtraction
result = a * b; // Multiplication
result = a / b; // Division
result = a % b; // Modulus
result++;       // Increment
result--;       // Decrement
```

### Relational Operators:
```typescript
let num1: number = 5;
let num2: number = 9;
let res: boolean;

res = num1 > num2;  // Greater than
res = num1 < num2;  // Lesser than
res = num1 >= num2; // Greater than or equal to
res = num1 <= num2; // Lesser than or equal to
res = num1 == num2; // Equality
res = num1 != num2; // Not equal
```

### Logical Operators:
```typescript
let avg: number = 20;
let percentage: number = 90;
let res: boolean;

res = (avg > 50) && (percentage > 80);  // AND
res = (avg > 50) || (percentage > 80);  // OR
res = !((avg > 50) && (percentage > 80)); // NOT
```

### Bitwise Operators:
```typescript
let a: number = 2; // Bit presentation: 10
let b: number = 3; // Bit presentation: 11
let result: number;

result = a & b;   // Bitwise AND
result = a | b;   // Bitwise OR
result = a ^ b;   // Bitwise XOR
result = ~b;      // Bitwise NOT
result = a << b;  // Left Shift
result = a >> b;  // Right Shift
result = a >>> b; // Right shift with Zero
```

### Assignment Operators:
```typescript
let c: number = 0;
c = a;      // Simple Assignment
c += a;     // Add and Assignment
c -= a;     // Subtract and Assignment
c *= a;     // Multiply and Assignment
c /= a;     // Divide and Assignment
```

### Miscellaneous Operators:
```typescript
let x: number = 4;
let y: number;

y = -x; // Negation Operator
let msg: string = "hello" + "world"; // Concatenation Operator

let num: number = -2;
let resultStr: string = num > 0 ? "positive" : "non-positive"; // Conditional Operator
```

### Type Operators:
```typescript
let numType: number = 12;
console.log(typeof numType); // typeof Operator
```

These examples cover various types of operators in TypeScript and illustrate their usage.





  .....
