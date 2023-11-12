In TypeScript, a union type is a type formed from two or more other types, representing values that may be any one of those types. We use the vertical bar (`|`) to separate each type, so `number | string | boolean` is the type of a value that can be a number, a string, or a boolean [Source 0](https://www.typescriptlang.org/docs/handbook/unions-and-intersections.html?ref=hackernoon.com).

Here is an example of a function that accepts a union type:

```typescript
function printStatusCode(code: string | number) {
  console.log(`My status code is ${code}.`)
}
printStatusCode(404);
printStatusCode('404');
```
In this example, the function `printStatusCode` can accept either a string or a number [Source 2](https://www.w3schools.com/typescript/typescript_union_types.php).

Discriminated or tagged unions are a common technique for working with unions. This involves having a single field which uses literal types which you can use to let TypeScript narrow down the possible current type. For example:

```typescript
type NetworkLoadingState = {
  state: "loading";
};
type NetworkFailedState = {
  state: "failed";
  code: number;
};
type NetworkSuccessState = {
  state: "success";
  response: {
    title: string;
    duration: number;
    summary: string;
  };
};
// Create a type which represents only one of the above types
// but you aren't sure which it is yet.
type NetworkState =
  | NetworkLoadingState
  | NetworkFailedState
  | NetworkSuccessState;
```
In this example, all the types have a field named `state`, and then they also have their own fields. Given the `state` field is common in every type inside `NetworkState` - it is safe for your code to access without an existence check [Source 0](https://www.typescriptlang.org/docs/handbook/unions-and-intersections.html?ref=hackernoon.com).

Unions are very powerful in TypeScript, but it's important to remember that when a value is a union type, TypeScript will only allow access to members that exist on all possible types [Source 6](https://www.codecademy.com/resources/docs/typescript/unions).

Intersection types (`&`), which are closely related to union types, allow you to combine multiple types into one. This means an object of this type will have all members of all three types [Source 0](https://www.typescriptlang.org/docs/handbook/unions-and-intersections.html?ref=hackernoon.com).

```typescript
interface ErrorHandling {
  success: boolean;
  error?: { message: string };
}
 
interface ArtworksData {
  artworks: { title: string }[];
}
 
interface ArtistsData {
  artists: { name: string }[];
}
 
// These interfaces are composed to have
// consistent error handling, and their own data.
 
type ArtworksResponse = ArtworksData & ErrorHandling;
type ArtistsResponse = ArtistsData & ErrorHandling;
```
In this example, we see that `ArtworksResponse` and `ArtistsResponse` are types that have both `ErrorHandling` and their own respective data types.

To summarize, union types allow a variable to be one of several types, and TypeScript will only allow you to do things with the variable that are valid for every type in the union. Intersection types allow you to combine multiple types into one, so that you can handle more complex type situations.




  ....
