package com.example.android.newsapp;

import android.content.Context;
import android.net.Uri;

/**
 * Created by ata6fd on 17-11-2017.
 */

public class geturl  {

    static String arr[] =
            {
                    "entertainment-daily",
                    "cbn",
                    "the Guardian times",
                    "techradar",
                    "bbc-sport",
                    "recode",
                    "new-scientist",
                    "espn-cric-info",
                    "google-news",

            };


    static String newsnames[] =
            {
                    "Entertainment News",
                    "Markerting news",
                    "Guardian Times",
                    "Tech News",
                    "Sports News",
                    "Tech Geeks",
                    "Science",
                    "Games News",
                    "Google News",
                    "MTV",
            };


    String mainurl = "https://newsapi.org/v1/articles?";

    public String getpreferences(int source,Context cxt)
    {


        Uri base = Uri.parse(mainurl);


        Uri.Builder bl = base.buildUpon();

        bl.appendQueryParameter("source", arr[source]);
        bl.appendQueryParameter("sortBy", "top");
        bl.appendQueryParameter("apiKey", cxt.getResources().getString(R.string.API_KEY));


        return bl.toString();
    }


}
