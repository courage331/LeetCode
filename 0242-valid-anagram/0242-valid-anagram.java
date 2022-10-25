class Solution {
    public boolean isAnagram(String s, String t) {
        String [] sArr = s.split("");
        String [] tArr = t.split("");
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        if(tArr.length != sArr.length) return false;
        for(int i=0; i<sArr.length; i++){
            if(!sArr[i].equals(tArr[i])){
                return false;
            }
        }
        return true;
    }
}