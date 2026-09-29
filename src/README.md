# University Student Record & Campus Route Management System

## 📖 About the Project
This is a comprehensive Java-based console application developed for the **CIT300 - Data Structures and Algorithms** module at **Sri Lanka Technological Campus (SLTC)**. The system is designed to simulate a real-world university environment by efficiently managing student data, handling service requests, tracking system actions, and providing campus navigation. 

By integrating multiple fundamental data structures into a single unified system, this project demonstrates the practical application of algorithmic concepts in software engineering.

## 🚀 Core Features & Data Structures Implemented

1. **Student Record Management (Linked List)**
   * Acts as the primary database for students.
   * Supports dynamic memory allocation for adding, updating, deleting, and displaying student details without fixed size limits.

2. **Action History Tracker (Stack)**
   * Follows the Last-In-First-Out (LIFO) principle.
   * Keeps a secure log of the most recent actions performed in the system, serving as the foundation for an "Undo" mechanism.

3. **Student Service Helpdesk (Queue)**
   * Follows the First-In-First-Out (FIFO) principle.
   * Simulates a real-world student helpdesk where service requests are added and processed in the exact order they were received.

4. **Fast Record Searching (Binary Search Tree & Hash Table)**
   * **BST:** Logically organizes student records by their IDs, allowing for hierarchical viewing and efficient searching.
   * **Hash Table:** Provides extremely fast data retrieval by mapping Student IDs directly to their stored information.

5. **Campus Navigation System (Graph)**
   * Represents various campus buildings and locations as nodes.
   * Uses **Breadth-First Search (BFS)** traversal to find available routes and connections between different university locations.

## 🛠️ Technologies Used
* **Language:** Java (JDK)
* **Version Control:** Git & GitHub
* **IDE:** Visual Studio Code (VS Code)

## 👥 Team Members & Contributions

| Team Member | Assigned Data Structure | Key Functionality Implemented |
| :--- | :--- | :--- |
| **K.M.L. Lakshan** | Linked List | Student Records Model, Add, Update & Delete logic |
| **R.M Thakshila Raddella** | Stack & Queue | Action History (Undo base) & Service Requests Management |
| **D.M.A. Rashmini Dissanayaka** | BST & Hash Table | Efficient Data Organization & Fast Record Searching |
| **S.M.S. Piyumika** | Graph | Campus Navigation & Location Network (BFS Traversal) |

## 💻 How to Run the System

1. Clone this repository to your local machine:
   ```bash
   git clone [https://github.com/DahamRaddella/university-student-record-system.git](https://github.com/DahamRaddella/university-student-record-system.git)