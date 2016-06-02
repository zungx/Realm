package com.zungx.realmdatabase.adapters;

import android.content.Context;

import com.zungx.realmdatabase.model.Book;

import io.realm.RealmResults;

/**
 * Created by ZungX on 5/31/2016.
 */
public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}