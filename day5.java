// On this day  I studied Java linked list and its internal structure which i want to demonstrate here 
// so lets start
class linkedlist {
    private int data;
    private node next;
    node start = null;
    node end = null;

    private class node {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void head(int data) {
        node newnode = new node(data);
        newnode.next = start;
        start = newnode;
    }

    public void insert(node start, int data, int pos) {
        node newnode = new node(data);
        if (pos == 1) {
            head(data);
        }
        node temp = start;
        for (int i = 0; i < pos && temp.next == null; i++) {
            temp = temp.next;

        }

        newnode.next = temp.next;
        temp.next = newnode;

    }

    public void tail(int data) {
        node newnode = new node(data);
        if (end == null) {
            end = start;
        }
        node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void delete(int val) {
        if (start == null) {
            return;
        }
        if (start.data == val) {
            start = start.next;

        }
        node temp = start;
        while (temp.next != null && temp.data != val) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

    }

    public void removefirst() {
        if (start == null) {
            return;
        }
        start = start.next;

    }

    public void removelast() {
        if (start == null) {
            return;
        }
        node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = null;
        }

    }

}
