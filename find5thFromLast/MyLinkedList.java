// Problem 1
// Finding the fifth node from the end of a single linked list.
// Rishabh Ananthan

package cardlytics_prob1;

// Implementation of singly linked list.
public class MyLinkedList<T> {
	
	// Node class
	public static class Node<T> {
		T data;
		Node<T> next;
		
		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
		
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> node) {
            this.next = node;
        }
	}
	
	public Node<T> head;
	public int size;
	
	public MyLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	// Function to add element to the end of the linked list
    public void addEnd(T data) {
        if (head == null) {
            head = new Node<T>(data, head);
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Node<T> newNode = new Node<T>(data, null);
            current.setNext(newNode);
            size++;
        }
    }

    // Function to add element to the front of the linked list
    public void addFront(T data) {
        head = new Node<T>(data, head);
        size++;
    }
    
    // Function to find the fifth node from the end
	public String find5thFromLast(Node<T> head) {
		int length = 0;
		Node<T> t = head;
		
		// Finding the length of the linked list
		while(t != null) {
			t = t.next;
			length++;			
		}

		// Method makes no sense for a linked list that has fewer than five elements in it
		if (length < 5)
			return "FAIL";
		else {
			// set temporary pointer to the head of the list and iterate till the fifth from last element
			// for example, consider the linked list 2 -> 3 -> 9 -> 4 -> 5 -> 20 -> 14
			// length = 7, length - 4 = 3. Hence the required element is the 3rd element, which is 9.
			t = head;
			for (int i = 1; i < length - 4; i++) {
			t = t.next;
			}
			return t.data.toString();
		}
	}
}