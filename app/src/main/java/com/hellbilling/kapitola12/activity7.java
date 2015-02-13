package com.hellbilling.kapitola12;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class activity7 extends ListActivity {
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
        setContentView(R.layout.activity_activity6);
        setListAdapter(new IconicAdapter());
        selection=(TextView)findViewById(R.id.selection);
    }

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {
        selection.setText(items[position]);
    }

    class IconicAdapter extends ArrayAdapter<String> {
        IconicAdapter() {
            super(activity7.this, R.layout.row_ba, R.id.label, items);
        }

        public View getView(int position, View convertView,
                            ViewGroup parent) {
            View row=super.getView(position, convertView, parent);
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
