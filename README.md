# 🏦 Bank Management System

A robust **Bank Management System** built using **Java** and **MySQL** that simulates essential banking operations such as account creation, deposit, withdrawal, balance inquiry, and transaction history. This system provides a simple interface (CLI or GUI) to manage banking operations efficiently and securely.

---

## 📌 Features

- Create a new customer account
- Deposit and withdraw money
- View account balance
- View transaction history
- Update account information
- Delete customer accounts
- Admin login for secure access
- MySQL database integration for persistent storage

---

## 🧑‍💻 Tech Stack

| Layer        | Technology      |
|--------------|-----------------|
| Frontend     | Java (CLI or Swing) |
| Backend      | Java (JDBC)      |
| Database     | MySQL            |

---

## ⚙️ Requirements

- Java JDK 8 or higher
- MySQL Server
- MySQL Workbench (optional)
- JDBC Driver for MySQL (`mysql-connector-java`)
- Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans)

---

## 📂 Project Structure

```

BankManagementSystem/
├── src/
│   ├── Main.java
│   ├── DBConnection.java
│   ├── Customer.java
│   ├── BankOperations.java
│   └── Transaction.java
├── db/
│   └── bank\_schema.sql
├── lib/
│   └── mysql-connector-java.jar
└── README.md

````

## 🏗️ Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Saurabh6307/BankManagementSystem.git
   cd BankManagementSystem
````
````
2. **Import into your Java IDE**

3. **Set up MySQL Database**

   * Launch MySQL Workbench or terminal
   * Run the SQL script `db/bank_schema.sql`:

     ```sql
     CREATE DATABASE bank_system;
     USE bank_system;

     CREATE TABLE customers (
       account_id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       email VARCHAR(100),
       phone VARCHAR(20),
       balance DOUBLE
     );

     CREATE TABLE transactions (
       txn_id INT PRIMARY KEY AUTO_INCREMENT,
       account_id INT,
       type ENUM('Deposit', 'Withdrawal'),
       amount DOUBLE,
       txn_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
       FOREIGN KEY (account_id) REFERENCES customers(account_id)
     );
     ```

4. **Update database credentials in `DBConnection.java`**

   ```java
   String url = "jdbc:mysql://localhost:3306/bank_system";
   String username = "your_mysql_username";
   String password = "your_mysql_password";
   ```

5. **Add JDBC Connector JAR**

   * Download from: [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)
   * Add to your project's library path

6. **Run the project**

   * Execute `Main.java` to launch the CLI-based application

---

## 📊 Sample Functionalities (CLI Preview)

```
Welcome to Bank Management System
1. Create New Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. View Transaction History
6. Update Account Details
7. Delete Account
8. Exit
Enter your choice:
```

---

## 🛠 Sample SQL Queries

```sql
-- Insert customer
INSERT INTO customers (name, email, phone, balance)
VALUES ('John Doe', 'john@example.com', '9876543210', 5000.0);

-- Record transaction
INSERT INTO transactions (account_id, type, amount)
VALUES (1, 'Deposit', 1000.0);
```

---

## 🤝 Contributing

Contributions are welcome!
To contribute:

1. Fork the repo
2. Create a new branch (`git checkout -b feature-branch`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add feature'`)
5. Push to the branch (`git push origin feature-branch`)
6. Open a pull request

---

## 📃 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙌 Acknowledgements

* Java JDBC for seamless database connectivity
* MySQL for powerful relational data handling
* Inspired by real-world banking operations





Let me know if you'd like a version tailored for a **GUI application** or deployment-ready version with login roles (Admin, Customer, etc.) – I can extend the README accordingly.

