package com.example.ivanf.listview;

import android.content.Context;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ivanf on 2017/6/1.
 */

public class LanguageAdapter extends ArrayAdapter {
    private  int resourceId;
    public LanguageAdapter(Context context, int textViewResourceId,
                           List<Language> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Language language = (Language) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView languageImage = (ImageView) view.findViewById(R.id.language_image);
        TextView languageName = (TextView) view.findViewById(R.id.language_name);
        TextView languageContext = (TextView) view.findViewById(R.id.language_context);
        languageImage.setImageResource(language.getImageId());
        languageName.setText(language.getName());
        languageContext.setText(language.getContent());
        return view;
    }
}
