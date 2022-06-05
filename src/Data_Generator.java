import java.security.SecureRandom;
import java.util.Random;

public class Data_Generator {

    static int Random(){
        Random rand = new Random();
        int random_num = rand.nextInt(10000000);
        return random_num;
    }

    static String randomString(int len){
        final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();

        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

}
