# Dependency Inversion Principle
## Acronym
- S : Single Responsibility Principle (SRP).
- O : Open closed Principle (OCP).
- L : Liskov substitution Principle (LSP).
- I : Interface Segregation Principle (ISP).
- D : Dependency Inversion Principle (DIP).

## Dependency Inversion Principle
### Definition
The Dependency Inversion Principle introduced by Robert C Martin states that High-level modules should not depend on low-level modules. 
Both should depend on abstractions. 
AND Abstractions should not depend on details. Details should depend on abstractions. 

To simplify this we can state that while designing the interaction between a high-level module and a low-level one, the interaction should be thought of as an abstract interaction between them. 

### Usage Intention
Before understanding the intention of usage, let’s try to understand a traditional application architecture implementation. During the process of the application design, lower-level components are designed to be consumed by higher-level components which enable increasingly complex systems to be built. 
In this Process of Composition, higher-level components depend directly upon lower-level components to achieve some task. 

### What
1. One should depend upon abstractions, not concretions.
2. Abstractions should not depend on the details whereas the details should depend on abstractions.
3. High-level modules should not depend on low level modules.

## How not to do it
See [DIP1 folder](DIP1) for source code.

## How to do it
See [DIPsolution folder](DIPsolution) for source code.
