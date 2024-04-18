// if the given string contains a then it will be removed

public class substring {

    // 1st apporach 
    static void PrintStr(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            PrintStr(s.substring(1), ans);  // if at 0 position string have a then it will be removed and increase by one
        }else{
            PrintStr(s.substring(1), ans+ch);  // taking substring as 1 beacuse we have taken this character in the ans and need to cheak other
        }
    }

    // 2nd oproach
    static String RetrunStr(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return RetrunStr(s.substring(1));
        }else{
            return ch + RetrunStr(s.substring(1));
        }
    }


    public static void main(String[] args) {
        PrintStr("Abhay", "");

        System.out.println(RetrunStr("Abhay"));
    }


}