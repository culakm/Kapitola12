package com.hellbilling.kapitola12;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class activity8 extends ListActivity {
    TextView selection;
    private static final String[] items={"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity8);
        setListAdapter(new IconicAdapter());
        selection=(TextView)findViewById(R.id.selection);
    }

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {
        selection.setText(items[position]);
    }

    class IconicAdapter extends ArrayAdapter<String> {
        IconicAdapter() {
            super(activity8.this, R.layout.row, items);
        }

        public View getView(int position, View convertView,
                            ViewGroup parent) {
            LayoutInflater inflater=getLayoutInflater();
            View row=inflater.inflate(R.layout.row, parent, false);
            TextView label=(TextView)row.findViewById(R.id.label);

            label.setText(items[position]);

            ImageView icon=(ImageView)row.findViewById(R.id.icon);

            if (items[position].length()>4) {
                icon.setImageResource(R.drawable.delete);
            }
            else {
                icon.setImageResource(R.drawable.ok);
            }

            return(row);
        }
    }
}
