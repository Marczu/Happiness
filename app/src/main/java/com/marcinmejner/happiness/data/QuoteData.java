package com.marcinmejner.happiness.data;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.android.volley.*;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.marcinmejner.happiness.model.Quote;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Marc on 12.03.2018.
 */

public class QuoteData {
    Context context;

    ArrayList<Quote> queueArrayList = new ArrayList<>();

    public QuoteData(Context context) {
        this.context = context;

    }

    public void getQuotes(){

        String url = "https://raw.githubusercontent.com/pdichone/UIUX-Android-Course/master/Quotes.json%20";

        final RequestQueue queue = Volley.newRequestQueue(context);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                for (int i = 0; i < response.length() ; i++) {

                    try {
                        JSONObject quoteObject = response.getJSONObject(i);
                        Quote quote = new Quote();
                        quote.setQuote(quoteObject.getString("quote"));
                        quote.setAuthor(quoteObject.getString("name"));

                        queueArrayList.add(quote);


//                        Log.d("array", queueArrayList.get(i).getQuote());

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }


                Log.d("array", queueArrayList.get(8).getQuote());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        queue.add(jsonArrayRequest);

        Log.d("koniec", "koniec");

    }



}
