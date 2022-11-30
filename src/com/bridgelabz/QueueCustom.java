package com.bridgelabz;

public class QueueCustom {
    private final LinkedListCustom QueueMadeWithLL;

    public QueueCustom() {
        this.QueueMadeWithLL = new LinkedListCustom();
    }
    public void enqueue(INode element) {
        QueueMadeWithLL.append(element);

    }
    public void printQueue() {
        QueueMadeWithLL.dispalyLinkedList();
    }

}
