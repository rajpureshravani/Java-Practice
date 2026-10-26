public class EmailValidator {
   public static void main(String[] args) {

       String email = "shravani@gmail.com";

       boolean containsAt = email.contains("@");
       int atIndex = email.indexOf("@");
       int dotIndex = email.lastIndexOf(".");

       boolean containsDomain = dotIndex > atIndex;

       System.out.println("Email contains @: " + containsAt);
       System.out.println("Email contains domain : " + containsDomain);




    }
}
