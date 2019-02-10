package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/moj")
public class MojController {

    //locahost/moj
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity get() {
        ResponseEntity entity = new ResponseEntity("Hello Word", HttpStatus.OK);
        return entity;
    }

    //localhost/moj/json

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getJson() {
        String json = "{\n" +
                "\"imie\" : \"Adam\", \n" +
                "" +
                "}";

        ResponseEntity entity = new ResponseEntity("Hello Word", HttpStatus.OK);
        return entity;

    }
}
