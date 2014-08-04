package charpter2;

import java.util.HashSet;
import java.util.LinkedList;

public class Question2_1 {
	public <T> void deleteDups(LinkedListNode<T> head) {
		if(head == null) return;
		HashSet<T> hashSet = new HashSet<T>();
		hashSet.add(head.value);
		LinkedListNode<T> pointer = head;
		
		while(pointer.next != null) {
			if(hashSet.contains(pointer.next.value))
				pointer.next = pointer.next.next;
			else
				hashSet.add(pointer.next.value);
			pointer = pointer.next;
		}
	}
}
