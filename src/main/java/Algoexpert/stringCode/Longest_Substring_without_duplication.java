import java.util.*;

class Program {
    public static String longestSubstringWithoutDuplication(String str) {
        int len = str.length();
        int start,end;
        start = end =0;
        String resStr = "";
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<len;i++){
            if(m.containsKey(str.charAt(i))){
                int temp = m.get(str.charAt(i))+1;
                if(start<temp){
                    start = temp;
                }
                m.put(str.charAt(i),i);
            }
            else{
                m.put(str.charAt(i),i);
            }
            end = i;
            if(resStr.length()<end-start+1){
                resStr = str.substring(start,end+1);
            }
        }
        return resStr;
    }
}
