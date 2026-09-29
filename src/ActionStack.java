public class ActionStack {
    class StackNode {
        String action;
        StackNode next;
        public StackNode(String action) {
            this.action = action;
            this.next = null;
        }
    }

    private StackNode top;

    public void pushAction(String action) {
        StackNode newNode = new StackNode(action);
        newNode.next = top;
        top = newNode;
    }

    public void displayRecentActions() {
        if (top == null) {
            System.out.println("No recent actions.");
            return;
        }
        StackNode temp = top;
        System.out.println("--- Recent Actions ---");
        while (temp != null) {
            System.out.println(temp.action);
            temp = temp.next;
        }
    }
}