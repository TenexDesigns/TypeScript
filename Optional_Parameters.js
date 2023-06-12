Optional parameters in TypeScript allow you to define function parameters that are not required when calling the function. These optional parameters are denoted by adding a question mark (?) after the parameter name in the function declaration. Heres how you can use optional parameters in TypeScript:

typescript
Copy code
function greet(name: string, message?: string) {
  if (message) {
    console.log(message + ", " + name);
  } else {
    console.log("Hello, " + name);
  }
}

greet("John"); // Output: Hello, John
greet("Alice", "Hi"); // Output: Hi, Alice
In the above example, the message parameter is marked as optional by appending a question mark after its name in the function declaration. This means that when calling the greet function, you have the option to provide or omit the message argument.

When greet("John") is called, the message parameter is not provided, so the default message "Hello" is used.
When greet("Alice", "Hi") is called, the message parameter is provided with the value "Hi", and that value is used in the function.
Optional parameters are useful when you have parameters that may or may not be needed in every function invocation. They provide flexibility and allow you to avoid passing undefined or null values explicitly. Its important to note that optional parameters should always come after required parameters in the function signature.





























