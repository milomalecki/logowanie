package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    private List<Quotation> quotations;

    public QuotationApi(){
        this.quotations=new ArrayList<>();
        quotations.add(new Quotation("Cytat 1: Lorem Ipsum","Autor 1"));
        quotations.add(new Quotation("Cytat 2: Ipsum Lorem","Autor 2"));
        quotations.add(new Quotation("Cytat 3: Merol Ipsum","Autor 3"));
        quotations.add(new Quotation("Cytat 4: Lorem Muspi","Autor 4"));
    }

    @GetMapping("/api")
    public List<Quotation> getQuotations(){
        return quotations;
    }

    @PostMapping("/api")
    public boolean addQuotation(@RequestBody Quotation quotation){
        return quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuotation(@RequestParam int index){
        quotations.remove(index);
    }
}
