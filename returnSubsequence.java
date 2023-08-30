import java.util.ArrayList;
public class returnSubsequence {
    //RETURN ALL SUBSEQUENCES IN LIST
    public static ArrayList<String> get(String s){
        ArrayList<String> ans= new ArrayList<>();
        if(s.length()== 0){
            ans.add(" ");
            return ans;
        }
        char chat= s.charAt(0);
        ArrayList<String>small= get(s.substring(1));
        for(String ss:small){
            ans.add(ss);
            ans.add(chat+ ss);

        }
        return ans;

    }
    public static void main(String[]args){
        ArrayList<String>ans= get("ABC");
        for(String ss: ans){
            System.out.println(ans);
        }

    }

}
