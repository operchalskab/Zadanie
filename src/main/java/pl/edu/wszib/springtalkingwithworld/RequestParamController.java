package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
@RequestMapping("/paramaterTest")
public class RequestParamController {

//    @GetMapping
//    public ResponseEntity get(@RequestParam("pierwsza") int liczba1,
//                              @RequestParam("druga") int liczba2,
//                              @RequestParam(value = "trzecia", required = false) Integer trzecia){
//        return ResponseEntity.ok(liczba1 + liczba2);
//    }

//        @GetMapping
//    public ResponseEntity get(@RequestParam("liczby") int []liczby){
//        return ResponseEntity.ok(Arrays.stream(liczby).count());
//    }

    @GetMapping("/suma")
    public ResponseEntity suma(@RequestParam("liczby") int []liczby){
        return ResponseEntity.ok(Arrays.stream(liczby).sum());
    }

    @GetMapping("/średnia")
    public ResponseEntity srednia(@RequestParam("liczby") int []liczby){
        return ResponseEntity.ok(Arrays.stream(liczby).average());
    }

    @GetMapping("/minimum")
    public ResponseEntity minimum(@RequestParam("liczby") int []liczby){
        return ResponseEntity.ok(Arrays.stream(liczby).min());
    }
    @GetMapping("/mnożenie")
    public ResponseEntity multiply(@RequestParam("liczby") int []liczby){
        return ResponseEntity.ok(Arrays.stream(liczby).reduce((x,y) -> x*y));
    }



}
