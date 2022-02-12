package com.example.springoppgave2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static java.lang.String.format;

@RestController
public class ValutaController {
    private String[] valutasorter = {"USD", "SEK", "EUR", "CNY", "JPY"};
    private double[] valutakurser = {8.2, 1.2, 10.6, 1.3, 0.2};

    @GetMapping("/sjekk")
    ArrayList visValutaKurs(){
        ArrayList<Valuta> valutaRegister = new ArrayList<>();
        for(int i = 0; i < valutasorter.length; i++){
            Valuta valuta = new Valuta(valutasorter[i], valutakurser[i]);
            valutaRegister.add(valuta);
        }
        return valutaRegister;
    }
    @GetMapping("/regn")
    String valutaRegn(Valuta innValuta){
        String sort = innValuta.getValutasort();
        int index=0;
        for(int i = 0; i < valutasorter.length; i++){
            //比较两个string一定要用.equals() !!!!!!!!!!!
            if(valutasorter[i].equals(sort)){
                index=i;
                break;
            }
        }
        double kurs = valutakurser[index];
        double belop = innValuta.getValutakurs();
        double nok = belop*kurs;
        return belop + " " + sort + " blir " + format("%.2f", nok) + " NOK.";
    }

}
