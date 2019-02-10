package pl.edu.wszib.springtalkingwithworld;

import io.swagger.models.auth.In;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/restauracja")
public class RestauracjaController {

    @GetMapping("/koszt")
    public ResponseEntity koszt(@RequestParam("imie")String imie,
                                @RequestParam(value = "imiezony", required = false) String imiez,
                                @RequestParam(value = "imiepsa", required = false) String imiep,
                                @RequestParam(value = "imied", required = false) String imied) {

        Klient klient = new Klient();
        klient.imie = imie;
        klient.zwierze = imiep != null;
        klient.osobaTowarzyszaca = imiez != null;
        klient.dziecko = imied != null;

        return ResponseEntity.ok(Restauracja.koszt(klient));


    }

}
