// Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
// Memory Usage: 36.9 MB, less than 93.91% of Java online submissions for To Lower Case.


class Solution {
    public String toLowerCase(String str) {
        
        String result = "";
            
        for(int i=0;i<str.length();i++) { 
            char ch = str.charAt(i); 
            int as = (int) ch; 
            if (64<as && as<91) {
                as=as+32; 
                
            }
             result = result+new Character((char) as).toString();            
        }
        
        return result; 
    }
}
