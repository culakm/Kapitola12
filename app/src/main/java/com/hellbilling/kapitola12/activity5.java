package com.hellbilling.kapitola12;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


public class activity5 extends Activity
        implements TextWatcher {
    private TextView selection;
    private AutoCompleteTextView edit;
    private static final String[] items={"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "morllis",
            "etiam", "velaa", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity5);
        selection=(TextView)findViewById(R.id.selection);
        edit=(AutoCompleteTextView)findViewById(R.id.edit);
        edit.addTextChangedListener(this);

        edit.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                items));
    }

    public void onTextChanged(CharSequence s, int start, int before,
                              int count) {
        selection.setText(edit.getText() +" kravina--"+s+"--" + " start: " + start + " before: " + before + " count: "+ count);
    }

    public void beforeTextChanged(CharSequence s, int start,
                                  int count, int after) {
        // needed for interface, but not used
    }

    public void afterTextChanged(Editable s) {
        // needed for interface, but not used
    }
}