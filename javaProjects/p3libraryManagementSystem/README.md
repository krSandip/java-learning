# 📚 p3libraryManagementSystem

A **Java Swing-based Library Management System** integrated with **MySQL Database** for managing students, books, issue/return transactions, and authentication.  
This project provides a simple yet complete GUI-based desktop application for library management.

---

## 🚀 Features

- **Database Connection**
  - Uses MySQL database (`librarydb2`) with JDBC connectivity.
  - Handles student, book, and transaction records.

- **Splash Screen with Progress Bar**
  - Displays loading messages (`Connecting Database`, `Loading Modules`, `Launching Application`).

- **Authentication**
  - Login system for accessing the application.

- **Student Management**
  - Register new students with details: `ID`, `Name`, `Course`, `Branch`, `Semester`.
  - Data is stored in MySQL `student` table.

- **Book Management**
  - Add new books with details: `ID`, `Name`, `Publisher`, `Price`, `Year`.
  - Default status is `NotIssued`.

- **Book Issue**
  - Issue books to students and update database (`status`, `issuedate`, `duedate`).

- **Book Return**
  - Return issued books and reset their status in the database.

---

## 🗂 Project Structure

- **c1connectDb.java** → Handles MySQL connection.  
- **c1loading.java** → Splash screen with progress bar.  
- **c2loginWindow.java** → Login form for user authentication.  
- **c3homePage.java** → Main application dashboard.  
- **c4studentRegistration.java** → Form for registering students.  
- **c5addBook.java** → Form for adding new books.  
- **c6issueBook.java** → Form for issuing books to students.  
- **c7returnBook.java** → Form for returning issued books.

---

## 🛠 Technologies Used

- **Java** (JDK 8+ recommended)
- **Swing** (GUI components)
- **JDBC** (Database connectivity)
- **MySQL** (Database)

---

🎯 Future Enhancements

   Add Admin Panel for managing users.
   Generate Reports (issued books, overdue returns, etc.).
   Implement Fine Calculation for late returns.
   Use Hashing for secure password storage.

👨‍💻 Author

   Sandeep Kumar
   Email - sink10704@gmail.com
   GitHub Profile - https://github.com/krSandip

