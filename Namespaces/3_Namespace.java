Certainly! Namespaces in TypeScript provide a way to group related code and prevent naming conflicts. Here are some code samples illustrating how to use namespaces:

### Basic Namespace Example:

```typescript
// Shapes.ts
namespace Shapes {
    export interface Point {
        x: number;
        y: number;
    }

    export class Circle {
        constructor(public center: Point, public radius: number) {}

        area(): number {
            return Math.PI * this.radius ** 2;
        }
    }
}

// Usage in another file
/// <reference path="Shapes.ts" />

let point: Shapes.Point = { x: 0, y: 0 };
let circle = new Shapes.Circle(point, 5);
console.log(circle.area());
```

### Namespaces with Modules:

```typescript
// Geometry.ts
namespace Geometry {
    export interface Point {
        x: number;
        y: number;
    }
}

// Circle.ts
/// <reference path="Geometry.ts" />

namespace Geometry {
    export class Circle {
        constructor(public center: Point, public radius: number) {}

        area(): number {
            return Math.PI * this.radius ** 2;
        }
    }
}

// Usage
/// <reference path="Geometry.ts" />
/// <reference path="Circle.ts" />

let point: Geometry.Point = { x: 0, y: 0 };
let circle = new Geometry.Circle(point, 5);
console.log(circle.area());
```

### Nested Namespace Example:

```typescript
namespace Outer {
    export namespace Inner {
        export class MyClass {
            doSomething(): string {
                return "Hello from Inner namespace!";
            }
        }
    }
}

// Usage
let myObject = new Outer.Inner.MyClass();
console.log(myObject.doSomething());
```

### Using `import` with Modules:

```typescript
// Geometry.ts
export namespace Geometry {
    export interface Point {
        x: number;
        y: number;
    }
}

// Circle.ts
import { Geometry } from './Geometry';

export class Circle {
    constructor(public center: Geometry.Point, public radius: number) {}

    area(): number {
        return Math.PI * this.radius ** 2;
    }
}

// Usage
import { Geometry } from './Geometry';
import { Circle } from './Circle';

let point: Geometry.Point = { x: 0, y: 0 };
let circle = new Circle(point, 5);
console.log(circle.area());
```

Remember to use the appropriate compilation and module resolution settings in your `tsconfig.json` file, especially when dealing with modules.
