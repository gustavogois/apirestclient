package challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class AppChallenge {
    private static final Logger log = LoggerFactory.getLogger(AppChallenge.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Author[]> responseEntity =
                restTemplate.getForEntity("http://bibliapp.herokuapp.com/api/authors", Author[].class);
        Author[] authors = responseEntity.getBody();
        log.info(Arrays.toString(authors));
    }
}
