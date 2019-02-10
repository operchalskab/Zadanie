package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/body")
public class BodyController {

    @PostMapping
    public ResponseEntity post(@RequestBody Klient klient){
        return ResponseEntity.ok(Restauracja.koszt(klient));
    }

}
