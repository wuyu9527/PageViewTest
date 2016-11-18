package com.xf.pageviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.BaseAdapter;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PageWidget page = (PageWidget) findViewById(R.id.main_pageWidget);
        BaseAdapter adapter = new PageWidgetAdapter(this);
        page.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
