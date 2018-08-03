package namtechcom.hackathon_project.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import namtechcom.hackathon_project.R;

public class ForgetPassWord extends AppCompatActivity {

    EditText _emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass_word);

        _emailText = (EditText) findViewById(R.id.passemail);

        Button backpass = (Button) findViewById(R.id.btn_backpass);
        backpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ForgetPassWord.this ,register.class);
                startActivity(i);            }
        });

    }
}
