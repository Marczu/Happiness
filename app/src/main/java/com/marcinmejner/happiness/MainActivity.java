package com.marcinmejner.happiness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.marcinmejner.happiness.data.QuoteData;
import com.marcinmejner.happiness.model.Quote;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuoteData quoteData = new QuoteData(this);


        quoteData.getQuotes();





//        String url = "https://raw.githubusercontent.com/pdichone/UIUX-Android-Course/master/Quotes.json%20";
//
//        final RequestQueue queue = Volley.newRequestQueue(this);
//
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//
//                for (int i = 0; i < response.length() ; i++) {
//
//                    try {
//                        JSONObject quoteObject = response.getJSONObject(i);
//                        Quote quote = new Quote();
//                        quote.setQuote(quoteObject.getString("quote"));
//                        quote.setAuthor(quoteObject.getString("name"));
//
//                        Log.d("quote", quote.getAuthor().toString() + " Cytat:  " + quote.getQuote().toString());
//
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//
//
//        queue.add(jsonArrayRequest);



    }
}
