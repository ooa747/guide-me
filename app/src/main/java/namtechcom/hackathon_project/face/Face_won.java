package namtechcom.hackathon_project.face;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import namtechcom.hackathon_project.AR.ARActivity;
import namtechcom.hackathon_project.OPTION.ScrollingActivity;
import namtechcom.hackathon_project.OPTION.Translator;
import namtechcom.hackathon_project.R;

public class Face_won extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_won);

        CardView cardView;

        cardView = (CardView)findViewById(R.id.card_view_cash);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent i = new Intent(Face_won.this,ARActivity.class);
                   startActivity(i);
            }
        });

        CardView cardView1;

        cardView1 = (CardView)findViewById(R.id.card_view4);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Face_won.this,Translator.class);
                startActivity(i);
            }
        });

        CardView cardView2;

        cardView2 = (CardView)findViewById(R.id.card_view3);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Face_won.this,ScrollingActivity.class);
                startActivity(i);
            }
        });


    }

}
