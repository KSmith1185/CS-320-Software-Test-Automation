# CS-320-Software-Test-Automation

How can I ensure that my code, program, or software is functional and secure?

TO ensure functionality and security in my code, I rely on a structured and disciplined approach to unit testing. Writing comprehensive JUnit tests for each service 
and method allows me to verify that the program behaves as expected across a variety of input scenarios. In particular, my ContactServiceTest.java file tests for proper handling of null 
values, duplicate entries and correct record deletion. These test help prevent logic errors and enforce data integrity. I also make sure to follow clean coding practices, I 
create reliable and maintainable software that minizies the risk of failure.

How do I interpret user needs and incorporate them into a program?

Understanding user needs starts with analyzing the project requirements and idenfiying what the user expects the software to do. For each project in this course, I 
began by reviewing the functional requirements and translating them into clear, testable goals. For example, the contact management project required unique
identifiers, field length limits and non-null constraints. I incorporated these rules directly into the design of the Contact class and validated them
Through targeted tests. By focusing on how users interact with the application and the potential edge cases they might encounter, I was able to design code that meets 
expectations and handles errors efficiently.

How do I approach designing software?

My approach to designing software begins with simplicity, clarity and modularity. I break down the program into logical components, such as data models, services and tests, so each 
part has a single, well-defined responsibility. Before coding, I outline the requirements and plan the structure to ensure that the system is both scalable and testable. During
development, I continually test and alter to keep the code clean and efficient. In this course, I applied this approach by creating seperate service classes to manage business logic and 
maintain testable interfaces. This structure made it easier to add unit tests and modify the software as needed without introducing bugs or complexity.
