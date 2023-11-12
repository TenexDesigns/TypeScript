Ambient declarations in TypeScript are used to tell the TypeScript compiler that the actual source code for a particular functionality or library exists elsewhere, typically in JavaScript. Ambient declarations are especially useful when working with third-party libraries that are written in JavaScript and you want to use them in a TypeScript project while maintaining type safety and IntelliSense.

Here's a breakdown of the provided information and an explanation of the example:

### Defining Ambient Declarations:

Ambient declarations are conventionally kept in a type declaration file with the `.d.ts` extension. For example:

```typescript
// Sample.d.ts
declare module Module_Name {
    // Type declarations go here
}
```

The ambient file won't be transcompiled to JavaScript but will be used for type safety and IntelliSense.

### Example:

Consider a third-party JavaScript library with the following code:

```javascript
// CalcThirdPartyJsLib.js
var Point;
(function (Point) {
    var Calc = (function () {
        function Calc() {
        }
        Calc.prototype.doSum = function (limit) {
            var sum = 0;
            for (var i = 0; i <= limit; i++) {
                sum = sum + i;
            }
            return sum;
        };
        return Calc;
    }());
    Point.Calc = Calc;
})(Point || (Point = {}));
```

As a TypeScript programmer, you may not have time to rewrite this library to TypeScript. Instead, you can create an ambient declaration file:

```typescript
// Calc.d.ts
declare module Point {
    export class Calc {
        doSum(limit: number): number;
    }
}
```

In this ambient declaration file, you specify the types without providing implementations.

### Using Ambient Declarations:

In your TypeScript file, reference the ambient declaration file:

```typescript
// CalcTest.ts
/// <reference path="Calc.d.ts" />

var obj = new Point.Calc();
obj.doSum("Hello"); // Compiler error
console.log(obj.doSum(10));
```

The compiler will catch errors like passing a string to `doSum`, providing type safety.

### Compilation and Execution:

Compile the TypeScript file:

```bash
tsc CalcTest.ts
```

This will generate the JavaScript code (`CalcTest.js`).

Include the compiled JavaScript files in an HTML page:

```html
<!-- index.html -->
<html>
   <body style="font-size: 30px;">
      <h1>Ambient Test</h1>
      <h2>Calc Test</h2>
   </body>
   <script src="CalcThirdPartyJsLib.js"></script>
   <script src="CalcTest.js"></script>
</html>
```

### Result:

When you run the HTML page, the console output will be:

```
55
```

This demonstrates the integration of a third-party JavaScript library using ambient declarations in TypeScript, providing type safety and IntelliSense. Similarly, you can use ambient declarations for other libraries like jQuery or Angular.



  ,,,
