package spring.framework.joker.example.jokerexample.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetQuoteService {

    public String getQuote() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();


        return quotes.getRandomQuote();
    }
}
