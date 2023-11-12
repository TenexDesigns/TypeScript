Sure, here is a summary of namespaces in TypeScript with code samples:

**Namespaces** are a way to logically group related code in TypeScript. They help prevent global namespace pollution, which occurs when variables declared in different files have the same name. Namespaces also make it easier to organize code and reuse code across different files.

**Defining a Namespace:**

A namespace definition begins with the keyword `namespace` followed by the namespace name enclosed in curly braces `{}`. You can then define classes, interfaces, and other members within the namespace.

```typescript
namespace Drawing {
  export interface IShape {
    draw(): void;
  }

  export class Circle implements IShape {
    draw(): void {
      console.log("Circle is drawn");
    }
  }

  export class Triangle implements IShape {
    draw(): void {
      console.log("Triangle is drawn");
    }
  }
}
```

**Accessing Namespace Members:**

To access a member of a namespace, you use the dot notation. For example, to access the `draw()` method of the `Circle` class, you would write:

```typescript
const circle = new Drawing.Circle();
circle.draw(); // Output: Circle is drawn
```

**Nested Namespaces:**

You can define nested namespaces by nesting namespace declarations within each other. For example, the following code defines a nested namespace called `invoiceApp` within the `tutorialPoint` namespace:

```typescript
namespace tutorialPoint {
  export namespace invoiceApp {
    export class Invoice {
      calculateDiscount(price: number): number {
        return price * 0.4;
      }
    }
  }
}
```

To access a member of a nested namespace, you use the dot notation and add the nested namespace names as well. For example, to access the `calculateDiscount()` method of the `Invoice` class, you would write:

```typescript
const invoice = new tutorialPoint.invoiceApp.Invoice();
console.log(invoice.calculateDiscount(500)); // Output: 200
```

**Benefits of Using Namespaces:**

* **Prevents global namespace pollution:** Namespaces ensure that variables and functions with the same name in different files do not conflict with each other.

* **Improves code organization:** Namespaces help organize code into logical groups, making it easier to understand and maintain large codebases.

* **Facilitates code reuse:** Namespaces make it easier to reuse code across different files by providing a clear way to identify and access members of a namespace.

**Conclusion:**

Namespaces are a valuable tool for organizing and managing code in TypeScript projects. They help prevent namespace pollution, improve code organization, and facilitate code reuse.
