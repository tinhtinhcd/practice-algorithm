public class MinAddToMakeValid {
    public int minAddToMakeValid(String S) {
        int count = 0;
        int needCorrect = 0;
        for(char c : S.toCharArray()){
            count += c=='('?1:-1;
            if(count < 0){
                count++;
                needCorrect++;
            }
        }
        return needCorrect+count;
    }
}
