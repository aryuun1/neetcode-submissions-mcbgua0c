class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        Map<Character, Character> close = new HashMap<>();
        close.put(')','(');
        close.put(']','[');
        close.put('}','{');
        for(char c: s.toCharArray()){
            if(close.containsKey(c)){   
                if(!sc.isEmpty() && sc.peek() == close.get(c)){
                    sc.pop();
                }else{
                    return false;
                }
            }else{
                sc.push(c);
            }
        }
        return sc.isEmpty();
    }
}
