package linkedList;

import java.util.Iterator;

public class LinkedContainer<E> implements Linked<E>, Iterable<E> {
    private Node<E> fstNode;
    private Node<E> lstNode;

    private int size = 0;

    public LinkedContainer() {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<>(null, null, lstNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = fstNode;
        next.setCurrentElement(e);
        fstNode = new Node<>(null, null, next);
        next.setPrevElement(lstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            int counter=0;

            @Override
            public boolean hasNext() {
                return counter<size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }


    private static class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.prevElement = prevElement;
            this.nextElement = nextElement;

        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }


}


