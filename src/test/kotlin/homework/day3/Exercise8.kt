package homework.day3

/*
    Exercise: Kotlin Delegation
    1. Create a class named 'Logger' with a log(message: String) function that prints the message to the console.
    - Create a class named 'Service' that contains an instance of the Logger class and delegates the log() function to it.

    2. Define an interface named 'Worker' with a work() function.
    - Create a class named 'Developer' that implements the 'Worker' interface and prints "Coding..." when the work() function is called.
    - Create a class named 'Manager' that also implements the 'Worker' interface and prints "Managing tasks..." when the work() function is called.
    - Create a class named 'TeamLead' that contains an instance of 'Worker' and delegates the work() function to it.

    3. Create a class named 'FileHandler' with a readFile() function that simulates reading a file and returns its content as a String.
    - Create a class named 'BackupManager' that contains an instance of 'FileHandler' and delegates the readFile() function to it.

    Example Output:
    For exercise 1: Logging: Message from Service
    For exercise 2: Developer is working: Coding...
                    Manager is working: Managing tasks...
                    TeamLead is working: Coding...
    For exercise 3: Reading file: Sample.txt
                    File content: Lorem ipsum dolor sit amet...
 */