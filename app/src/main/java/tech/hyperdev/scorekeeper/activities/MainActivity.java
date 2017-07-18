package tech.hyperdev.scorekeeper.activities;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    Context context;
    TextView textView2;
    ImageButton btnPlus;
    ImageButton btnMinus;
    TextView tvTeamName;
    FragmentManager team1;
    FragmentManager team2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView)findViewById(R.id.textView2);
        btnPlus = (ImageButton)findViewById(R.id.btnPlus);
        btnMinus = (ImageButton) findViewById(R.id.btnMinus);
        tvTeamName = (TextView)findViewById(R.id.tvTeamName);

        context=this;
        btnPlus.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                String present_value_string = textView2.getText().toString();
                int present_value_int = Integer.parseInt(present_value_string);
                present_value_int++;

                textView2.setText(String.valueOf(present_value_int));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                String present_value_string = textView2.getText().toString();
                int present_value_int = Integer.parseInt(present_value_string);
                present_value_int--;
                if(present_value_int<=0)
                {
                    btnMinus.setEnabled(false);
                }
                else{
                    btnMinus.setEnabled(true);

                }

                textView2.setText(String.valueOf(present_value_int));
            }
        });

    }


}

