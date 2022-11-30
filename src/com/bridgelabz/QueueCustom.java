package com.bridgelabz;

public class QueueCustom {
    private final LinkedListCustom QueueMadeWithLL;

    public QueueCustom() {
        this.QueueMadeWithLL = new LinkedListCustom();
    }
    public void enqueue(INode element) {
        QueueMadeWithLL.append(element);
    }

    public INode dequeue() {
        return QueueMadeWithLL.pop();
    }
    public void printQueue() {
        QueueMadeWithLL.dispalyLinkedList();
    }

}

