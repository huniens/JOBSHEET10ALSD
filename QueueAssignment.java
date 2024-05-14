public class QueueAssignment {
    PatientAssignment[] queue;
    int front;
    int rear;
    int size;
    int max;

    public QueueAssignment(int n) {
        max = n;
        queue = new PatientAssignment[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(PatientAssignment patient) {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            rear = (rear + 1) % max;
            queue[rear] = patient;
            size++;
        }
    }

    public PatientAssignment dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            PatientAssignment temp = queue[front];
            front = (front + 1) % max;
            size--;
            return temp;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Patient Queue List:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.println(queue[index]);
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front Patient: " + queue[front]);
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Rear Patient: " + queue[rear]);
        }
    }

    public void peekPosition(String name) {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            boolean found = false;
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (queue[index].name.equals(name)) {
                    System.out.println("Patient " + name + " is at position " + (i + 1) + " in the queue.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Patient " + name + " is not found in the queue.");
            }
        }
    }

    public void listPatients() {
        print();
    }
}
    