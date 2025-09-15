# 🏦 ATM Simulator System

The **ATM Simulator System** is a Java Swing-based desktop application that simulates the core functionalities of an Automated Teller Machine (ATM).  
It is integrated with a **MySQL database** to manage users, accounts, and transactions.

---

## 📌 Project Structure

The project follows a standard Java application structure inside **NetBeans IDE**:

p4atmSimulatorSystem/
│
├── src/
│ └── p4atmSimulatorSystem/
│ ├── BalanceEnquiry.java
│ ├── Deposit.java
│ ├── FastCash.java
│ ├── Login.java
│ ├── MiniStatement.java
│ ├── Pin.java
│ ├── Practice.java
│ ├── Signup.java
│ ├── Signup2.java
│ ├── Signup3.java
│ ├── Transactions.java
│ ├── Withdraw.java
│
├── build.xml
├── manifest.mf
└── p4atmSimulatorSystem.iml

---

## 🚀 Features

- **Authentication**
  - Login system with account number and PIN verification from MySQL database.

- **Banking Operations**
  - **Deposit** → Add money to the account (updates balance in DB).
  - **Withdraw** → Withdraw money (checks balance before updating).
  - **Fast Cash** → Quick withdrawal of pre-set amounts.
  - **Balance Enquiry** → Fetches live balance from DB.
  - **Mini Statement** → Shows recent transactions from DB.
  - **Change PIN** → Updates PIN in the database securely.

- **User Registration**
  - Multi-step signup (`Signup`, `Signup2`, `Signup3`) that stores user details in the database.

- **GUI**
  - Built with **Swing** components (`JFrame`, `JLabel`, `JButton`, etc.).
  - Custom images/icons (e.g., `logo.jpg`) for branding.

---

## 🛠 Technologies Used

- **Java SE 8+** (tested with JDK 19)
- **Swing & AWT** (for GUI)
- **JDBC** (for database connectivity)
- **MySQL** (for storing account & transaction data)
- **NetBeans IDE 26**

---

🖥️ Sample Output

1. Application Output
   <img width="1920" height="1017" alt="p1login" src="https://github.com/user-attachments/assets/2465152e-ed0f-4eea-8da2-c6a7b5755f29" />
   <img width="1920" height="1021" alt="p2sighnup1" src="https://github.com/user-attachments/assets/2794e30c-9237-4fda-8626-c57dab63c74a" />
   <img width="1920" height="1017" alt="p3signup2" src="https://github.com/user-attachments/assets/7ea24107-56fd-4d0a-99e7-9ab3c91996a8" />
   <img width="1920" height="1021" alt="p4signup3" src="https://github.com/user-attachments/assets/470db177-047d-44e0-981c-f97d1d79a458" />
   <img width="1920" height="1021" alt="p5home" src="https://github.com/user-attachments/assets/4543ab21-0897-4651-b567-f08b4486b3c6" />
   <img width="1920" height="1017" alt="p6deposit" src="https://github.com/user-attachments/assets/7a3ec992-54d3-4669-b762-c03ce8786be2" />
   <img width="1920" height="1017" alt="p7withdrawl" src="https://github.com/user-attachments/assets/91d8e5c4-0eb2-4b92-8cca-0dd4b325da0e" />
   <img width="1920" height="1021" alt="p8fastcash" src="https://github.com/user-attachments/assets/516c321f-6030-466d-8382-a9fd7070fae4" />
   <img width="1920" height="1017" alt="p9ministate" src="https://github.com/user-attachments/assets/33fac086-3cc3-47e2-bf13-7663e9b5d479" />
   <img width="1920" height="1021" alt="p10pinchange" src="https://github.com/user-attachments/assets/b10c3591-c65e-45de-88c3-84237bf6c435" />
   <img width="1920" height="1007" alt="p11balance" src="https://github.com/user-attachments/assets/ef260618-87c4-4b6f-ae62-34e6d69bb3b8" />

2. Database Output
   <img width="1920" height="1011" alt="p12signup1db" src="https://github.com/user-attachments/assets/fcfe7156-bf2d-4352-bc04-7bf2bb367f5e" />
   <img width="1920" height="1014" alt="p13signup2db" src="https://github.com/user-attachments/assets/2672c130-fcb9-43e4-b49f-ae580a4e867e" />
   <img width="1920" height="1017" alt="p14signup3db" src="https://github.com/user-attachments/assets/c4230755-5c7b-4bda-8295-cc1a7fe55e25" />
   <img width="1920" height="1014" alt="p15logindb" src="https://github.com/user-attachments/assets/9a2b7abd-4fb5-4b5c-be19-b0799d5955e2" />
   <img width="1920" height="1014" alt="p16bankdb" src="https://github.com/user-attachments/assets/dc5f74f4-279c-4429-8ab0-1cbfd3ffabd4" />

---

🎯 Future Enhancements

   Add Admin Panel for managing accounts.
   Generate PDF reports of transactions.
   Implement Interest calculation on savings.
   Add Encryption for sensitive data (PIN, card numbers).

---

👨‍💻 Author

   Sandeep Kumar
   Email - sink10704@gmail.com
   GitHub Profile - https://github.com/krSandip
