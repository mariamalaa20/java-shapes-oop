# 🧹 Java Shapes OOP Interface & Inheritance Demo

A Java project that showcases fundamental OOP concepts such as interfaces, inheritance, abstraction, and polymorphism, using real-world analogies like students, researchers, and geometric shapes. Designed for learning and demonstration purposes, this modular project is easy to build upon and extend.

---

## ✨ Features

- 🧠 Demonstrates multiple interface implementation (`IStudent`, `IResearcher`, `IInterface`, etc.)
- 👥 Models real-life entities (`Student`, `Researcher`, `ResearcherStudent`)
- 📀 Includes shape classes (`Rectangle`, `Circle`) for calculation demos
- 🔄 Shows polymorphism and abstraction in practice
- 🔧 Extensible and ready for unit testing and enhancement

---

## 📦 Requirements

- Java JDK 8 or higher
- A Java IDE (IntelliJ IDEA, Eclipse) or a simple terminal with `javac`

---

## 💻 Installation

```bash
# Clone the repository
git clone https://github.com/mariamalaa20/java-shapes-oop.git

# Navigate into the project directory
cd java-shapes-oop

# Compile all .java files
javac *.java

# Run the Rectangle class for an example calculation
java Rectangle

# Or try the Circle class
java Circle
```

---

## 🧱 Project Structure

```plaintext
.
├── Circle.java              # Implements ICalculations (geometry logic)
├── Class1.java              # Implements IInterface (generic interface demo)
├── ICalculations.java       # Interface for shapes (area/perimeter)
├── IInterface.java          # General-purpose interface with multiple method types
├── IResearcher.java         # Interface for researcher-type roles
├── IStudent.java            # Interface for student-type roles
├── Rectangle.java           # Implements ICalculations (rectangle logic)
├── Researcher.java          # Implements IResearcher
├── ResearcherStudent.java   # Implements both IResearcher and IStudent
├── Student.java             # Implements IStudent
├── TestClass.java           # Commented out sample of multiple inheritance
└── Main.class               # Compiled version (not used)
```

---

## ▶️ Usage

Here’s how you can use and test the functionality:

### 🔸 Geometric Calculations

```java
Rectangle rectangle = new Rectangle();
rectangle.calculatePerimeter();  // Calculates using user input
```

```java
Circle circle = new Circle();
circle.calculatePerimeter();
circle.arcCalculation();         // Custom method for arc length
```

### 🔸 Polymorphism & Interfaces

```java
IStudent s = new ResearcherStudent();
s.grade();  // Will call the student implementation

IResearcher r = new ResearcherStudent();
r.accessPermission();  // Will call the researcher implementation
```

---

## 🚀 Future Enhancements

- [ ] Implement missing methods in all interfaces and classes
- [ ] Add a proper `Main.java` with user input menu
- [ ] Include GUI using JavaFX or Swing
- [ ] Integrate unit tests with JUnit
- [ ] Add more shape classes like `Triangle`, `Square`, etc.
- [ ] Refactor to use design patterns (e.g., Strategy Pattern for calculations)

---

---

## 📬 Contact

For questions, suggestions, or collaboration opportunities:

- 🐙 GitHub: [mariamalaa20](https://github.com/mariamalaa20)

--- 
