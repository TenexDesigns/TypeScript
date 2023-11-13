In TypeScript, decorators are a feature that allows you to add metadata or modify the behavior of classes, methods, properties, or parameters at design time. Decorators are declared using the `@` symbol followed by the decorator name, and they are applied to the target element immediately before its declaration.

Decorators can be used for a variety of purposes, such as:

1. Adding metadata: Decorators can be used to attach additional information or metadata to a class, method, property, or parameter. This metadata can be used by other code or tools at runtime or compile time.

2. Modifying behavior: Decorators can modify the behavior of a class, method, or property by wrapping it with additional logic or modifying its implementation. This can be useful for implementing aspects like logging, caching, validation, or authorization.

To use decorators, you need to enable the `experimentalDecorators` and `emitDecoratorMetadata` compiler options in your TypeScript configuration.

Here's an example to illustrate the usage of decorators:

```typescript
function log(target: any, propertyKey: string, descriptor: PropertyDescriptor) {
  const originalMethod = descriptor.value;

  descriptor.value = function (...args: any[]) {
    console.log(`Calling ${propertyKey} with arguments: ${args}`);
    const result = originalMethod.apply(this, args);
    console.log(`Method ${propertyKey} returned: ${result}`);
    return result;
  };

  return descriptor;
}

class MyClass {
  @log
  greet(name: string) {
    return `Hello, ${name}!`;
  }
}

const instance = new MyClass();
instance.greet("John");
```

In this example, the `log` decorator is applied to the `greet` method of the `MyClass` class. The decorator modifies the behavior of the `greet` method by adding logging statements before and after the original method execution.

When the `greet` method is called, the decorator intercepts the call, logs the arguments, invokes the original method, logs the return value, and returns the result.

Output:
```
Calling greet with arguments: John
Method greet returned: Hello, John!
```

Decorators can also be applied to classes, properties, and parameters, and they can have different signatures depending on the target element they are applied to.

It's important to note that decorators are still an experimental feature in TypeScript and may undergo changes in future versions.
