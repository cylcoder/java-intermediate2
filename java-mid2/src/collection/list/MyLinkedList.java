package collection.list;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    @Override
    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Node<E> removedNode = getNode(index);
        E removedItem = removedNode.item;
        if (index == 0) {
            first = removedNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removedNode.next;
        }
        removedNode.item = null;
        removedNode.next = null;
        size--;
        return removedItem;
    }

    @Override
    public E get(int index) {
        return (E) getNode(index).item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(E e) {
        /*Node x = first;
        for (int i = 0; i < size; i++) {
            if (e.equals(x.item)) {
                return i;
            }
            x = x.next;
        }
        return -1;*/

        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (e.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

}
