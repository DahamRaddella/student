public class StudentBST {
    class Node {
        Student student;
        Node left, right;
        public Node(Student student) {
            this.student = student;
            left = right = null;
        }
    }

    private Node root;

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private Node insertRec(Node root, Student student) {
        if (root == null) {
            root = new Node(student);
            return root;
        }
        if (student.getStudentId() < root.student.getStudentId()) {
            root.left = insertRec(root.left, student);
        } else if (student.getStudentId() > root.student.getStudentId()) {
            root.right = insertRec(root.right, student);
        }
        return root;
    }

    public Student search(int id) {
        Node res = searchRec(root, id);
        return (res != null) ? res.student : null;
    }

    private Node searchRec(Node root, int id) {
        if (root == null || root.student.getStudentId() == id) {
            return root;
        }
        if (root.student.getStudentId() > id) {
            return searchRec(root.left, id);
        }
        return searchRec(root.right, id);
    }
}