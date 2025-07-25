import java.util.Stack;

class StockSpanner {
    private Stack<int[]> stack;
    
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String args[]) {
        StockSpanner s = new StockSpanner();
        System.out.print(s.next(100)+" ");  
        System.out.print(s.next(80)+" ");   
        System.out.print(s.next(60)+" ");   
        System.out.print(s.next(70)+" ");   
        System.out.print(s.next(60)+" ");   
        System.out.print(s.next(75)+" ");   
        System.out.print(s.next(85)+" ");   
    }
}