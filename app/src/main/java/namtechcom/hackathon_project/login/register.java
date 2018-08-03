package namtechcom.hackathon_project.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import namtechcom.hackathon_project.R;
import namtechcom.hackathon_project.face.Face_won;
import namtechcom.hackathon_project.face.frist;

public class register extends AppCompatActivity {

     public static final String MY_PREFS_NAME = "MyPrefsFile";
    private static final int REQUEST_SIGNUP = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        Button _loginButton   =(Button)   findViewById(R.id.btn_longin);
        TextView _signupLink  =(TextView) findViewById(R.id.link_signup);
        TextView _passforget  =(TextView) findViewById(R.id.forgetpass);


        _loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openProfile();
                Intent i = new Intent(register.this ,Face_won.class);
                startActivity(i);

             }
        });

        _signupLink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), SingUp.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });

        _passforget.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), ForgetPassWord.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });

    }

    private void openProfile(){
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putString("KEY_USER", "success");
        editor.commit();
    }


}
