// 535. Encode and Decode TinyURL

package leetcode.blind75.Arrays;
import java.util.*;

public class EncodeDecodeTinyUrl {
    static Map<String, String> codeDB = new HashMap<>();
    static Map<String, String> urlDB = new HashMap<>();
    static String chars = "0123456789ABCDEFGIKLMNOPQRSTUVWXYZabcdefgiklmnopqrstuvwxyz";
    
    public static void main(String[] args) {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        System.out.println(endCode(longUrl));
    }
    
    public static String getCode() {
        char[] code = new char[6];
        for (int i = 0; i < 6; i++) {
            code[i] = chars.charAt((int)Math.random() * 62);
        }
        return "https://tinyurl.com/" + String.valueOf(code);
    }
    
    public static String endCode(String longUrl) {
        if(urlDB.containsKey(longUrl)) {
            return longUrl;
        }
        String code = getCode();
        while (codeDB.containsKey(code)) {
            code = getCode();
        }
        codeDB.put(code, longUrl);
        urlDB.put(longUrl, code);
        return code;
    }
    
    public static String decode(String shortUrl) {
        return codeDB.get(shortUrl);
    }
}
