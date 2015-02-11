package com.hellbilling.kapitola12;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ListActivity {
    private TextView selection;
    private static final String[] items={"multipleChoice","act 2","act3"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                items));
        selection=(TextView)findViewById(R.id.selection);

    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        selection.setText(items[position]);

        Intent intent;
        switch(position) {
            case 0:
                intent = new Intent(this, activity1.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, activity2.class);
                startActivity(intent);
                break;
        }

//        ActivityInfo[] list = getPackageManager().getPackageInfo(getPackageName()).activities;
//        int countActivities = 2;
//        for (int i = 0; i < countActivities; i++) {
//            if (i == position) {
//                String activityName = "activity" + i;
//                intent = new Intent(this, activityName.class);
//                startActivity(intent);
//            }
//        }
    }
}