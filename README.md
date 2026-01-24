# 📚 Java Review - Fundamentals, Control Flow, OOP, and Functional Programming

A comprehensive educational project with practical examples of Java fundamentals, control structures, OOP principles, functional programming, and programming challenges.

## 📖 About the Project

This repository contains a structured review of Java's fundamental concepts, focusing on:
- **Fundamentals**: Primitive types, operators, type conversions, and string manipulation
- **Control Structures**: Conditionals and loops with practical examples
- **Exception Handling**: Try-catch blocks, custom exceptions, and error management
- **OOP Principles**: Encapsulation, inheritance, polymorphism, and composition
- **Functional Programming**: Lambdas, streams, and functional interfaces
- **Challenges**: Practical exercises to consolidate learning

Perfect for reviewing basic concepts or as study material for Java beginners and intermediates.

## 📁 Project Structure

```
java_review/
│
├── src/
│   ├── fundamentals/           # Java fundamental concepts
│   │   ├── others/             # General examples (initial program, console, etc)
│   │   ├── numbers/            # Numeric conversion and primitive types
│   │   ├── operators/          # Operators (arithmetic, relational, logical, etc)
│   │   ├── strings/            # String manipulation
│   │   └── challenges/         # Arithmetic and operations challenges
│   │
│   ├── control/                # Control flow structures
│   │   ├── conditionals/       # Conditionals (if, else, switch)
│   │   ├── loops/              # Repetition structures (for, while, do-while)
│   │   └── challenges/         # Control flow challenges
│   │
│   ├── exceptions/            # Exception handling
│   │   ├── BasicExceptions.java
│   │   ├── CheckedVsNotChecked.java
│   │   ├── FinallyException.java
│   │   ├── custom/
│   │   │   ├── one/
│   │   │   │   ├── EmptyStringException.java
│   │   │   │   ├── NumberOutsideRangeException.java
│   │   │   │   ├── Validate.java
│   │   │   │   └── ValidateTest.java
│   │   │   └── two/
│   │   │       ├── EmptyStringException.java
│   │   │       ├── NumberOutsideRangeException.java
│   │   │       ├── Validate.java
│   │   │       └── ValidateTest.java
│   │   └── others/
│   │       ├── Cause.java
│   │       └── Student.java
│   │
│   ├── classes/                # Basic Object-Oriented Programming
│   │   ├── others/             # Values and references concepts
│   │   ├── area/               # Class example with methods
│   │   ├── product/            # Example with overloading and static attributes
│   │   └── challenges/         # Class challenges
│   │       └── eat/            # Subpackage: relationship between classes
│   │
│   ├── oop/                    # Advanced Object-Oriented Programming
│   │   ├── encapsulation/      # Encapsulation principles
│   │   │   ├── Person.java     # Person class with encapsulation
│   │   │   ├── PersonTest.java # Tests for Person
│   │   │   ├── houseone/       # Subpackage for house one
│   │   │   │   ├── Person1.java
│   │   │   │   └── Person2.java
│   │   │   └── housetwo/       # Subpackage for house two
│   │   │       ├── Person3.java
│   │   │       └── Person4.java
│   │   ├── inheritance/        # Inheritance concepts
│   │   │   ├── Direction.java  # Direction enum
│   │   │   ├── Hero.java       # Hero class
│   │   │   ├── Monster.java    # Monster class
│   │   │   ├── Player.java     # Player class
│   │   │   ├── challenges/     # Inheritance challenges
│   │   │   │   ├── Car.java
│   │   │   │   ├── Confort.java
│   │   │   │   ├── Ferrari.java
│   │   │   │   ├── HondaFit.java
│   │   │   │   └── SportsCar.java
│   │   │   └── tests/          # Tests for inheritance
│   │   │       ├── CarTest.java
│   │   │       └── GameTest.java
│   │   ├── polymorphism/       # Polymorphism examples
│   │   │   ├── Bean.java       # Bean class
│   │   │   ├── Dinner.java     # Dinner class
│   │   │   ├── Food.java       # Food class
│   │   │   ├── IceCream.java   # IceCream class
│   │   │   ├── Person.java     # Person class
│   │   │   ├── Rice.java       # Rice class
│   │   │   └── challenges/     # Polymorphism challenges
│   │   │       ├── AbstractTest.java
│   │   │       ├── Animal.java
│   │   │       ├── Dog.java
│   │   │       └── Mammal.java
│   │   └── composition/        # Composition relationships
│   │       ├── challenges/     # Composition challenges
│   │       │   ├── Customer.java
│   │       │   ├── Item.java
│   │       │   ├── Product.java
│   │       │   ├── Purchase.java
│   │       │   └── Software.java
│   │       └── many/           # Many-to-many and one-to-many
│   │           ├── to/
│   │           │   ├── many/
│   │           │   │   ├── Course.java
│   │           │   │   ├── CourseTest.java
│   │           │   │   └── Student.java
│   │           │   └── one/
│   │           │       ├── Car.java
│   │           │       ├── CarTest.java
│   │           │       └── Engine.java
│   │           └── one/
│   │               ├── to/
│   │               │   ├── many/
│   │               │   │   ├── Item.java
│   │               │   │   ├── Purchase.java
│   │               │   │   └── PurchaseTest.java
│   │
│   ├── lambdas/                # Functional Programming with Lambdas
│   │   ├── MultiplyCalculation.java # Lambda for multiplication
│   │   ├── PredicateComposition.java # Predicate composition
│   │   ├── ProductPredicate.java # Predicate for products
│   │   ├── SumCalculation.java # Lambda for sum
│   │   ├── challenges/         # Lambda challenges
│   │   │   ├── ProductChallenge.java # Product challenge
│   │   │   └── threads/        # Thread challenges
│   │   │       ├── Task1.java
│   │   │       └── Threads.java
│   │   ├── interfaces/         # Functional interfaces
│   │   │   └── Calculation.java # Calculation interface
│   │   ├── others/             # Lambda examples
│   │   │   ├── BinaryOperators.java # Binary operators
│   │   │   ├── Consumers.java # Consumer examples
│   │   │   ├── Foreach.java   # Foreach with lambdas
│   │   │   ├── Functions.java # Function examples
│   │   │   ├── Product.java   # Product class
│   │   │   ├── Suppliers.java # Supplier examples
│   │   │   └── UnaryOperators.java # Unary operators
│   │   └── tests/              # Lambda tests
│   │       ├── Calculation1Test.java
│   │       ├── Calculation2Test.java
│   │       └── Calculation3Test.java
│   │
│   ├── arrays/                 # Array data structures
│   │   ├── challenges/         # Array challenges
│   │   └── others/             # Array examples
│   │
│   └── collections/            # Java Collections (List, Set, Queue, Map)
│       └── (utility classes and examples)
│   └── streams/                # Stream API examples and challenges
│       ├── challenges/         # Stream challenges
│       ├── filters/            # Filtering streams
│       ├── others/             # Other stream usages
│       └── reducers/           # Reducing streams
│
└── README.md                   # This file
```

