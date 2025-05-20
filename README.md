# Java Flow Control Challenge - DIO 🚀
This project is a solution to the Flow Control module challenge from DIO's Java bootcamp.

Challenge Description 📝

The program receives two integer numbers as parameters via the terminal. It then calculates the difference between these two numbers to determine how many times a for loop will execute. Inside the loop, the program prints messages indicating the current iteration number.

Rules:

    The first parameter represents the starting number, and the second parameter represents the ending number.
    The system iterates from 1 up to the difference between the second and the first parameter.
    If the first parameter is GREATER than the second, a custom exception called ParametrosInvalidosException is thrown with the message: "O segundo parâmetro deve ser maior que o primeiro" (The second parameter must be greater than the first).

Example Usage:

If the numbers 12 and 30 are provided:

    The program will perform 30 - 12 = 18 iterations.
    The following messages will be printed:
        "Imprimindo o número 1" (Printing number 1)
        "Imprimindo o número 2" (Printing number 2)
        ...
        "Imprimindo o número 18" (Printing number 18)

How to Run ⚙️

    Clone this repository.
    Navigate to the project directory.
    Compile the Java files: javac Contador.java ParametrosInvalidosException.java
    Run the program, passing two integer numbers as arguments: java Contador <number1> <number2>
        Example: java Contador 5 10


