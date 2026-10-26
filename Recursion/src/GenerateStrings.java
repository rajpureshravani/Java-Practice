public class GenerateStrings {

    static void generate(char[] chars , String current , int length){

        if(current.length() == length){
            System.out.println(current);
            return;
        }

        // Recursive case
        for(int i=0;i<chars.length;i++){
            generate(chars,current + chars[i],length);
        }
    }

    public static void main(String[] args) {

        char[] chars = {'A' ,'B','C'};
        generate(chars ,"",3);

    }
}
