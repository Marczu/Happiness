package com.marcinmejner.happiness.data;

import com.marcinmejner.happiness.model.Quote;

import java.util.ArrayList;

/**
 * Created by Marc on 12.03.2018.
 */

public interface QuoteListAsyncResponse {
    void processFinished(ArrayList<Quote> quotes);
}
