class Solution {
    public boolean isAnagram(String s, String t) {
        String [] sArr = s.split("");
        String [] tArr = t.split("");
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        //t를 재배열 해서 s만들수 있는가 
        if(tArr.length != sArr.length) return false;
        //if(String.join("",sArr).contains(String.join("",tArr))) return true;
        for(int i=0; i<sArr.length; i++){
            if(!sArr[i].equals(tArr[i])){
                return false;
            }
        }
        return true;
    }
}