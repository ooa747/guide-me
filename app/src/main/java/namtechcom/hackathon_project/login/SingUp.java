package namtechcom.hackathon_project.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;

import namtechcom.hackathon_project.R;

public class SingUp extends AppCompatActivity {

    EditText _nameText;
    EditText _emailText;
    EditText _passwordText;
    EditText _numphoneText;
    Button _signupButton;
    TextView _loginLink;
    String formattedDate;
    private FirebaseAuth auth;


    public static final String MY_PREFS_NAME = "MyPrefsFile";

    private FirebaseAuth mAuth ;
    GoogleApiClient mGoogleApiClient ;
    private static final int RC_SIGN_IN = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);




        _loginLink    = (TextView) findViewById(R.id.link_login);
        _signupButton   =(Button)   findViewById(R.id.btn_signup);
        _nameText     = (EditText) findViewById(R.id.input_name);
        _emailText    = (EditText) findViewById(R.id.input_email);
        _numphoneText = (EditText) findViewById(R.id.input_numphone);
        _passwordText = (EditText) findViewById(R.id.input_password);

        _signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        _loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the registration screen and return to the Login activity
              //  Intent i = new Intent(SingUp.this ,register.class);
              //  startActivity(i);
                // DatabaseRefrence refrence = FirebaseDatabase.getInstance().getReference("Database").child("Users").setValue("1");
            }
        });
    }

    public void signup() {

        final ProgressDialog progressDialog = new ProgressDialog(SingUp.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating Account...");
        progressDialog.show();



        // TODO: Implement your own signup logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        Intent i = new Intent(SingUp.this ,register.class);
                        openProfile();
                        startActivity(i);
                        progressDialog.dismiss();
                    }
                }, 3000);
    }

    public void onSignupSuccess() {
        //SignUp Code Placed Here
        _signupButton.setEnabled(true);
        setResult(RESULT_OK, null);

    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();

        _signupButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String email    = _emailText.getText().toString();
        String password = _passwordText.getText().toString();
        String numphone = _numphoneText.getText().toString();
        String numclass     = _nameText.getText().toString();



        if (numclass.isEmpty() || numclass.length() < 3) {
            _nameText.setError("at least 3 characters");
            valid = false;
        } else {
            _nameText.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _emailText.setError("enter a valid email address");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            _passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        if (numphone.isEmpty() || numphone.length() < 10 || numphone.length() > 12) {
            _numphoneText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _numphoneText.setError(null);
        }

        return valid;
    }

    public void signupUser() {

        String email    = _emailText.getText().toString();
        String numphone =_numphoneText.getText().toString();
        String password =_passwordText.getText().toString();
        String numclass =_nameText.getText().toString();


        /*
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful()){
                             Toast.makeText(SingUp.this,"تم التسجيل.",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else {
                           // Log.e("",task.getException().getMessage());
                            Toast.makeText(SingUp.this,"فشل التسجيل.",
                                    Toast.LENGTH_SHORT).show();

                        }

                    }
                });*/


    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }


    private void openProfile(){
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putString("KEY_USER", "success");
         editor.commit();
    }



}
