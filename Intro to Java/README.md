# Intro to Java

My repository for practicing Java. Assignments come from the "Intro to Java" class at the RevaturePro website.

## Notes

An **IDE** is also called an **integrated development environment**, where you can program in Java. IDEs also provide functionality for other languages. IDEs generally provide a code editor, a compiler or interpreter, and a debugger that the developer accesses through a united graphical user interface (GUI).

Some people swear by [Eclipse](https://www.eclipse.org/downloads/). But Revature taught me how to use [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows), which is fucking awesome.

### Primitive Data Types

There are 8 primitive data types, or **primitives**:
* **boolean**: True or false. Use when you need to represent a value that only has one of two choices, like on or off. The default value of a boolean is false.
* **char**: A single 16-bit Unicode sequence, or a **character**. A char value is represented by `char letter = 'a'`, where "a" is the letter you plan to represent, enclosed in single quotes. Possible chars include anything from `\u0000` or "0" to `\uffff` or "65,535."
  * **Unicode** is a way to represent characters from any language around the world via a number system. For example, "A" is represented by `\u0041`, and "a" is represented by `\u0061`.
* **byte**: The shortest way to denote a number in Java. A byte is an 8-bit whole number and can only represent numbers from 0 to 127. It can also represent negative numbers as low as -128.
* **short**: Another way to denote a number in Java. A short is a 16-bit whole number.
* **int**: The average way to denote a number in Java, considered the "happy medium" among all values denoting numbers. It is often recommended for denoting *whole* numbers. An int is a 32-bit whole number.
* **long**: Another way to denote a number in Java. A long is a 64-bit whole number.
* **float**: Another way to denote a number in Java and can represent a number with a decimal point. A float is a 32-bit floating point number.
* **double**: The largest way to denote a number in Java and can represent a number with a decimal point. A double is a 64-bit floating point number and takes the most memory to store and use.

Most of the number data types support **two's complement**, a numbering system used to represent negative values. Byte, short, int, and long are all signed two's complement representations.

The data range of each number data type can be determined by using the number of bits it supports and applying this number to the following formula: -2<sup>n–1</sup> to find the lower bound and 2<sup>n–1</sup>–1 to find the upper bound.

Currency is represented, not by a primitive data type, but by using the built-in Java class `BigDecimal`.

### Mutating Information

We define information by using data types. We can mutate, or change, information by using **operators**.

There are several categories of operators. Following is a list of all the operators used in Java in order of their precedence:
* **Parenthesis, array indices, dot:** (), [], .
* **Postfix:** ++, --
  * These operators add or subtract one from an expression.
* **Multiplicative:** *, /, %
* **Additive:** +, -
* **Bit-Shift:** <<, >>, >>>
  * These operators shift the binary representation of a number left or right.
* **Relational:** <, >, <=, >=, instanceof
* **Equality:** ==, !=
* **Bitwise:** &, ^, |
  * These operators are used to manipulate the binary representations of values.
* **Logical:** &&, ||
* **Ternary (Conditional):** expression_1 ? expression_2 : expression_3
* **Assignment:** =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=

The main **assignment operator (=)** takes whatever statement is on the right side of the operator and stores it in, or *assigns* it to, the variable on the left side. It is a **right-to-left operator** because it must compute the value on the right side before it can store it in the left.

### Arrays

**Arrays** can hold a single type of data (primitive or class type). They are fast and efficient at obtaining data, since all data is stored in sequence.

* Each piece of data in an array is called an **element**.
* Each element has a position in the array called an **index**.
  * Array indices start at 0.
* The length of an array is the number of elements that it can hold.
* An array is created by specifying the data type, followed by brackets ([]), followed by a variable name.
* There are two ways to initialize an array:
  * The first allows you to create an array with n number of elements with default or null values. For an array with five elements, the code would be `int[] MyArray = new int[5];`.
  * The second allows you to initialize on array on the same line that you declare it. You simply type the values within curly braces ({}), each separated by commas: `int[] myArray = {1, 2, 3, 4, 5};`.
* To access a specific element in an array, you need to know its index: `System.out.println(myArray[3]);` to print out the value in index 3 (the fourth element).
* To change the value of an element, you will also need its index: `myArray[1] = 7;` to change the value of index 1 (the second element) to 7.
* You can access the .length property of an array to access the length of an array. Use the variable name and the dot operator with the length property to access the length of the array: `myArray.length;`.
  * The main method (`public static void main(String[] args) {}`) specifies an array of strings called "args." You could discover the length of this array by typing `System.out.println(args.length);`.

Anytime you create data types other than primitive, such as when creating an array, you'll use the "new" keyword.

You can access an index that doesn't exist within a given array, but you will run into an **exception** with the heading "ArrayIndexOutOfBoundsException."

#### Multi-dimensional Arrays

Above we discussed one-dimensional arrays, but an entirely different array can serve as an element of any given array. When an array is nested within an array, you need two numbers to identify the location of any given element. These are **two-dimensional** arrays. Similarly, an array nested inside of an array that is nested within another array is a ***three-dimensional array**.

Multi-dimensional arrays are initialized in the same way as one-dimensional arrays, but with multiple sets of brackets ([]), one set for each dimension. Below is an example:

```java
// declare a 2d array - using the literal method
int[][] array2d = { {1, 2}, {3, 4} };

// declare a 2d array - using the "new" method
int[][] array2d = new int[1][2];

// access the (0, 0) element
Sytem.out.println(array2d[0][0]);

// change the value of the (0, 0) element
array2d[0][0] = 1;
```

### Boolean Logic and Algebra

**Boolean algebra** is the conversion of logical statements to a mathematical expression, where the same laws of mathematics applies. The inputs and outputs in boolean algebra are only "true" or "false."

There are several different types of boolean operators:
* **AND:** Both values must be true for the result to be true.
* **OR:** Either value must be true for the result to be true, but at least one value must be true.
* **XOR:** One and only one of the values can be true for the result to be true.
* **XNOR:** Both values must be either true or false (they must match) for the result to be true.

#### If-Statements

An **if-statement** is a construct that forces a program to make a decision regarding what code to execute next:

```java
if (condition) {
    ...;
}
```

If-statements can only be within the scope of the main method.

#### Else Statements

An **else statement** identifies a block of code to execute in the opposite condition of the if-statement.

```java
if (condition) {
    ...;
} else {
    ...;
}
```

#### Else-if Statements

An **else-if statement** allows you to specify additional conditions to execute blocks of code in association with the if-statement.

```java
if (condition_1) {
    ...;
} else if (condition_2) {
    ...;
} else {
    ...;
}
```

#### Switch Statements

**Switch statemnents** can be used in lieu of multiple if-statements. A switch specifies conditions through which a program will enter based on matching a value and executing the associated statements.

```java
// Create a variable for use with the switch statement.
// Supported variable types: int, char, short, byte, String, and enum.

int value = 5;

switch (value) {
    case someValue:
        ...;
}
```

Switch statements support **fall-through logic**. This means that whenever a program enters the switch statement, it will execute all other cases that follow the first true switch "case."

If we want to prevent fall-through logic, you can use the `break;` keyword to create a break statement that will tell the program to exit the switch statement at this point. Most programs will require a break after *each* case.

Using the keyword `default;` you can specify a case to run when none of the others are matched. Default statements are usually placed at the end of the switch statement, following all named cases.

#### Compound Conditions

**Compound conditions** allow us to create a statement that tests two smaller logical statements. See the following examples:

```java
// Test whether 4 is between 0 and 10.

if (4 < 10 && 4 > 0) {
    ...;
}

// Test whether 4 is less than 10 or 4 is greater than 10.

if (4 < 10 || 4 > 10) {
    ...;
}
```

Both `&&` and `||` are considered "short circuit" operators because they may only test the left-hand side of the expression if the left-hand side results in an answer. For example, in the second example, if `4 < 10` were true, then the expression would evaluate as true, and the right-hand side (`4 > 10`) is never tested. However, in this case, it *is* tested.

### Algorithms and Data Structures

An **algorithm** is a series of steps we must go through in order to solve a particular type of problem, even when the inputs are different. A program is often made up of multiple, smaller algorithms.

Two resources are used to evaluate algorithms: **time** and **memory**. The less the amount of time and memory used by a program, the more efficient the program is. The way that an algorithm is structured and organized can affect the performance of an algorithm.

**Data structures** are standardized ways of organizing data, and different data structures are better at different tasks. Arrays, for example, have quick lookup times, but their size is fixed entirely.

#### Pseudocode

