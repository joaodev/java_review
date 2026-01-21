# 📚 Java Review - Fundamentals and Control Flow

A comprehensive educational project with practical examples of Java fundamentals, control structures, and programming challenges.

## 📖 About the Project

This repository contains a structured review of Java's fundamental concepts, focusing on:
- **Fundamentals**: Primitive types, operators, type conversions, and string manipulation
- **Control Structures**: Conditionals and loops with practical examples
- **Challenges**: Practical exercises to consolidate learning

Perfect for reviewing basic concepts or as study material for Java beginners.

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
│   ├── classes/                # Object-Oriented Programming
│   │   ├── others/             # Values and references concepts
│   │   ├── area/               # Class example with methods
│   │   ├── product/            # Example with overloading and static attributes
│   │   └── challenges/         # Class challenges
│   │       └── eat/            # Subpackage: relationship between classes
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

### Classes (Object-Oriented Programming)

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
# ... etc for other modules
```

### 3. Run a program
```bash
java -cp out fundamentals.others.FirstProgram
java -cp out fundamentals.operators.ArithmeticOperators
java -cp out control.loops.For1Loop
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

### Object-Oriented Programming
✅ Class definition and attributes  
✅ Methods and constructors  
✅ Method overloading  
✅ Values vs. References  
✅ Null value  
✅ Static attributes  
✅ Relationship between classes

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
11. **Master arrays**: Learn arrays in `arrays/` - foundation for collections
12. **Work with collections**: Explore List, Set, Map and Queue in `collections/`
13. **Integrate everything**: Combine OOP + Arrays + Collections in complex projects

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

**Last update**: January 21, 2026  
**Status**: ✅ Project under continuous review
