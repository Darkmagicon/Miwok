package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        numbers.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int TextViewCount = numbers.size();
        TextView[] textViewArray = new TextView[TextViewCount];
        for (int i = 0; i < TextViewCount; i++)
        {
            textViewArray[i] = new TextView(this);
        }

        for (int i = 0; i < TextViewCount; i++)
        {
            textViewArray[i].setText(numbers.get(i));
            rootView.addView(textViewArray[i]);
        }
        /*while (i < numbers.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(numbers.get(i));
            rootView.addView(wordView);
        }*/

        /*TextView wordView = new TextView(this);
        wordView.setText(numbers.get(0));
        rootView.addView(wordView);

        TextView wordView1 = new TextView(this);
        wordView1.setText(numbers.get(1));
        rootView.addView(wordView1);

        TextView wordView2 = new TextView(this);
        wordView2.setText(numbers.get(2));
        rootView.addView(wordView2);*/
    }
}
