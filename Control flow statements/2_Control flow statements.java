Control flow statements are essential building blocks of any programming language, allowing you to control the execution path of your code based on specific conditions or loops. TypeScript provides a rich set of control flow statements, including conditional statements (if-else), loops (for, while, do-while), and switch statements.

**Conditional Statements (if-else)**

Conditional statements are used to execute different code blocks based on the evaluation of a condition. The basic syntax of an if-else statement in TypeScript is:

```typescript
if (condition) {
  // Code to execute if the condition is true
} else {
  // Code to execute if the condition is false
}
```

For example, the following code checks if a variable `age` is greater than 18 and displays a message accordingly:

```typescript
let age: number = 20;

if (age >= 18) {
  console.log("You are an adult.");
} else {
  console.log("You are a minor.");
}
```

**Loops**

Loops are used to execute a block of code repeatedly until a certain condition is met. TypeScript provides three main types of loops: for, while, and do-while.

**for Loop**

The for loop is used to execute a block of code a specific number of times. The general syntax is:

```typescript
for (let i = 0; i < 5; i++) {
  // Code to execute for each iteration
}
```

In this example, the loop will execute five times, incrementing the variable `i` from 0 to 4 each time.

**while Loop**

The while loop executes a block of code as long as a condition is true. The syntax is:

```typescript
let num: number = 10;

while (num > 0) {
  console.log(num);
  num--;
}
```

This loop will print the numbers from 10 to 1 (inclusive), decrementing `num` until it reaches 0.

**do-while Loop**

The do-while loop executes a block of code at least once, and then continues to execute as long as a condition is true. The syntax is:

```typescript
let num: number = 0;

do {
  console.log(num);
  num++;
} while (num < 10);
```

This loop will always print the numbers from 0 to 9 (inclusive), regardless of the initial value of `num`.

**Switch Statement**

The switch statement evaluates a variable against a series of values and executes the corresponding code block for each match. The syntax is:

```typescript
let grade: string = "A";

switch (grade) {
  case "A":
    console.log("Excellent!");
    break;
  case "B":
    console.log("Good job!");
    break;
  case "C":
    console.log("Keep working hard.");
    break;
  default:
    console.log("Invalid grade.");
}
```

This switch statement checks the value of `grade` and executes the corresponding code block based on the value. The `break` keyword is used to exit the switch statement after a case is matched.

Understanding and utilizing control flow statements is crucial for writing structured and efficient TypeScript code. These statements allow you to make decisions, repeat code blocks, and handle different scenarios based on specific conditions.
