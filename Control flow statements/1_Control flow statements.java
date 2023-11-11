In TypeScript, control flow statements are similar to those in JavaScript. They allow you to control the flow of execution based on conditions, loops, and other constructs. Here's an overview of control flow statements in TypeScript with code samples:

### 1. **Conditional Statements (if-else):**
```typescript
let condition: boolean = true;

if (condition) {
    // Code to execute if the condition is true
} else {
    // Code to execute if the condition is false
}
```

### 2. **Switch Statement:**
```typescript
let option: number = 2;

switch (option) {
    case 1:
        // Code to execute for option 1
        break;
    case 2:
        // Code to execute for option 2
        break;
    default:
        // Code to execute if option doesn't match any case
}
```

### 3. **Loops (for, while, do-while):**
```typescript
// For Loop
for (let i: number = 0; i < 5; i++) {
    // Code to repeat
}

// While Loop
let counter: number = 0;
while (counter < 5) {
    // Code to repeat
    counter++;
}

// Do-While Loop
let condition: boolean = true;
do {
    // Code to repeat
} while (condition);
```

### 4. **For...in and For...of Loops:**
```typescript
let obj = { a: 1, b: 2, c: 3 };

// For...in Loop (iterating over object keys)
for (let key in obj) {
    console.log(key); // prints 'a', 'b', 'c'
}

let arr = [1, 2, 3];

// For...of Loop (iterating over array elements)
for (let value of arr) {
    console.log(value); // prints 1, 2, 3
}
```

### 5. **Break and Continue:**
```typescript
for (let i: number = 0; i < 5; i++) {
    if (i === 3) {
        break; // exit the loop
    }
    console.log(i);
}

for (let i: number = 0; i < 5; i++) {
    if (i === 2) {
        continue; // skip the rest of the loop body for this iteration
    }
    console.log(i);
}
```

### 6. **Labels (Advanced):**
```typescript
outerLoop: for (let i: number = 0; i < 3; i++) {
    for (let j: number = 0; j < 3; j++) {
        if (i === 1 && j === 1) {
            break outerLoop; // break out of the outer loop
        }
        console.log(i, j);
    }
}
```

These control flow statements provide you with the necessary tools to structure the flow of your TypeScript programs based on conditions and repetitions.




  ..