## 🛠️ Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **IDE** (recommended: IntelliJ IDEA or Eclipse)
- Git (for version control)

## 💡 Concepts Covered

### Fundamentals
✅ Primitive types (int, double, boolean, etc)  
✅ Operators (arithmetic, relational, logical, ternary)  
✅ Type conversion  
✅ Strings and text manipulation  
✅ Wrapper classes  
✅ Type inference  
✅ Input/Output with Scanner and System.out

### Control Flow
✅ Conditional structures (if, else, switch)  
✅ Loops (for, while, do-while)  
✅ Break and continue  
✅ Complex control combinations

### Exceptions
✅ Exception handling (try, catch, finally)  
✅ Checked vs unchecked exceptions  
✅ Custom exceptions  
✅ Exception chaining  

### Basic OOP
✅ Class definition and attributes  
✅ Methods and constructors  
✅ Method overloading  
✅ Values vs. References  
✅ Null value  
✅ Static attributes  
✅ Relationship between classes

### Advanced OOP
✅ Encapsulation (access modifiers, getters/setters)  
✅ Inheritance (extends, super, method overriding)  
✅ Polymorphism (method overloading/overriding, abstract classes)  
✅ Composition (has-a relationships, aggregation)  
✅ One-to-many and many-to-many relationships  
✅ Abstract classes and interfaces  
✅ Enums and constants

### Functional Programming
✅ Lambdas and functional interfaces  
✅ Predicates, consumers, suppliers, functions  
✅ Method references  
✅ Streams and collectors  
✅ Binary and unary operators  
✅ Composing predicates  
✅ Foreach with lambdas  
✅ Threading with lambdas

### Arrays
✅ Array declaration and initialization  
✅ Access to elements by index  
✅ Length property  
✅ Iteration with traditional for  
✅ Iteration with foreach  
✅ Multidimensional arrays (matrices)  
✅ Arrays utility (toString, sort, etc)

### Collections
✅ List (ArrayList) - ordered and mutable collections  
✅ Set (HashSet, TreeSet) - collections without duplicates  
✅ Map (HashMap) - key-value structure  
✅ Queue (LinkedList) - FIFO structure  
✅ Deque - double-ended queue  
✅ Iteration over collections  
✅ Common operations (add, remove, contains, etc)

## 🎯 Study Suggestions

1. **Start with fundamentals**: Run examples in `fundamentals/others/`
2. **Learn operators**: Study each operator type in `fundamentals/operators/`
3. **Manipulate strings**: Work with examples in `fundamentals/strings/`
4. **Practice challenges**: Solve challenges in `fundamentals/challenges/`
5. **Master control flow**: Learn conditionals in `control/conditionals/`
6. **Work with loops**: Study loops in `control/loops/`
7. **Challenge yourself**: Solve all challenges in `control/challenges/`
8. **Exception handling**: Learn exception handling in `exceptions/`
9. **Introduction to OOP**: Learn values and references concepts in `classes/others/`
10. **Work with classes**: Create and study classes in `classes/area/` and `classes/product/`
11. **OOP projects**: Implement practical challenges in `classes/challenges/`
12. **Advanced OOP**: Dive into encapsulation in `oop/encapsulation/`
13. **Understand inheritance**: Explore `oop/inheritance/` and its challenges
14. **Master polymorphism**: Study `oop/polymorphism/` examples
15. **Learn composition**: Work with relationships in `oop/composition/`
16. **Functional programming**: Explore lambdas in `lambdas/others/` and `lambdas/interfaces/`
17. **Lambda challenges**: Solve challenges in `lambdas/challenges/`
18. **Master arrays**: Learn arrays in `arrays/` - foundation for collections
19. **Work with collections**: Explore List, Set, Map and Queue in `collections/`
20. **Integrate everything**: Combine OOP + Lambdas + Arrays + Collections in complex projects
21. **Master streams**: Explore Stream API in `streams/`

## 🤝 Contributions

This is a personal educational project. Feel free to:
- Study and learn
- Add new examples
- Improve documentation
- Create more challenges

## 📝 License

This project is for free educational use.

## 👨‍💻 Author

**João Augusto Bonfante**  
📧 joao.dev93@gmail.com

## 📞 Support

For questions about the concepts:
1. Check the official Java documentation: [Oracle Java Docs](https://docs.oracle.com/javase/tutorial/)
2. Review the examples in the project
3. Test and experiment with modifications

---

**Last update**: January 24, 2026  
**Status**: ✅ Project under continuous review
