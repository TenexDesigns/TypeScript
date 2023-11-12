The provided article covers various aspects of working with strings in TypeScript, including the String object, its methods, and examples of how to use these methods. Here's a summary:

### String Object
The `String` object in TypeScript wraps the string primitive data type and provides several helper methods.

#### Properties
1. **Constructor:**
   - Returns a reference to the `String` function that created the object.
   - Example:
     ```typescript
     var str = new String("This is string");
     console.log("str.constructor is:" + str.constructor);
     ```

2. **Length:**
   - Returns the length of the string.
   - Example:
     ```typescript
     var uname = new String("Hello World");
     console.log("Length " + uname.length);
     ```

3. **Prototype:**
   - Allows adding properties and methods to an object.
   - Example:
     ```typescript
     function employee(id: number, name: string) {
       this.id = id;
       this.name = name;
     }
     var emp = new employee(123, "Smith");
     employee.prototype.email = "smith@abc.com";
     console.log("Employee's Id: " + emp.id);
     console.log("Employee's name: " + emp.name);
     console.log("Employee's Email ID: " + emp.email);
     ```

### String Methods
The article lists various methods available in the `String` object along with their descriptions. Here are a few examples:

1. **charAt():**
   - Returns the character at the specified index.
   - Example:
     ```typescript
     var str = new String("This is string");
     console.log("str.charAt(0) is:" + str.charAt(0));
     ```

2. **charCodeAt():**
   - Returns the Unicode value of the character at the given index.
   - Example:
     ```typescript
     var str = new String("This is string");
     console.log("str.charCodeAt(0) is:" + str.charCodeAt(0));
     ```

3. **concat():**
   - Combines the text of two strings and returns a new string.
   - Example:
     ```typescript
     var str1 = new String("This is string one");
     var str2 = new String("This is string two");
     var str3 = str1.concat(str2);
     console.log("str1 + str2 : " + str3);
     ```

4. **indexOf():**
   - Returns the index of the first occurrence of the specified value.
   - Example:
     ```typescript
     var str1 = new String("This is string one");
     var index = str1.indexOf("string");
     console.log("indexOf found String :" + index);
     ```

5. **lastIndexOf():**
   - Returns the index of the last occurrence of the specified value.
   - Example:
     ```typescript
     var str1 = new String("This is string one and again string");
     var index = str1.lastIndexOf("string");
     console.log("lastIndexOf found String :" + index);
     ```

6. **localeCompare():**
   - Compares two strings based on the current locale.
   - Example:
     ```typescript
     var str1 = new String("This is beautiful string");
     var index = str1.localeCompare("This is beautiful string");
     console.log("localeCompare first :" + index);
     ```

7. **replace():**
   - Finds a match between a regular expression and a string and replaces the matched substring.
   - Example:
     ```typescript
     var re = /apples/gi;
     var str = "Apples are round, and apples are juicy.";
     var newstr = str.replace(re, "oranges");
     console.log(newstr);
     ```

8. **search():**
   - Executes a search for a match between a regular expression and a specified string.
   - Example:
     ```typescript
     var re = /apples/gi;
     var str = "Apples are round, and apples are juicy.";
     if (str.search(re) == -1) {
       console.log("Does not contain Apples");
     } else {
       console.log("Contains Apples");
     }
     ```

9. **slice():**
   - Extracts a section of a string and returns a new string.
   - Example:
     ```typescript
     var str = "Apples are round, and apples are juicy.";
     var sliced = str.slice(3, -2);
     console.log(sliced);
     ```

10. **split():**
    - Splits a string into an array of strings based on a separator.
    - Example:
      ```typescript
      var str = "Apples are round, and apples are juicy.";
      var splitted = str.split(" ", 3);
      console.log(splitted);
      ```

11. **substr():**
    - Returns a substring beginning at a specified location with a specified number of characters.
    - Example:
      ```typescript
      var str = "Apples are round, and apples are juicy.";
      console.log("(1,2): " + str.substr(1, 2));
      ```

12. **substring():**
    - Returns a substring between two indexes in the string.
    - Example:
      ```typescript
      var str = "Apples are round, and apples are juicy.";
      console.log("(1,2): " + str.substring(1, 2));
      ```

13. **toLocaleLowerCase():**
    - Converts characters within a string to lowercase respecting the current locale.
    - Example:
      ```typescript
      var str = "Apples are round, and Apples are Juicy.";
      console.log(str.toLocaleLowerCase());
      ```

14. **toLocaleUpperCase():**
    - Converts characters within a string to uppercase respecting the current locale.
    - Example:
      ```typescript
      var str = "Apples are round, and Apples are Juicy.";
      console.log(str.toLocaleUpperCase());
      ```

15. **toLowerCase():**
    - Converts the calling string value to lowercase.
    - Example:
      ```typescript
      var str = "Apples are round, and Apples are Juicy.";
      console.log(str.toLowerCase());
      ```

16. **toString():**
    - Returns a string representing the specified object.
    - Example:
      ```typescript
      var str = "Apples are round, and Apples are Juicy.";
      console.log(str.toString());
      ```

17. **toUpperCase():**
    - Converts the calling string value to uppercase.
    - Example:
      ```typescript
      var str = "Apples are round, and Apples are Juicy.";
      console.log(str.toUpperCase());
      ```

18. **valueOf():**
    - Returns the primitive value of a String object.
    - Example:
      ```typescript
      var str = new String("Hello world");
      console.log(str.valueOf());
      ```

These methods cover a wide range of string manipulation operations, making it easier

 to work with strings in TypeScript.



  ////
