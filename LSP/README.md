# Liskov Substitution Principle
## Acronym
- S : Single Responsibility Principle (SRP).
- O : Open closed Principle (OSP).
- L : Liskov substitution Principle (LSP).
- I : Interface Segregation Principle (ISP).
- D : Dependency Inversion Principle (DIP).

## Liskov Substitution Principle:
1. Introduced by [Barbara Liskov](https://en.wikipedia.org/wiki/Barbara_Liskov), it states that "objects in a program should be replaceable with instances of their sub-types without altering the correctness of that program".
2. If a program module is using a base class, then the reference to the base class can be replaced with a derived class without affecting the functionality of the program module.
3. We can also state that derived types must be substitutable for their base types.

## Implementation guidelines
In the process of development we should ensure that: 
1. No new exceptions can be thrown by the subtype unless they are part of the existing exception hierarchy. 
2. We should also ensure that clients should not know which specific subtype they are calling, nor should they need to know that. The client should behave the same regardless of the subtype instance that it is given. 
3. And last but not the least, newly derived classes just extend without replacing the functionality of old classes.

## How not to do it
See [LSP1 folder](LSP1) for source code.

## How to do it
See [LSPsolution folder](LSPsolution) for source code.
