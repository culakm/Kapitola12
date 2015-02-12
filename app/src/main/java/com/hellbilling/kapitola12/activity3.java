package com.hellbilling.kapitola12;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class activity3 extends Activity
        implements
        //AdapterView.OnItemSelectedListener, toto nefungovalo tak som to nahradil OnItemClickListener
        AdapterView.OnItemClickListener {
    private TextView selection;
    private static final String[] items={"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "morllis",
            "etiam", "velaa", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity3);
        selection=(TextView)findViewById(R.id.selection);

        GridView g=(GridView) findViewById(R.id.grid);
        g.setAdapter(new ArrayAdapter<String>(this,
                R.layout.cell,
                items));
        //g.setOnItemSelectedListener(this);
        g.setOnItemClickListener(this);
    }

//    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
//        selection.setText(items[position]);
//    }
    public void onItemClick(AdapterView<?> parent, View v,
                            int position, long id) {
        selection.setText(items[position]);
        Toast.makeText(getApplicationContext(), " Pako hura : " + items[position], Toast.LENGTH_SHORT).show();

    }

//    public void onNothingSelected(AdapterView<?> parent) {
//        selection.setText("");
//    }
}