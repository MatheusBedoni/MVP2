package com.example.mvp2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShowModel implements Show.Model{

    List<TvShow> localList =new ArrayList<TvShow>();
    private static ShowModel instance = null;
    protected ShowModel() {

        String title="Luke Cage";
        String descr= "dsds";
        String id = UUID.randomUUID().toString();
        int image = R.drawable.luke_cage;
        TvShow tvs1 = new TvShow(title,descr,id,image);
        localList.add(tvs1);

        title="Daredevil";
        descr="dsds";
        id = UUID.randomUUID().toString();
        image = R.drawable.daredevil;
        TvShow tvs2 = new TvShow(title,descr,id,image);
        localList.add(tvs2);

        title="Jessica Jones";
        descr= "dccvc";
        id = UUID.randomUUID().toString();
        image = R.drawable.jessica_jones;
        TvShow tvs3 = new TvShow(title,descr,id,image);
        localList.add(tvs3);

        title="House of cards";
        descr= "sdds";
        id = UUID.randomUUID().toString();
        image = R.drawable.house_of_cards;
        TvShow tvs4 = new TvShow(title,descr,id,image);
        localList.add(tvs4);

        title="The Getdown";
        descr= "sdsdsdsd";
        id = UUID.randomUUID().toString();
        image = R.drawable.the_getdown;
        TvShow tvs5 = new TvShow(title,descr,id,image);
        localList.add(tvs5);
    }
    public static ShowModel getInstance() {
        if(instance == null) {
            instance = new ShowModel();
        }
        return instance;
    }

    @Override
    public List<TvShow> getTvShows() {
        return localList;
    }
}