package namtechcom.hackathon_project.face;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import namtechcom.hackathon_project.R;

public class No_Internet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no__internet);
        Button net = (Button)findViewById(R.id.btn_try);
        net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isconnected();
            }
        });
    }

    public void isconnected() {
        ConnectionDetector cd = new ConnectionDetector(this);

        if(cd.isConnected()){
            startActivity(new Intent(this,frist.class));
        }else {
            Toast.makeText(No_Internet.this, "NOT NET", Toast.LENGTH_LONG).show();
        }

    }
}
