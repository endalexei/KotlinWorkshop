package homework.day3

/*
    Exercise: Kotlin Sealed Classes
    1. Define a sealed class named 'Shape' with two subclasses: 'Circle' and 'Square'.
    Each shape should have a property for its color.
    - Create functions area() and perimeter() in both 'Circle' and 'Square' classes to calculate their respective area and perimeter.
    - Write a function named printShapeInfo() that takes a 'Shape' object as a parameter and prints its color, area, and perimeter.

    2. Define a sealed class named Result<T> with two subclasses: Success<T> and Error.
    Success should hold a value of type T, and Error should hold an error message.
    - Create a function named processResult() that takes a Result object as a parameter and prints either the success value or the error message.

    Example Output:
    For exercise 1: ```
                    Circle - Color: Red
                    Area: 78.54
                    Perimeter: 31.42

                    Square - Color: Blue
                    Area: 25.0
                    Perimeter: 20.0
                    ```

    For exercise 2: Processing Success: Hello, Kotlin!
                    Processing Error: File not found.
 */