package com.example.kamalasekar.quotes;

import java.util.ArrayList;

/**
 * Created by Kamara Sekar on 2/18/2016.
 */
public class DataSource {

    // Getting the arraylist for the photopool and quote pool and the HDPool
    private ArrayList<Integer> mPhotoPool;
    private ArrayList<Integer> mQuotePool;
    private ArrayList<Integer> mPhotoHdPool;

    public ArrayList<Integer> getmPhotoHdPool() {
        return mPhotoHdPool;
    }

    public ArrayList<Integer> getmPhotoPool() {
        return mPhotoPool;
    }

    public ArrayList<Integer> getmQuotePool() {
        return mQuotePool;
    }

    // This method is to setup the Thumbnail images

    private void setupPhotoPool() {

        mPhotoPool.add(R.drawable.steve_1);
        mPhotoPool.add(R.drawable.steve_2);
        mPhotoPool.add(R.drawable.steve_3);
        mPhotoPool.add(R.drawable.steve_4);
        mPhotoPool.add(R.drawable.steve_5);
        mPhotoPool.add(R.drawable.steve_6);
        mPhotoPool.add(R.drawable.steve_7);
        mPhotoPool.add(R.drawable.steve_8);
        mPhotoPool.add(R.drawable.steve_9);
        mPhotoPool.add(R.drawable.steve_10);
    }

    // This method is to setup the quotes
    private void setupQuotePool() {
        mQuotePool.add(R.string.quote_1);
        mQuotePool.add(R.string.quote_2);
        mQuotePool.add(R.string.quote_3);
        mQuotePool.add(R.string.quote_4);
        mQuotePool.add(R.string.quote_5);
        mQuotePool.add(R.string.quote_6);
        mQuotePool.add(R.string.quote_7);
        mQuotePool.add(R.string.quote_8);
        mQuotePool.add(R.string.quote_9);
        mQuotePool.add(R.string.quote_10);

    }

    //This method to setup the HD_Images
    private void setupPhotoHDPool() {
        mPhotoHdPool.add(R.drawable.login_Icon);
        mPhotoHdPool.add(R.drawable.login_Icon);
        mPhotoHdPool.add(R.drawable.steve_hd_3);
        mPhotoHdPool.add(R.drawable.steve_hd_4);
        mPhotoHdPool.add(R.drawable.steve_hd_5);
        mPhotoHdPool.add(R.drawable.steve_hd_6);
        mPhotoHdPool.add(R.drawable.steve_hd_7);
        mPhotoHdPool.add(R.drawable.steve_hd_8);
        mPhotoHdPool.add(R.drawable.steve_hd_9);
        mPhotoHdPool.add(R.drawable.apple_hd);
    }

    public int getDataSourceLength() {
        return mPhotoPool.size();
    }

//This method triggers all the messages
    public DataSource() {
        mPhotoPool = new ArrayList();
        mQuotePool = new ArrayList();
        mPhotoHdPool = new ArrayList();
        setupPhotoPool();
        setupQuotePool();
        setupPhotoHDPool();

    }

}
