package com.example.ivanf.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private String[] data = {
//            "c","java","html5","cpp","python","javascript","lisp",
//            "kotlin"};
    private List<Language> languagesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLanguage();
        LanguageAdapter languageAdapter = new LanguageAdapter(MainActivity.this,
                R.layout.language,languagesList);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
//                MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(languageAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Language language = languagesList.get(position);
                String content = language.getContent();
                String name = language.getName();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("LANGUAGE_CONTENT",content);
                intent.putExtra("LANGUAGE_NAME",name);
                startActivity(intent);
            }
        });
    }

    private void initLanguage(){
        Language c = new Language("c",R.drawable.c,"我是C");
        languagesList.add(c);
        Language java = new Language("java",R.drawable.java,"我是java");
        languagesList.add(java);
        Language html5 = new Language("html5",R.drawable.html5,"我是HTML5");
        languagesList.add(html5);
        Language cpp = new Language("cpp",R.drawable.cpp,"我是cpp");
        languagesList.add(cpp);
        Language python = new Language("pthon",R.drawable.python,"我是python");
        languagesList.add(python);
        Language javascript = new Language("javascript",R.drawable.javascript,"我是javascript");
        languagesList.add(javascript);
        Language kotlin = new Language("kotlin",R.drawable.kotlin,"我是kotlin");
        languagesList.add(kotlin);
    }
}
