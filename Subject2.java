import java.util.HashSet;
import java.util.Stack;

public class Subject2 {
    public static void main(String[] args) {
              
              
        /* Using discrete structure
		* Assume all sets are subsets of a universal set U.
		* U = { Chemistry, Mathematics, Biology, English, Geography, Physics}
		* A = {chemistry, mathematics, Biology, English}
		* B = { Biology, English, Geography, Physics}

		*/

		// In Java a linkedList class can be use as list, stack or queue.  
        // Creating stack 1
        Stack<String> stack1 = new Stack<String>();
        // Adding stack 1 elements 
        stack1.add("Chemistry");
        stack1.add("Mathematics");
        stack1.add("Biology");
        stack1.add("English");
        
        // Creating stack 1
        Stack<String> stack2 = new Stack<String>();
        // Adding stack 1 elements 
        stack2.add("Biology");
        stack2.add("English");
        stack2.add("Geography");
        stack2.add("Physics");
        
        // Displaying Stack 1 and Stack 2 values
        System.out.println("---------------Values in Stack 1---------------");
        System.out.println(stack1.toString());
        System.out.println();
        System.out.println("---------------Values in Stack 2---------------");
        System.out.println(stack2.toString());
        System.out.println();
        
        // Original data is in stack 1 and stack2
        // copying data from stack to hashset
        HashSet<String> set1 = new HashSet<>(); 
        set1.addAll(stack1);
        HashSet<String> set2 = new HashSet<>(); 
        set2.addAll(stack2);
        
        
        
        System.out.println("Values Only Present in the First Stack");
      
        System.out.println(onlyInFirstStack(set1, set2));
        System.out.println();
        
        System.out.println("Values Only Present in the Second Stack");
        
        System.out.println(onlyInFirstStack(set2, set1));
        System.out.println();
        
        System.out.println("Values in both Stacks");
        
        System.out.println(intersection(set1,set2));
        
}
// A - B = the set of all x in U such that x in A and x is not in B
// A - B = { Chemistry, Mathematics}

// B - A = the set of all x in U such that x in B and x is not in A
// B - A = { Geography, Physics}


public static Stack<String> onlyInFirstStack(HashSet<String> set1, HashSet<String> set2){
        
        Stack<String> unique = new Stack<String>();
        for(String s1: set1) {
                // contains method returns true if string exists
                // if not exists returns false
                if(!set2.contains(s1))
                       
                        unique.add(s1);
        }
        return unique;
}
/* In Discrete structure we learned 
 * Set Theory: Definitions and the element method of proof.
   The intersection of A and B, denoted A intersect B, is the set of all 
   elements that are common to both A and B.
   A intersect B is the set of all x in U such that x in A and x in B
   Therefore, A intersect B = {English, Biology}
*/

// returns the intersection of two stacks
public static Stack<String> intersection(HashSet<String> set1, HashSet<String> set2){
        Stack<String> same = new Stack<String>();
        for(String s1: set1) {
                if(set2.contains(s1))
                        same.add(s1);
        }
        return same;
}

}

