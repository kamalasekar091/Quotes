package com.example.kamalasekar.quotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kamara Sekar on 2/18/2016.
 * This class maps the quotes and the image  to the respective parts
 */
public class QuoteDetail extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mQuote;
    private int mPosition;
    private DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote_detail);

        Intent i = getIntent();
        mPosition = i.getIntExtra("position", 0);

        mDataSource = new DataSource();
        mImageView = (ImageView) findViewById(R.id.image);
        mQuote = (TextView) findViewById(R.id.quote);

        mImageView.setImageResource(mDataSource.getmPhotoHdPool().
                get(mPosition));

        mQuote.setText(getResources().getString(mDataSource.getmQuotePool()
                .get(mPosition)));
    }

}

