package linkedList;

public class Deletion {
	static void print(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	static Node delete(Node head,int n) {
		if(head == null) return null;
		else if(head.data==n) {
			return head.next;
		}
		else {
			Node traver=head;
			while(traver.next.data != n) {
				traver = traver.next;
			}
			
			traver.next = traver.next.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Node head = new Node();
		head.data = 0;
		Node traver = head;
		for (int i = 1; i < 5; i++) {
			traver.next = new Node();
			traver.next.data = i;
			traver = traver.next;
		}

		
		System.out.println("Before Deletion");
		print(head);
		
		head = delete(head, 4);
		System.out.println("after Deletion");
		print(head);
	}

}
