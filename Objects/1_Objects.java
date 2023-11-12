In TypeScript, objects are instances that contain a set of key-value pairs. The values can be scalar values, functions, or even arrays of other objects. The syntax for creating an object is as follows:

```typescript
var object_name = {
  key1: "value1", // scalar value
  key2: "value",
  key3: function() {
    // function
  },
  key4: ["content1", "content2"] // collection
};
```

For example, you can create an object using object literal notation:

```typescript
var person = {
  firstname: "Tom",
  lastname: "Hanks"
};

// Access the object values
console.log(person.firstname);
console.log(person.lastname);
```

Output:
```
Tom
Hanks
```

In TypeScript, objects must have a type template. If you want to add a function to an object later, you can use a method template in the declaration. Here's an example:

```typescript
var person = {
  firstName: "Tom",
  lastName: "Hanks",
  sayHello: function() {} // Type template
};

person.sayHello = function() {
  console.log("hello " + person.firstName);
};

person.sayHello();
```

Output:
```
hello Tom
```

Objects can also be passed as parameters to functions. Here's an example:

```typescript
var person = {
  firstname: "Tom",
  lastname: "Hanks"
};

var invokeperson = function(obj: { firstname: string, lastname: string }) {
  console.log("first name: " + obj.firstname);
  console.log("last name: " + obj.lastname);
};

invokeperson(person);
```

Output:
```
first name: Tom
last name: Hanks
```

You can also create and pass an anonymous object on the fly. Here's an example:

```typescript
var invokeperson = function(obj: { firstname: string, lastname: string }) {
  console.log("first name: " + obj.firstname);
  console.log("last name: " + obj.lastname);
};

invokeperson({ firstname: "Sachin", lastname: "Tendulkar" });
```

Output:
```
first name: Sachin
last name: Tendulkar
```

In TypeScript, duck-typing allows objects to be considered of the same type if they share the same set of properties. Duck-typing verifies the presence of certain properties in the objects, rather than their actual type, to check their suitability. Here's an example:

```typescript
interface IPoint {
  x: number;
  y: number;
}

function addPoints(p1: IPoint, p2: IPoint): IPoint {
  var x = p1.x + p2.x;
  var y = p1.y + p2.y;
  return { x: x, y: y };
}

// Valid
var newPoint = addPoints({ x: 3, y: 4 }, { x: 5, y: 1 });

// Error
var newPoint2 = addPoints({ x: 1 }, { x: 4, y: 3 });
```

I hope this helps! Let me know if you have any further questions.



  ...
