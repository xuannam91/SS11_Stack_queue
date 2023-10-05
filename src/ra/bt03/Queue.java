package ra.bt03;

public class Queue <T>{
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
    }

    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public Node<T> getRear() {
        return rear;
    }

    public void setRear(Node<T> rear) {
        this.rear = rear;
    }

    public void enqueue(T t) {
        Node<T> node = new Node<>(t);
        if (empty()) {
            rear = node;
            front = node;
            front.setNext(rear);
            rear.setNext(front);
        } else {
            rear.setNext(node);
            rear = node;
            rear.setNext(front);
        }
    }

    public T dequeue() {
        if (empty()) {
            return null;
        } else {
            Node<T> node = front.getNext();
            T t = front.getValue();
            front = node;
            return t;
        }
    }

    public boolean empty() {
        return this.front == null && rear == null;
    }
    public void displayQueue(){
        if(empty()){
            System.out.println("hang doi rong");
        }else {
            Node<T> node = front;
            System.out.println("Cac phan tu cua queue");

            do {

                System.out.println(node.getValue());
                node = node.getNext();

            } while (!node.equals(front));
        }
    }
    ;
}
