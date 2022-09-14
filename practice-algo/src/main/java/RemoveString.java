import java.util.Stack;

public class RemoveString {
    public int remove(String s){
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;

        Stack stack = new Stack();
        stack.add(s.charAt(0));


        for (int i = 1; i < s.length(); i++){

            String pre = String.valueOf(stack.isEmpty()?"":stack.peek());
            String valI = String.valueOf(s.charAt(i));

            if("*".equals(valI) || pre.equals("*"))
                stack.add(valI);
            else {
                if (pre.equals(""))
                    stack.add(valI);
                else if(Integer.parseInt(pre) - Integer.valueOf(valI) ==1 || Integer.valueOf(pre) - Integer.valueOf(valI) ==-1)
                    stack.pop();
                else stack.add(valI);
            }
        }
        return stack.size();
    }
}
