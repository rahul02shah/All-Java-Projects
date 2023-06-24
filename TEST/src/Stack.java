public class Stack {
    // stack usign array
    int[] arr;
    int top;
    int size;
    public Stack(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    public void push(int data){
        if(top == size-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top] = data;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i = top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        s.pop();
        s.display();
        s.peek();
    }


}
