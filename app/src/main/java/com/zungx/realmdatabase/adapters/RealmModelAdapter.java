package com.zungx.realmdatabase.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.realm.Realm;
import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by ZungX on 5/31/2016.
 */
public class RealmModelAdapter<T extends RealmObject> extends RealmBaseAdapter<T> {


    public RealmModelAdapter(Context context, RealmResults<T> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }


}