class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sc =  new Stack<>();

        for(String c: tokens){
            if(c.equals("+")){
                sc.push(sc.pop()+sc.pop());
            }
            else if(c.equals("-")){
                int a = sc.pop();
                int b = sc.pop();
                sc.push(b-a);
            }
            else if(c.equals("*")){
                sc.push(sc.pop()*sc.pop());
            }
            else if(c.equals("/")){
                int a = sc.pop();
                int b = sc.pop();
                sc.push(b/a);
            }
            else{
                sc.push(Integer.parseInt(c));
            }
        }
        return sc.pop();
    }
}
