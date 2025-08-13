class linkedlist {
    private int data;
    private node next;
    node start = null;
    node end = null;
    int size = 0;

    private class node {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
//     1. Insert at Beginning and End
// 🔸 Input: Insert 10 → Insert 20 → Insert at beginning 5
// 🔸 Output (traverse): 5 → 10 → 20
// 📌 Build your Node class and insertion logic.

    public void head(int data) {
        node newnode = new node(data);
        newnode.next = start;
        start = newnode;
        size++;
    }

    public void insert(node start, int data, int pos) {
        node newnode = new node(data);
        if (pos == 1) {
            head(data);
               size++;
        }
        node temp = start;
        for (int i = 0; i < pos && temp.next == null; i++) {
            temp = temp.next;

        }

        newnode.next = temp.next;
        temp.next = newnode;
   size++;
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
       size++;}
//     2. Delete from Beginning and End
// 🔸 Input: List = 10 → 20 → 30 → After deletion → 20 → 30, then 20
// 📌 Handle head == null, head.next == null, etc.

    public void delete(int val) {
        if (start == null) {
            return;
        }
        if (start.data == val) {
            start = start.next;
   size--;
        }
        node temp = start;
        while (temp.next != null && temp.data != val) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
               size--;
        }

    }

    public void removefirst() {
        if (start == null) {
            return;
        }
        start = start.next;
           size--;

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
            temp.next = null;   size--;
        }

   }
// 3. Search an Element
// 🔸 Input: List = 10 → 20 → 30, key = 20 → Output: true
// 📌 Loop and compare node.data with key.
public boolean search(linkedlist list, int key){
    node temp = list.start;
    while(temp.next !=null && temp.data != key){
        temp = temp.next;
    }
    return temp.next!= null;
}
// 4. Reverse a Linked List
// 🔸 Input: 10 → 20 → 30 → Output: 30 → 20 → 10
// 📌 Use 3-pointer approach (prev, curr, next).
public linkedlist reverse (linkedlist list){
    node curr= list.start ,nex = null ,prev=null;
    while(curr.next!=null){
    nex = curr.next;
    curr.next = prev;
    prev = curr;
    curr = curr.next;

    }
return list ;}
// 5. Find Middle of Linked List
// 🔸 Input: 10 → 20 → 30 → 40 → 50 → Output: 30
// 📌 Use slow and fast pointers
public int middle(linkedlist list){
    node slow = list.start;
    node fast = list.start;
    while(fast != null && fast.next !=null ){
        slow = slow.next;
        fast = fast.next.next;
    }
return slow.data;}
public int getlength(){
    return size;
}
//alternate approach for day 7
public int middle2(linkedlist list){
    node first = list.start;
    int last = list.getlength();
 int mid = last/2;
 while(mid>0){
    first = first.next;
    mid--;
 }


   return first.data; }

}

