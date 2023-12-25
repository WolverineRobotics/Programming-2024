

# assignment1

- [assignment1](#assignment1)
  * [Lab](#lab)
    + [Lab 1 Question](#lab-1-question)
    + [Lab 1 Solution](#lab-1-solution)
    + [Lab 2 Question](#lab-2-question)
    + [Lab 2 Solution](#lab-2-solution)
  * [Assignment](#assignment)

Welcome to Assignment 1.

First there is an [Lab](#lab) to get you familiar with stuff.

Secondly, there are a couple of assignment questions you should do before the next class where we'll go over the solutions together.

## Lab

### Lab 1 Question

Create a simple program that adds two numbers together. Hard-code variables `x` and `y` with values `10` and `20` respectively. Then create a variable `z` that will sum these two numbers together and print out `z`.

### Lab 1 Solution

Your program may look like this (but it doesn't have to):

[MyProgram.java](MyProgram.java)

```java
public class MyProgram {
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 20;
        z = x + y;
        System.out.println(z);
    }
}
```

Please take note of one new thing here. Here, we declared multiple variables in the same line using commas: `int x, y, z;` instead of the traditional way we have been doing it where we declare one variable per line: `int x; int y; int z;`. This is just a shortcut to make the code more compact. Both ways are equivalent.

Output

```
30
```

### Lab 2 Question

Create a program that computes this math expression:

```
3 + (6 * 5)
```

You should hard-code the numbers `3`, `6`, and `5` into variables `x`, `y`, and `z` respectively. Then create a variable `w` that will compute the expression above and print out `w`. To do the computations, create two methods: `add(int, int)` and `multiply(int, int)` that will add and multiply two numbers together respectively. Then use these methods in your main method to compute the expression above.

### Lab 2 Solution

Your program may look like this (but it doesn't have to):

[MyOtherProgram.java](MyOtherProgram.java)

```java
public class MyOtherProgram {

    public static int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static int multiply(int a, int b) {
        int ans = a * b;
        return ans;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int z = 5;
        int w = add(x, multiply(y, z));
        System.out.println(w);
    }
}

```

Output

```
33
```

## Assignment

Create a method called `f` that returns `int` and takes in one parameter `x` of type `int`. This method should implement the following mathematical function:

```
f(x) = 3x + 8
```

Use this main method to test your function:

```java
public static void main(String[] args) {
    int x = 2;
    int y = f(x);
    System.out.println(y); // should print 14
}
```

Here's the method header to get you started:

```java
public static int f(int x)
```

Output
```
14
```