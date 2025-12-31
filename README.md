# 🛡️ Vehicle Insurance System – Java OOP Project  

![Java](https://img.shields.io/badge/🖥_Language-Java_17-orange?logo=openjdk)
![IDE](https://img.shields.io/badge/💻_IDE-Eclipse-blue?logo=eclipse)
![Application](https://img.shields.io/badge/🚙_Application-Console-green)
![Concepts](https://img.shields.io/badge/📘_Concepts-Inheritance%2C_Polymorphism%2C_Encapsulation-red)
![Status](https://img.shields.io/badge/✅_Status-Completed-brightgreen)
![Commit](https://img.shields.io/badge/🕒_Commit-First_Commit-yellow)

---

## 🌟 Project Highlights  

- ✅ Developed using **Core Java (JDK 17)**  
- ✅ Demonstrates **real-world vehicle insurance calculation logic**  
- ✅ Strong use of **OOP principles** such as inheritance and polymorphism  
- ✅ Clean and readable **console-based Java application**  
- ✅ Well-organized project structure following **Eclipse standards**  
- ✅ Ideal for **college assignments, viva, and Java OOP practice**

---

## 📌 Project Overview  

The **Vehicle Insurance System** is a **Core Java console application** designed to simulate how insurance systems calculate and manage insurance details for different types of vehicles.  

In real-life insurance companies, insurance premiums differ based on the **type of vehicle** such as bikes and cars. This project models the same idea by using a **base `Vehicle` class** and extending it into specialized vehicle types like **Bike** and **Car**.  

The application showcases how **inheritance allows code reuse** and how **polymorphism enables different behavior** for different vehicle types while using a common reference.

---

## 🎯 Real-Life Context  

Vehicle insurance systems are widely used by:  

- Insurance companies (LIC, ICICI Lombard, HDFC ERGO)  
- Government transport departments  
- Online insurance comparison platforms  
- Fleet and vehicle management software  

**Real-life example:**  
When you insure a **bike**, the premium is lower compared to a **car** due to differences in risk, engine capacity, and usage. This project reflects that logic in a simplified educational form.

---

## 📂 Project Structure  

```text
Vehicle-Insurance-System
│
├── src
│   └── Vehicle
│       ├── Vehicle.java
│       ├── Bike.java
│       ├── Car.java
│       └── Vehicle_Insurance.java
│
├── bin
│   └── Vehicle
│       ├── Vehicle.class
│       ├── Bike.class
│       ├── Car.class
│       └── Vehicle_Insurance.class
│
├── .classpath
├── .project
└── .settings
```

🧠 OOP Concepts Demonstrated
---

| Concept             | Usage in Project             | Real-Life Mapping       |
| ------------------- | ---------------------------- | ----------------------- |
| 🧬 Inheritance      | Bike & Car extend Vehicle    | Vehicle categories      |
| 🔁 Polymorphism     | Insurance calculation varies | Premium rules           |
| 🛡️ Encapsulation   | Vehicle data hiding          | Secure insurance data   |
| 🧱 Code Reusability | Common vehicle logic         | Industry best practices |


📝 Class Responsibilities
---

🔹 Vehicle.java (Base Class)  
Stores common vehicle details  
Acts as a parent class for all vehicles  
Provides base methods for insurance logic  

Industry Mapping:  
Represents a general vehicle record in insurance databases.  

🔹 Bike.java (Child Class)  
Inherits from Vehicle  
Implements bike-specific insurance logic  

Industry Mapping:  
Used for two-wheeler insurance systems.  

🔹 Car.java (Child Class)  
Inherits from Vehicle  
Implements car-specific insurance logic  

Industry Mapping:  
Used for four-wheeler insurance policies.  

🔹 Vehicle_Insurance.java (Main Class)  
Entry point of the application  
Creates vehicle objects  
Demonstrates polymorphic behavior  
Displays insurance details  

Industry Mapping:  
Similar to insurance service or controller layer.  

🖥️ Sample Output (Console)  
---
```
------ Vehicle Insurance System ------
Vehicle Type : Car
Insurance Amount : ₹12,000
Policy Status : Active
------------------------------------
```

(Output may vary depending on implementation logic)  

▶️ How to Run the Project
---

Clone or download the repository  
Open Eclipse IDE  
Import as Existing Java Project  

Navigate to:
```
src → Vehicle → Vehicle_Insurance.java
```
Right-click → Run As → Java Application


🚀 Future Enhancements
---

📌 Add more vehicle types (Truck, Bus, Electric Vehicle)  
📌 Accept user input using Scanner  
📌 Add insurance expiry date and renewal logic  
📌 Store insurance data using files or databases  
📌 Create GUI using JavaFX or Swing  
📌 Integrate with real insurance APIs  


🎓 Learning Outcomes
---
Strong understanding of Java inheritance and polymorphism  
Practical knowledge of real-world insurance systems  
Experience designing modular Java applications  
Improved confidence in Core Java OOP concepts  
Ability to extend small projects into larger systems  
