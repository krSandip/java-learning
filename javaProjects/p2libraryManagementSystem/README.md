# 📚 p2libraryManagementSystem

A simple **Library Management System** built in **Java** using **JDBC** and **MySQL**.  
This project demonstrates the use of `Properties` files, JDBC database connectivity, and basic CRUD operations for managing members, books, issuing, and returning books.

---

## 🚀 Features
- Add new **members** to the library.
- Add new **books** to the library.
- **Issue books** to members.
- **Return books** to the library.
- Uses **Properties file (db.properties)** for secure database configuration.
- Simple **menu-driven console application**.

---

## 🏗️ Project Structure

p2libraryManagementSystem/
│
├── l1createPropertiesFile.java # Creates db.properties file
├── l2libraryUtil.java # Handles DB connection setup
├── l3userMenu.java # Main user menu 
├── l4addMemberMenu.java # Logic to add members
├── l5memberClass.java # Member entity
├── l6addBookMenu.java # Logic to add books
├── l7bookClass.java # Book entity 
├── l8libraryFunctions.java # Issue & return book functions
├── db.properties # Database configuration file

---

## ⚙️ Database Setup

Before running the project, create a **MySQL database** and the required tables

---

🔑 Database Configuration (db.properties)

The project uses a properties file for DB configuration.

---

▶️ How to Run

1. Clone this repository:
   git clone https://github.com/krSandip/p2libraryManagementSystem.git
2. Open project in IntelliJ IDEA / Eclipse.
3. Make sure MySQL Server is running and database is set up.
4. Run l1createPropertiesFile.java once to generate db.properties.
5. Run l3userMenu.java to start the system.
6. Follow the console menu:
   1 → Add Member
   2 → Add Book
   3 → Issue Book
   4 → Return Book
   5 → Exit

---

🖥️ Sample Output

---------------------------------------------------------
---------------------------------------------------------
Select The Following Options
Enter 1 To Add New Member : 
Enter 2 To Add New Book : 
Enter 3 To Issue A Book : 
Enter 4 To Return A Book : 
Enter 5 To Exit : 
1
---------------------------------------------------------
You Have Selected Option 1 To Add A New Member
Reached Inside The Member Menu
Enter Member id : 
555
Enter Member Name : 
555 member name
Reached Inside Add member For Member : 555
Member Added Successfully !!
---------------------------------------------------------
---------------------------------------------------------
Select The Following Options
Enter 1 To Add New Member : 
Enter 2 To Add New Book : 
Enter 3 To Issue A Book : 
Enter 4 To Return A Book : 
Enter 5 To Exit : 
2
---------------------------------------------------------
You Have Selected Option 2 To Add A New Book
Reached Inside The Book Menu
Enter isbn code : 
5050
Enter book name : 
5050 book name
Enter book desc : 
5050 desc
Enter author name : 
5050 author
Enter subject : 
5050 subject
Enter units available : 
6
Reached Inside Add Book For Book : 5050
Book Added Successfully !!
---------------------------------------------------------
---------------------------------------------------------
Select The Following Options
Enter 1 To Add New Member : 
Enter 2 To Add New Book : 
Enter 3 To Issue A Book : 
Enter 4 To Return A Book : 
Enter 5 To Exit : 

<img width="1920" height="1080" alt="Screenshot 2025-09-15 010107" src="https://github.com/user-attachments/assets/97fbd5e8-7f81-45ce-adc0-4eef57616623" />

---

📌 Future Enhancements

   Add GUI (Swing/JavaFX) for better user experience.
   Add search functionality for books and members.
   Maintain transaction history logs.
   Implement admin authentication.

---

👨‍💻 Author

   Sandip Kumar
   sink10704@gmail.com 
   https://github.com/krSandip
