public class RequestQueue {
    class QueueNode {
        String requestDetails;
        QueueNode next;
        public QueueNode(String requestDetails) {
            this.requestDetails = requestDetails;
            this.next = null;
        }
    }

    private QueueNode front, rear;

    public void addRequest(String requestDetails) {
        QueueNode newNode = new QueueNode(requestDetails);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public String processNextRequest() {
        if (front == null) {
            return "No pending requests.";
        }
        String temp = front.requestDetails;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }
}