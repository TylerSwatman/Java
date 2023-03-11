public class LinkedList {

    public static void main(String[] args) {
        // Write your code here:
        LinkedList seasons = new LinkedList();
        seasons.printList();

        seasons.addToHead("Haley Smathers Gender:F Wage 150k");
        seasons.addToHead("Tyler Swatman Gender:M Wage:200k");
        seasons.printList();

        seasons.addToTail("Rachel Huntoon Gender:F Wage 100k");
        seasons.addToTail("Grace Boak Gender:F Wage 50k");
        seasons.printList();

        seasons.removeHead();
        seasons.printList();
    }

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String printList() {
        String output = "";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "";
        System.out.println(output);
        return output;
    }

}
