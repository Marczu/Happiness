package com.marcinmejner.happiness;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.marcinmejner.happiness.model.Quote;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuoteFragment extends Fragment{


    public static final String QUOTE = "quote";
    public static final String AUTHOR = "author";

    public QuoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View quoteView = inflater.inflate(R.layout.fragment_quote, container, false);
        TextView quoteTextView = quoteView.findViewById(R.id.quote_fragment_tv);
        TextView authorTextView = quoteView.findViewById(R.id.author_fragment_tv);
        CardView cardView = quoteView.findViewById(R.id.cardView);

        String quote = getArguments().getString(QUOTE);
        String author = getArguments().getString(AUTHOR);

        quoteTextView.setText(quote);
        authorTextView.setText("-" + author);

        return quoteView;
    }

    public static final QuoteFragment newInstance(String quote, String author) {
        QuoteFragment fragment = new QuoteFragment();
        Bundle bundle = new Bundle();
        bundle.putString(QUOTE, quote);
        bundle.putString(AUTHOR, author);
        fragment.setArguments(bundle);

        return fragment;

    }

}
