# 📚 Java Review - Fundamentals, Control Flow, OOP, and Functional Programming

A comprehensive educational project with practical examples of Java br.com.joaodev.fundamentals, br.com.joaodev.control structures, OOP principles, functional programming, and programming challenges.

## 📖 About the Project

This repository contains a structured review of Java's fundamental concepts, focusing on:
- **Fundamentals**: Primitive types, operators, type conversions, and string manipulation
- **Control Structures**: Conditionals and loops with practical examples
- **Exception Handling**: Try-catch blocks, custom br.com.joaodev.exceptions, and error management
- **OOP Principles**: Encapsulation, inheritance, polymorphism, and composition
- **Functional Programming**: Lambdas, br.com.joaodev.streams, and functional interfaces
- **Challenges**: Practical exercises to consolidate learning

Perfect for reviewing basic concepts or as study material for Java beginners and intermediates.

## 📁 Project Structure

```
java_review/
│
├── src/
│   ├── br.com.joaodev.fundamentals/           # Java fundamental concepts
│   │   ├── others/             # General examples (initial program, console, etc)
│   │   ├── numbers/            # Numeric conversion and primitive types
│   │   ├── operators/          # Operators (arithmetic, relational, logical, etc)
│   │   ├── strings/            # String manipulation
│   │   └── challenges/         # Arithmetic and operations challenges
│   │
│   ├── br.com.joaodev.control/                # Control flow structures
│   │   ├── conditionals/       # Conditionals (if, else, switch)
│   │   ├── loops/              # Repetition structures (for, while, do-while)
│   │   └── challenges/         # Control flow challenges
│   │
│   ├── br.com.joaodev.exceptions/            # Exception handling
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
│   ├── br.com.joaodev.classes/                # Basic Object-Oriented Programming
│   │   ├── others/             # Values and references concepts
│   │   ├── area/               # Class example with methods
│   │   ├── product/            # Example with overloading and static attributes
│   │   └── challenges/         # Class challenges
│   │       └── eat/            # Subpackage: relationship between br.com.joaodev.classes
│   │
│   ├── br.com.joaodev.oop/                    # Advanced Object-Oriented Programming
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
│   ├── br.com.joaodev.lambdas/                # Functional Programming with Lambdas
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
│   │   │   ├── Foreach.java   # Foreach with br.com.joaodev.lambdas
│   │   │   ├── Functions.java # Function examples
│   │   │   ├── Product.java   # Product class
│   │   │   ├── Suppliers.java # Supplier examples
│   │   │   └── UnaryOperators.java # Unary operators
│   │   └── tests/              # Lambda tests
│   │       ├── Calculation1Test.java
│   │       ├── Calculation2Test.java
│   │       └── Calculation3Test.java
│   │
│   ├── br.com.joaodev.arrays/                 # Array data structures
│   │   ├── challenges/         # Array challenges
│   │   └── others/             # Array examples
│   │
│   └── br.com.joaodev.collections/            # Java Collections (List, Set, Queue, Map)
│       └── (utility br.com.joaodev.classes and examples)
│   └── br.com.joaodev.streams/                # Stream API examples and challenges
│       ├── challenges/         # Stream challenges
│       ├── filters/            # Filtering br.com.joaodev.streams
│       ├── others/             # Other stream usages
│       └── reducers/           # Reducing br.com.joaodev.streams
│
└── README.md                   # This file
```

## 🛠️ Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **IDE** (recommended: IntelliJ IDEA or Eclipse)
- Git (for version br.com.joaodev.control)

## 💡 Concepts Covered

### Fundamentals
✅ Primitive types (int, double, boolean, etc)  
✅ Operators (arithmetic, relational, logical, ternary)  
✅ Type conversion  
✅ Strings and text manipulation  
✅ Wrapper br.com.joaodev.classes  
✅ Type inference  
✅ Input/Output with Scanner and System.out

### Control Flow
✅ Conditional structures (if, else, switch)  
✅ Loops (for, while, do-while)  
✅ Break and continue  
✅ Complex br.com.joaodev.control combinations

### Exceptions
✅ Exception handling (try, catch, finally)  
✅ Checked vs unchecked br.com.joaodev.exceptions  
✅ Custom br.com.joaodev.exceptions  
✅ Exception chaining  

