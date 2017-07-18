package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {

    private static ImageButton btnPlus;
    private static ImageButton btnMinus;
    private static TextView textView2;
    private static TextView tvTeamName;
    private static int team1;
    private static int team2;

    int a = 0;

    public ScoreFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_score, container, false);

        btnPlus = (ImageButton) view.findViewById(R.id.btnPlus);
        btnMinus = (ImageButton) view.findViewById(R.id.btnMinus);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        tvTeamName = (TextView) view.findViewById(R.id.tvTeamName);

        btnPlus.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        plusOnclick(v);
                    }
                }
        );

        return view;
    }
    public void plusOnclick(View v){
        textView2.setText(""+a);
    }
}
