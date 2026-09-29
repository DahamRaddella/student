# University Student Record & Campus Route Management System

## 🎯 Objective
This project is a comprehensive Java-based console application developed for the **CIT300 - Data Structures and Algorithms** module at **Sri Lanka Technological Campus (SLTC)**. The main objective is to simulate a real-world university environment by applying fundamental data structures to efficiently manage student data, handle service requests, track system actions, and navigate campus routes.

## 👥 Group Members

| Name | Assigned Data Structure | Key Functionality Implemented |
| :--- | :--- | :--- |
| **K.M.L. Lakshan** | Linked List | Student Records Model, Add, Update & Delete logic |
| **R.M Thakshila Raddella** | Stack & Queue | Action History (Undo base) & Service Requests Management |
| **D.M.A. Rashmini Dissanayaka** | BST & Hash Table | Efficient Data Organization & Fast Record Searching |
| **S.M.S. Piyumika** | Graph | Campus Navigation & Location Network (BFS Traversal) |

## ✅ Requirements Coverage

| Data Structure | Implementation Details | Purpose in the System |
| :--- | :--- | :--- |
| **Linked List** | `StudentLinkedList.java` | Acts as the primary database for dynamic student records management. |
| **Stack** | `ActionStack.java` | Tracks recent actions (LIFO) for system history and undo functionalities. |
| **Queue** | `RequestQueue.java` | Manages student helpdesk service requests in order (FIFO). |
| **Binary Search Tree**| `StudentBST.java` | Hierarchically organizes student IDs for structured data viewing. |
| **Hash Table** | `StudentHashTable.java` | Maps IDs directly to records for extremely fast searching. |
| **Graph** | `CampusGraph.java` | Represents campus building connections and finds routes using BFS. |

## 📜 Menu
When the system is executed, the following main console menu is presented to the user:
1. Add Student Record
2. Update Student Record
3. Delete Student Record
4. Display All Records (Linked List)
5. Add Service Request to Queue
6. Process Next Service Request
7. Display Recent System Actions (Stack)
8. Search Student Record (Hash Table / BST)
9. Explore Campus Navigation (Graph)
10. Exit System

## 📂 Project Structure
```text
university-student-record-system/
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── StudentLinkedList.java
│   ├── ActionStack.java
│   ├── RequestQueue.java
│   ├── StudentBST.java
│   ├── StudentHashTable.java
│   └── CampusGraph.java
<<<<<<< HEAD
└── README.md
=======
└── README.md
>>>>>>> d041de200e4500025979e9ced690f9272cb81050
