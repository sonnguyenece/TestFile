import java.util.Arrays;
import java.util.Base64;

public class testJWT {
    public static void main(String[] args) {
//        String payload = "{\"sub\":\"nhs3108\",\"exp\":1558063837}";
//        System.out.println(Arrays.toString(payload.getBytes()));
//        System.out.println(Base64.getUrlEncoder().encodeToString(payload.getBytes()));
//        System.out.println(Base64.getEncoder().encodeToString(payload.getBytes()));
        String header = "{\"alg\":\"HS256\",\"typ\":\"JWT\"}";
        String encodedHeader = Base64.getUrlEncoder().encodeToString(header.getBytes());

        String payload = "{\"sub\":\"nhs3108\",\"exp\":1558063837}";
        String encodedPayload = Base64.getUrlEncoder().encodeToString(payload.getBytes());

        String signature = encodedHeader + "." + encodedPayload;

//        String encodedSignature = HMACSHA256.encode(signature, scretKey);

//        System.out.println(encodedSignature);


    }
}
