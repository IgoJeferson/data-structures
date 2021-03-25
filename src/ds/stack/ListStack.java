package ds.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<X> implements Stack<X> {

    private List<X> data;
    private int stackPointer;

    public ListStack(){
        data = new ArrayList<>();
        stackPointer = 0;
    }

    // Constant performance = O(1)
    public void push(X newItem){
        data.add(stackPointer++, newItem);
    }

    // Constant performance = O(1)
    public X pop(){
        if(stackPointer == 0){
            throw new IllegalArgumentException("No more items on the stack");
        }
        return data.remove(--stackPointer);
    }

    // Basic linear function = O(n)
    public boolean contains(X item){
        boolean found = false;

        for(int i = 0; i < stackPointer; i++){
            if(data.get(i).equals(item)){
                found = true;
                break;
            }
        }

        return found;
    }

    // Basic linear function = O(n)
    public X access(X item){
        while(stackPointer > 0){
            X tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }

        // if we didn't find the item in the stack throw an exception
        throw new IllegalArgumentException("Could not find item on the stack: " + item);

    }

    public int size(){
        return stackPointer;
    }

}
