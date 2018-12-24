# SOLID

## Introduction
1. SOLID principles are the design principles that enable us manage most of the software design problems.
2. The term SOLID is an acronym for five design principles intended to make software designs more understandable, flexible and maintainable.
3. The principles are a subset of many principles promoted by Robert C. Martin.
4. The SOLID acronym was first introduced by Michael Feathers.

## Acronym
- S : Single Responsibility Principle ([SRP](SRP)).
- O : Open closed Principle ([OCP](OCP)).
- L : Liskov substitution Principle ([LSP](LSP)).
- I : Interface Segregation Principle ([ISP](ISP)).
- D : Dependency Inversion Principle ([DIP](DIP)).

### Single Responsibility Principle:
1. Robert C. Martin expresses the principle as: "A class should have only one reason to change.".
2. Every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class.

### Open/Closed Principle:
1. Software entities should be open for extension, but closed for modification.
2. The design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code.
3. The design should be done in a way to allow the adding of new functionality as new classes, keeping as much as possible existing code unchanged.

### Liskov Substitution Principle:
1. Introduced by [Barbara Liskov](https://en.wikipedia.org/wiki/Barbara_Liskov){:target="_blank"}, it states that "objects in a program should be replaceable with instances of their sub-types without altering the correctness of that program".
2. If a program module is using a base class, then the reference to the base class can be replaced with a derived class without affecting the functionality of the program module.
3. We can also state that derived types must be substitutable for their base types.

### Interface Segregation Principle:
1. Many client-specific interfaces are better than one general-purpose interface.
2. We should not enforce clients to implement interfaces that they don't use. Instead of creating one big interface we can break down it to smaller interfaces.

### Dependency Inversion Principle:
1. One should depend upon abstractions, not concretions.
2. Abstractions should not depend on the details whereas the details should depend on abstractions.
3. High-level modules should not depend on low level modules.

## If we don’t follow SOLID Principles we:
1. End up with tight or strong coupling of the code with many other modules/applications.
2. Tight coupling causes time to implement any new requirement, features or any bug fixes and some times it creates unknown issues.
3. End up with a code which is not testable.
4. End up with duplication of code.
5. End up creating new bugs by fixing another bug.
6. End up with many unknown issues in the application development cycle.

## Following SOLID Principles helps us to:
1. Achieve reduction in complexity of code.
2. Increase readability, extensibility and maintenance.
3. Reduce error and implement reusability.
4. Achieve better testability.
5. Reduce tight coupling.
 
