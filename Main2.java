public class Main2 {
    public static void main (String[] args){

        String str = "abcdef.ghi";

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='.'){
                break;
            }
                System.out.println(str.charAt(i));
            }
        }
    }


