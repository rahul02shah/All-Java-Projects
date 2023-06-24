public class NewOne {
    // create a stack program using array
    // push
    // pop
// peek
// isEmpty
// isFull
// size
// print
//
    int[] stack = new int[5];
    int top = 0;
    public void push(int data){
        if (isFull()){
            System.out.println("Stack Is Full");
        }else{
            stack[top] = data;
            top++;
        }
    }
    public int pop(){
        int data = 0;
        if (isEmpty()){
            System.out.println("Stack Is Empty");
        }else{
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public boolean isFull(){
        return top>=5;
    }
    public void show(){
        for (int n : stack){
            System.out.print(n+" ");
        }
    }
}
