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

🖥️ Sample Output

1. Application Output : 

  <img width="1920" height="1019" alt="p1loading" src="https://github.com/user-attachments/assets/3934ace7-f268-4c50-8ef4-68cd8e628654" />
  <img width="1904" height="1017" alt="p2login" src="https://github.com/user-attachments/assets/720be0d6-da77-45ef-8d9c-c57a5b17b622" />
  <img width="1904" height="1003" alt="p3home" src="https://github.com/user-attachments/assets/69bae800-4bad-4c7b-a511-af6f96bc1d2b" />
  <img width="1905" height="1012" alt="p4registration" src="https://github.com/user-attachments/assets/a2ba8a83-0182-4df8-b424-b679c7f28d7f" />
  <img width="1894" height="1001" alt="p5addbook" src="https://github.com/user-attachments/assets/60e6c953-513b-428e-b279-79be49bbc47a" />
  <img width="1897" height="1000" alt="p6issuebook" src="https://github.com/user-attachments/assets/9a4294a6-d945-4878-975b-f3d492393460" />
  <img width="1901" height="993" alt="p7returnbook" src="https://github.com/user-attachments/assets/0056eeb1-d90a-4d01-8214-2a25a7f0917b" />

2. Database Output : 

   <img width="1920" height="1014" alt="p8studentdb" src="https://github.com/user-attachments/assets/53773305-4b44-4658-a7a4-7b66eda25c16" />
   <img width="1920" height="1017" alt="p9bookdb" src="https://github.com/user-attachments/assets/e710b6e6-32f6-4c1d-8e4f-eb84aa8a4fc8" />

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

