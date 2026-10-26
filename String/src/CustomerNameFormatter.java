import java.util.Locale;

public class CustomerNameFormatter {
  public static void main(String[] args) {

      String name = " shravani rajpure  ";
      name = name.trim().toLowerCase();

      String[] words = name.split("\\s+");
      String result = " ";

      for(String word : words){
          result = result
                  +word.substring(0,1).toUpperCase()
                  +word.substring(1) + " ";
      }
      System.out.println(result.trim());
    }
}
