package datastructure;

import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain5 {

	public static void main(String[] args) {
		//Stack - LIFO
		Stack <String> stack = new Stack<>();
		stack.push("C");
		stack.push("C++");
		stack.push("Python");
		stack.push("Java");
		//�����Ͱ� �������� ���ϵ˴ϴ�. - ���ŵǸ鼭 ����
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//�켱 ���� ť �����
		PriorityQueue <String> queue = 
			new PriorityQueue<>();
		queue.add("Oracle");
		queue.add("MySQL");
		queue.add("mSSQL");
		queue.add("Mongo DB");
		queue.add("Casandra");
		//ũ�Ⱑ ���� �ͺ��� ���� - Cassandra, MSSQL������ ���
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
