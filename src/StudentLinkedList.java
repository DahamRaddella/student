public class StudentLinkedList {
    private Node head;

    class Node {
        Student student;
        Node next;
        public Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    public void addStudent(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records found in the system.");
            return;
        }
        Node temp = head;
        System.out.println("\n--- Student Records (Linked List) ---");
        while (temp != null) {
            System.out.println("Student ID: " + temp.student.getStudentId()
             + 
                               " | Name: " + temp.student.getName() + 
                               " | Programme: " + temp.student.getProgramme() + 
                               " | Marks: " + temp.student.getMarks());
            temp = temp.next;
        }
        System.out.println("-------------------------------------");
    }
}