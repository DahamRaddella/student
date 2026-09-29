import java.util.LinkedList;

public class StudentHashTable {
    private LinkedList<Student>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public StudentHashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void insert(Student student) {
        int index = student.getStudentId() % size;
        table[index].add(student);
    }

    public void displayHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            for (Student s : table[i]) {
                System.out.print("[" + s.getStudentId() + "] ");
            }
            System.out.println();
        }
    }
}