public class Main3 {
    public static void main (String[] args){

        System.out.println(halfWord("HelloWoo"));

    }
    public static String halfWord (String word){
        String firstHalf = word.substring(0,word.length()/2);
        return firstHalf;
    }
}
