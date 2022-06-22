package datastructures;

import java.util.ArrayList;
import java.util.List;

/*
FILO
 */
public class TestStack {
    List<Integer> list;

    public TestStack() {
        list = new ArrayList<>();
    }

    // push
    public void push(int val){
        list.add(val);
    }

    // pop
    public int pop(){
        // check to see if already empty
        if (isEmpty()){
            System.out.println("Stack is already empty");
            return -999;
        }

        int lastIndex = list.size() - 1;
        int val = list.get(lastIndex);
        list.remove(lastIndex);
        return val;
    }

    // isEmpty
    public boolean isEmpty() {
        if (list.size() == 0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        TestStack stack = new TestStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int val = stack.pop();
        System.out.println(val);
    }
}
