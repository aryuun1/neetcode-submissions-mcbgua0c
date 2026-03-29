class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> S_counter = new HashMap<>();
        HashMap<Character, Integer> T_counter = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            S_counter.put(s.charAt(i), S_counter.getOrDefault(s.charAt(i),0) + 1);
            T_counter.put(t.charAt(i), T_counter.getOrDefault(t.charAt(i),0) + 1);
        }

        return S_counter.equals(T_counter);
    }
}
