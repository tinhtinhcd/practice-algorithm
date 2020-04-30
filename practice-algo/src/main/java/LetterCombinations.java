import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {

    HashMap<String, String[]> maps = new HashMap<String, String[]>(){{
        put("2", new String[]{"a","b","c"});
        put("3", new String[]{"d","e","f"});
        put("4", new String[]{"g","h","i"});
        put("5", new String[]{"j","k","l"});
        put("6", new String[]{"m","n","o"});
        put("7", new String[]{"p","q","r","s"});
        put("8", new String[]{"t","u","v"});
        put("9", new String[]{"w","x","y", "z"});
    }};


    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0)
            return new ArrayList<>();

        if(digits.length()==1){
            return Arrays.asList(maps.get(digits));
        }

        String[][] inp = new String[digits.length()][4];

        for(int i = 0; i < digits.length()-1; i ++){
            inp[i] = maps.get(digits.substring(i,i+1));
        }
        inp[digits.length()-1] = maps.get(digits.substring(digits.length()-1, digits.length()));

        return combination(inp);
    }


    private List<String> combination(String[][] input){

        List<String> rs = new ArrayList<>();
        rs.addAll(Arrays.asList(input[1]));
        for (int i = 0 ; i < input.length-1; i ++){
            for(int j = 0; j < input[i].length ; j ++){
                rs = combineOne(input[i][j], rs.toArray(new String[rs.size()]));
            }
        }
        return rs;
    }

    private List<String> combineOne(String a, String[] b){
        List<String> rs = new ArrayList<>();
        if(b == null)
            return rs;
        for(int i = 0; i < b.length; i ++){
            rs.add(a+b[i]);
        }
        return rs;
    }
}
