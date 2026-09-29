public class StudentLinkedList {
    class Node {
        Student student;
        Node next;
        public Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }
    
    private Node head;

    public boolean addStudent(Student student) {
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
        return true;
    }

    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.student.getStudentId() + ", Name: " + temp.student.getName());
            temp = temp.next;
        }
    }

    public boolean deleteStudent(int id) {
        if (head == null) return false;
        if (head.student.getStudentId() == id) {
            head = head.next;
            return true;
        }
        Node temp = head;
        while (temp.next != null && temp.next.student.getStudentId() != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            return true;
        }
        return false;
    }

    public boolean updateStudent(int id, String newName, String newProg, double newMarks) {
        Node temp = head;
        while (temp != null) {
            if (temp.student.getStudentId() == id) {
                temp.student.setName(newName);
                temp.student.setProgramme(newProg);
                temp.student.setMarks(newMarks);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}