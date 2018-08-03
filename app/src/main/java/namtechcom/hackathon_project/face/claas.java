package namtechcom.hackathon_project.face;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import namtechcom.hackathon_project.R;
import namtechcom.hackathon_project.login.register;

public class claas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claas);

        CardView cardView;

        cardView = (CardView)findViewById(R.id.card_view1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent i = new Intent(claas.this,register.class);
                   i.putExtra("CV","PN");
                   startActivity(i);
            }
        });

        CardView cardView1;

        cardView1 = (CardView)findViewById(R.id.card_view2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(claas.this,register.class);
                i.putExtra("CL","LD");
                startActivity(i);
            }
        });

    }

}
