package com.thedarkshadows.demoaccordian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> movies = new ArrayList<String>();
        movies.add("Harry Potter");
        movies.add("Lord of the Rings");
        movies.add("Avengers");
        movies.add("Pirates of the Carribean");
        movies.add("Your Name");

        List<String> anime = new ArrayList<String>();
        anime.add("Naruto");
        anime.add("Demon Slayer");
        anime.add("Pokemon");
        anime.add("Death Note");
        anime.add("Dr. Stone");

        List<String> tvseries = new ArrayList<String>();
        tvseries.add("Sherlock");
        tvseries.add("Game of Thrones");
        tvseries.add("Breaking Bad");
        tvseries.add("F.R.I.E.N.D.S");
        tvseries.add("Stranger Things");

        expandableListDetail.put("MOVIES", movies);
        expandableListDetail.put("ANIMES", anime);
        expandableListDetail.put("TV SERIES", tvseries);
        return expandableListDetail;
    }
}