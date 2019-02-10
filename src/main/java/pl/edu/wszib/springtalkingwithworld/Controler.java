package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class Controler {

    List <String> list = new ArrayList<>();

    @GetMapping("/istnieje/{imie}/{nazwisko}")
    public ResponseEntity get(@PathVariable String imie, @PathVariable String nazwisko){
        String osoba = imie + " " + nazwisko;

        if (list.contains(osoba)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping ("/zapisz/{imie}/{nazwisko}")
    public ResponseEntity post(@PathVariable String imie, @PathVariable String nazwisko){
       String osoba1 = imie + " " + nazwisko;

        if (list.contains(osoba1)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            list.add(osoba1);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }


    }
}
