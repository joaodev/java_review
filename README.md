# 📚 Java Review - Fundamentals, Control Flow, and OOP

A comprehensive educational project with practical examples of Java fundamentals, control structures, OOP principles, and programming challenges.

## 📖 About the Project

This repository contains a structured review of Java's fundamental concepts, focusing on:
- **Fundamentals**: Primitive types, operators, type conversions, and string manipulation
- **Control Structures**: Conditionals and loops with practical examples
- **OOP Principles**: Encapsulation, inheritance, polymorphism, and composition
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
│   ├── arrays/                 # Array data structures
│   │   ├── challenges/         # Array challenges
│   │   └── others/             # Array examples
│   │
│   └── collections/            # Java Collections (List, Set, Queue, Map)
│       └── (utility classes and examples)
│
└── README.md                   # This file
```

## 🎓 Module Content

### Fundamentals

#### Others
- `FirstProgram.java` - First program: basic initialization
- `Console.java` - Console manipulation and output
- `Import.java` - Import usage and libraries
- `DotNotation.java` - Dot notation for accessing members
- `PrimitiveTypes.java` - Primitive data types
- `ObjectVsPrimitive.java` - Differences between objects and primitives
- `Wrappers.java` - Wrapper classes (Integer, Double, etc)
- `Inference.java` - Type inference (var)
- `Calculator.java` - Calculator example
- `Temperature.java` - Temperature conversion
- `CircumferenceArea.java` - Circumference and area calculation

#### Numbers
- `PrimitiveTypeConversion.java` - Conversion between primitive types
- `StringNumberConversion.java` - Conversion between strings and numbers

#### Operators
- `ArithmeticOperators.java` - Arithmetic operators (+, -, *, /, %)
- `AssignmentOperators.java` - Assignment operators (+=, -=, etc)
- `RelationalOperators.java` - Relational operators (==, !=, <, >, etc)
- `LogicalOperators.java` - Logical operators (&&, ||, !)
- `UnaryOperators.java` - Unary operators (++, --, !)
- `TernaryOperators.java` - Ternary operator (? :)

#### Strings
- `StringType.java` - String type and properties
- `StringEqualsType.java` - String comparison
- `StringNumberConversion.java` - String and number conversion

#### Challenges
- `ArithmeticChallenge.java` - Challenge: complex mathematical calculations
- `ConversionChallenge.java` - Challenge: type conversion
- `LogicalChallenge.java` - Challenge: logical operations

### Control

#### Conditionals
- `IfControl.java` - Simple if structure
- `IfElseControl.java` - If-else structure
- `IfElseIfControl.java` - If-else if structure
- `Switch1Control.java` - Basic switch
- `Switch2Control.java` - Advanced switch
- `Break1Control.java` - Break usage in conditionals
- `Break2Control.java` - Break usage in loops
- `Continue1Control.java` - Continue usage in loops
- `Continue2Control.java` - Continue with multiple scenarios

#### Loops
- `For1Loop.java` - Basic for loop
- `For2Loop.java` - For with multiple variables
- `For3Loop.java` - For with variations
- `WhileDeterminedLoop.java` - While with determined condition
- `WhileIndeterminateLoop.java` - While with indeterminate condition
- `DoWhileLoop.java` - Do-while loop

#### Challenges
- `ForChallenge.java` - Challenge: for loop usage
- `WhileChallange.java` - Challenge: while loop usage
- `WeekDayChallenge.java` - Challenge: days of the week with switch

### Classes (Basic Object-Oriented Programming)

#### Others
- `ValueVsReference.java` - Difference between values and references
- `NullValue.java` - Understanding null in Java

#### Area
- `AreaCircle.java` - Class for calculating circle area
- `AreaCircleTest.java` - Tests for AreaCircle class

#### Product
- `Product.java` - Product class with discount calculation
- `ProductTest.java` - Tests for Product class

#### Challenges
- `DateChallenge.java` - Challenge: class for date manipulation
- `DateTestChallenge.java` - Tests for DateChallenge class
- `InstanceChallenge.java` - Challenge: working with instances
- `eat/` - Subpackage with relationship challenge between classes
  - `Food.java` - Class representing food
  - `Person.java` - Class representing person
  - `Dinner.java` - Class relating person and food

### OOP (Advanced Object-Oriented Programming)

#### Encapsulation
- `Person.java` - Person class demonstrating encapsulation
- `PersonTest.java` - Tests for Person class
- `houseone/` - Subpackage for house one examples
  - `Person1.java` - Person1 class
  - `Person2.java` - Person2 class
- `housetwo/` - Subpackage for house two examples
  - `Person3.java` - Person3 class
  - `Person4.java` - Person4 class

#### Inheritance
- `Direction.java` - Direction enum
- `Hero.java` - Hero class
- `Monster.java` - Monster class
- `Player.java` - Player class
- `challenges/` - Inheritance challenges
  - `Car.java` - Car class
  - `Confort.java` - Confort class
  - `Ferrari.java` - Ferrari class
  - `HondaFit.java` - HondaFit class
  - `SportsCar.java` - SportsCar class
- `tests/` - Tests for inheritance
  - `CarTest.java` - Tests for Car
  - `GameTest.java` - Tests for game classes

#### Polymorphism
- `Bean.java` - Bean class
- `Dinner.java` - Dinner class
- `Food.java` - Food class
- `IceCream.java` - IceCream class
- `Person.java` - Person class
- `Rice.java` - Rice class
- `challenges/` - Polymorphism challenges
  - `AbstractTest.java` - Abstract test
  - `Animal.java` - Animal class
  - `Dog.java` - Dog class
  - `Mammal.java` - Mammal class

#### Composition
- `challenges/` - Composition challenges
  - `Customer.java` - Customer class
  - `Item.java` - Item class
  - `Product.java` - Product class
  - `Purchase.java` - Purchase class
  - `Software.java` - Software class
- `many/to/many/` - Many-to-many relationships
  - `Course.java` - Course class
  - `CourseTest.java` - Tests for Course
  - `Student.java` - Student class
- `many/to/one/` - Many-to-one relationships
  - `Car.java` - Car class
  - `CarTest.java` - Tests for Car
  - `Engine.java` - Engine class
- `one/to/many/` - One-to-many relationships
  - `Item.java` - Item class
  - `Purchase.java` - Purchase class
  - `PurchaseTest.java` - Tests for Purchase

### Arrays (Sequential Data Structures)

- `ArrayExercise.java` - Practical exercise with one-dimensional arrays
- `ForeachExercise.java` - Foreach loop example with arrays

#### Others
- `Equals.java` - Equality comparison in arrays
- `User.java` - Utility class for examples

#### Challenges
- `ArrayChallenge.java` - Challenge: calculating grade average with array
- `MatrixChallenge.java` - Challenge: working with two-dimensional matrices

### Collections (Java Collections)

- `UserList.java` - ArrayList example with User objects
- `HashSetCollection.java` - HashSet example and set operations
- `MapCollection.java` - HashMap example with key-value
- `QueueCollection.java` - Queue example (FIFO)
- `DequeCollection.java` - Deque example (double-ended queue)
- `MessySet.java` - Set example without guaranteed order
- `NotMessySet.java` - Set example with order (TreeSet)
- `User.java` - Utility class for collection examples

## 🛠️ Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **IDE** (recommended: IntelliJ IDEA or Eclipse)
- Git (for version control)

## 🚀 How to Run

### 1. Clone the repository
```bash
git clone <REPOSITORY_URL>
cd java_review
```

### 2. Compile the files
```bash
javac -d out src/fundamentals/others/*.java
javac -d out src/fundamentals/operators/*.java
javac -d out src/control/loops/*.java
javac -d out src/oop/encapsulation/*.java
javac -d out src/oop/inheritance/*.java
javac -d out src/oop/polymorphism/*.java
javac -d out src/oop/composition/**/*.java
# ... etc for other modules
```

### 3. Run a program
```bash
java -cp out fundamentals.others.FirstProgram
java -cp out fundamentals.operators.ArithmeticOperators
java -cp out control.loops.For1Loop
java -cp out oop.encapsulation.Person
java -cp out oop.inheritance.Hero
java -cp out oop.polymorphism.Food
java -cp out oop.composition.challenges.Customer
```

### Or directly with the IDE
1. Open the project in your IDE
2. Navigate to the desired `.java` file
3. Click "Run" or press `Ctrl+Shift+F10` (IntelliJ)

## 📚 Usage Examples

### Run a basic program
```bash
java -cp out fundamentals.others.FirstProgram
```

### Run a program with user input
```bash
java -cp out control.conditionals.IfControl
# Enter the grade when prompted
```

### Run a challenge
```bash
java -cp out fundamentals.challenges.ArithmeticChallenge
java -cp out control.challenges.ForChallenge
java -cp out oop.encapsulation.PersonTest
java -cp out oop.inheritance.tests.CarTest
java -cp out oop.polymorphism.challenges.AbstractTest
java -cp out oop.composition.many.to.many.CourseTest
```

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
8. **Introduction to OOP**: Learn values and references concepts in `classes/others/`
9. **Work with classes**: Create and study classes in `classes/area/` and `classes/product/`
10. **OOP projects**: Implement practical challenges in `classes/challenges/`
11. **Advanced OOP**: Dive into encapsulation in `oop/encapsulation/`
12. **Understand inheritance**: Explore `oop/inheritance/` and its challenges
13. **Master polymorphism**: Study `oop/polymorphism/` examples
14. **Learn composition**: Work with relationships in `oop/composition/`
15. **Master arrays**: Learn arrays in `arrays/` - foundation for collections
16. **Work with collections**: Explore List, Set, Map and Queue in `collections/`
17. **Integrate everything**: Combine OOP + Arrays + Collections in complex projects

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

**Last update**: January 23, 2026  
**Status**: ✅ Project under continuous review
