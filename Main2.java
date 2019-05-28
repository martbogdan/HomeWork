public class Main2 {
    public static void main (String[] args){

        String str = "abcdef.ghi";
        int count =0;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='.'){
                break;
            }
            count++;
            System.out.println(str.charAt(i));
            }
        System.out.println("number of characters is "+count);
        }
    }


