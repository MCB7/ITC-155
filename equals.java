package final2;

import java.util.Stack;

public class equals {

public static boolean equals1(Stack<Integer> s1, Stack<Integer> s2) {
    Stack<Integer> storage = new Stack<Integer>();
    
    if (s1.size() != s2.size()) {
        return false;
    } else {
        boolean same = true;
        
        while (same && !s1.isEmpty()) {
            int num1 = s1.pop();
            int num2 = s2.pop();
            if (num1 != num2) {
                same = false;
            }
            storage.add(num1);
            storage.add(num2);
        }
        
        while (!storage.isEmpty()) {
            s2.push(storage.pop());
            s1.push(storage.pop());
        }
        
        return same;
    }
}
public static void main(String[] args) {
	
    Stack<Integer> even = new Stack<>();

    even.push(0);
    even.push(2);
    even.push(4);
    even.push(6);
    even.push(8);
    even.push(10);
    even.push(12);
    even.push(14);
    even.push(16);

    Stack<Integer> odd = new Stack<>();

    odd.push(0);
    odd.push(1);
    odd.push(3);
    odd.push(5);
    odd.push(7);
    odd.push(9);
    odd.push(11);
    odd.push(13);
    odd.push(15);


	System.out.println(equals1(even, even));
}
}
