package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    // 추가 코드
    public Object remove(int index) {
        Node removedNode = getNode(index);
        Object removedItem = removedNode.item;
        if (index == 0) {
            first = removedNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removedNode.next;
        }
        removedNode.item = null;
        removedNode.next = null;
        size--;
        return removedItem;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        /*Node x = first;
        for (int i = 0; i < size; i++) {
            if (e.equals(x.item)) {
                return i;
            }
            x = x.next;
        }
        return -1;*/

        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (e.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

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

}
