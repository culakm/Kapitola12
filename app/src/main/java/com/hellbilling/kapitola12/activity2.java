package com.hellbilling.kapitola12;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class activity2 extends Activity
        implements AdapterView.OnItemSelectedListener {
    private TextView selection;
    private static final String[] items={"lorem", "ipsum", "dolor","",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity2);
        selection=(TextView)findViewById(R.id.selection);

        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                items);

        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    public void onItemSelected(AdapterView<?> parent,
                               View v, int position, long id) {
        selection.setText(items[position]);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(), " vypisem sa ked tento select zmizne z tohoto view", Toast.LENGTH_SHORT).show();

        selection.setText("");
    }
}
