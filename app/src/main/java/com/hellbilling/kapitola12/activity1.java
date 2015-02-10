package com.hellbilling.kapitola12;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class activity1 extends ListActivity {
    private static final String[] items={"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity1);
        setListAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_multiple_choice,
                items));

        // nastavenie checknutych poloziek
        // asi preto ze tu je extends ListActivity tak nam getListView vrati ten ListView ktory je v xml definovany ako list
        final ListView pako = getListView();

        int size = 5;
        for (int i = 0; i <= size; i++) {
            switch(i) {
                case 2:
                    pako.setItemChecked(i, true);
                    break;
                case 5:
                    pako.setItemChecked(i, true);
                    break;
            }

        }
    }
}