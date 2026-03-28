[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

---
Student Course Registration System

## Problem Statement (max 150 words)
Educational institutions often require a simple system to manage student course registrations efficiently. Manual handling of student data can lead to errors, duplication, and difficulty in maintaining records. This project aims to develop a Java Swing-based GUI application that allows users to enter student details and register them for selected courses. The system ensures that invalid inputs (such as empty names) are prevented and duplicate registrations are not allowed. It provides a user-friendly interface to store and display student-course data dynamically using object-oriented programming principles. The goal is to demonstrate proper implementation of OOP concepts along with GUI-based interaction in Java.

---

## Target User
- Students or administrators managing basic course registrations  
- Beginners learning Java GUI and OOP concepts  

---

## Core Features
- Add student name and select course  
- Display registered students dynamically  
- Prevent duplicate registrations  
- Input validation with error messages  
- Clear/reset input fields  

- 
- 
- 

---

## OOP Concepts Used

- Abstraction:RegistrationSystem class handles student data logic separately from GUI  
- Inheritance: Student class extends Person class 
- Polymorphism:Method overriding of getDetails() in Student class  
- Exception Handling:Input validation using JOptionPane for error handling 
- Collections / Threads:ArrayList used to store student objects 

---

## Proposed Architecture Description
The application follows a modular object-oriented design. The Person class acts as a base class containing common attributes. The Student class extends Person and adds course-related information while overriding methods for customized behavior. The RegistrationSystem class manages the collection of student objects using an ArrayList and provides methods to add and retrieve data. The StudentInfoApp class serves as the GUI layer, built using Java Swing components such as JFrame, JTextField, JComboBox, JButton, and JTextArea. User actions are handled using ActionListener, which connects the interface with the underlying logic. This separation ensures clean architecture and proper implementation of OOP principles.
---

## How to Run
1. Open terminal in project folder  
2. Navigate to src folder:  
   cd src  
3. Compile the program:  
   javac StudentInfoApp.java  
4. Run the application:  
   java StudentInfoApp
---

## Git Discipline Notes
Minimum 10 meaningful commits required.