### Basic OOP
✅ Class definition and attributes  
✅ Methods and constructors  
✅ Method overloading  
✅ Values vs. References  
✅ Null value  
✅ Static attributes  
✅ Relationship between br.com.joaodev.classes

### Advanced OOP
✅ Encapsulation (access modifiers, getters/setters)  
✅ Inheritance (extends, super, method overriding)  
✅ Polymorphism (method overloading/overriding, abstract br.com.joaodev.classes)  
✅ Composition (has-a relationships, aggregation)  
✅ One-to-many and many-to-many relationships  
✅ Abstract br.com.joaodev.classes and interfaces  
✅ Enums and constants

### Functional Programming
✅ Lambdas and functional interfaces  
✅ Predicates, consumers, suppliers, functions  
✅ Method references  
✅ Streams and collectors  
✅ Binary and unary operators  
✅ Composing predicates  
✅ Foreach with br.com.joaodev.lambdas  
✅ Threading with br.com.joaodev.lambdas

### Arrays
✅ Array declaration and initialization  
✅ Access to elements by index  
✅ Length property  
✅ Iteration with traditional for  
✅ Iteration with foreach  
✅ Multidimensional br.com.joaodev.arrays (matrices)  
✅ Arrays utility (toString, sort, etc)

### Collections
✅ List (ArrayList) - ordered and mutable br.com.joaodev.collections  
✅ Set (HashSet, TreeSet) - br.com.joaodev.collections without duplicates  
✅ Map (HashMap) - key-value structure  
✅ Queue (LinkedList) - FIFO structure  
✅ Deque - double-ended queue  
✅ Iteration over br.com.joaodev.collections  
✅ Common operations (add, remove, contains, etc)

## 🎯 Study Suggestions

1. **Start with br.com.joaodev.fundamentals**: Run examples in `br.com.joaodev.fundamentals/others/`
2. **Learn operators**: Study each operator type in `br.com.joaodev.fundamentals/operators/`
3. **Manipulate strings**: Work with examples in `br.com.joaodev.fundamentals/strings/`
4. **Practice challenges**: Solve challenges in `br.com.joaodev.fundamentals/challenges/`
5. **Master br.com.joaodev.control flow**: Learn conditionals in `br.com.joaodev.control/conditionals/`
6. **Work with loops**: Study loops in `br.com.joaodev.control/loops/`
7. **Challenge yourself**: Solve all challenges in `br.com.joaodev.control/challenges/`
8. **Exception handling**: Learn exception handling in `br.com.joaodev.exceptions/`
9. **Introduction to OOP**: Learn values and references concepts in `br.com.joaodev.classes/others/`
10. **Work with br.com.joaodev.classes**: Create and study br.com.joaodev.classes in `br.com.joaodev.classes/area/` and `br.com.joaodev.classes/product/`
11. **OOP projects**: Implement practical challenges in `br.com.joaodev.classes/challenges/`
12. **Advanced OOP**: Dive into encapsulation in `br.com.joaodev.oop/encapsulation/`
13. **Understand inheritance**: Explore `br.com.joaodev.oop/inheritance/` and its challenges
14. **Master polymorphism**: Study `br.com.joaodev.oop/polymorphism/` examples
15. **Learn composition**: Work with relationships in `br.com.joaodev.oop/composition/`
16. **Functional programming**: Explore br.com.joaodev.lambdas in `br.com.joaodev.lambdas/others/` and `br.com.joaodev.lambdas/interfaces/`
17. **Lambda challenges**: Solve challenges in `br.com.joaodev.lambdas/challenges/`
18. **Master br.com.joaodev.arrays**: Learn br.com.joaodev.arrays in `br.com.joaodev.arrays/` - foundation for br.com.joaodev.collections
19. **Work with br.com.joaodev.collections**: Explore List, Set, Map and Queue in `br.com.joaodev.collections/`
20. **Integrate everything**: Combine OOP + Lambdas + Arrays + Collections in complex projects
21. **Master br.com.joaodev.streams**: Explore Stream API in `br.com.joaodev.streams/`

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
