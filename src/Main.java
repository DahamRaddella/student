import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StudentLinkedList studentList = new StudentLinkedList();
        ActionStack actionStack = new ActionStack();
        RequestQueue requestQueue = new RequestQueue();
        StudentBST studentBST = new StudentBST();
        StudentHashTable studentHash = new StudentHashTable(10);
        CampusGraph campusGraph = new CampusGraph();

        campusGraph.addLocation("Gate");
        campusGraph.addLocation("Library");
        campusGraph.addLocation("Canteen");
        campusGraph.addLocation("Classroom");
        campusGraph.addConnection("Gate", "Library");
        campusGraph.addConnection("Library", "Canteen");
        campusGraph.addConnection("Canteen", "Classroom");

        boolean running = true;

        while (running) {
            System.out.println("\n--- University Student Record & Campus Route Management System ---");
            System.out.println("1. Add Student Record");
            System.out.println("2. Update Student Record");
            System.out.println("3. Delete Student Record");
            System.out.println("4. Display All Records (Linked List)");
            System.out.println("5. Add Service Request (Queue)");
            System.out.println("6. Process Next Service Request (Queue)");
            System.out.println("7. Display Recent System Actions (Stack)");
            System.out.println("8. Search Student Record (BST / Hash)");
            System.out.println("9. Explore Campus Navigation (Graph)");
            System.out.println("10. Exit System");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Programme: ");
                    String prog = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    Student newStudent = new Student(id, name, prog, marks);
                    studentList.addStudent(newStudent);
                    studentBST.insert(newStudent);
                    studentHash.insert(newStudent);
                    
                    actionStack.pushAction("Added Student: " + name);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("Update feature is under construction.");
                    break;
                case 3:
                    System.out.println("Delete feature is under construction.");
                    break;
                case 4:
                    studentList.displayStudents();
                    break;
                case 5:
                    System.out.print("Enter Request: ");
                    String req = scanner.nextLine();
                    requestQueue.addRequest(req);
                    actionStack.pushAction("Added Request: " + req);
                    break;
                case 6:
                    System.out.println("Processed: " + requestQueue.processNextRequest());
                    break;
                case 7:
                    actionStack.displayRecentActions();
                    break;
                case 8:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = scanner.nextInt();
                    Student found = studentBST.search(searchId);
                    if (found != null) {
                        System.out.println("Found: " + found.getName());
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 9:
                    System.out.print("Enter Start Location: ");
                    String loc = scanner.nextLine();
                    campusGraph.traverseBFS(loc);
                    break;
                case 10:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}