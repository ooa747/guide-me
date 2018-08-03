package namtechcom.hackathon_project.login;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import namtechcom.hackathon_project.R;

public class SingUp_JA extends AppCompatActivity {

   // private FirebaseAuth mAuth ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up__j);

       // mAuth = FirebaseAuth.getInstance();

        signInAnonymously();


    }

      void signInAnonymously()
    {
        /*
        mAuth.signInAnonymously()
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("","singInAnonymously:onComplete:"+task.isSuccessful());

                        if (!task.isSuccessful()){
                            Log.w("" ,"signInAnonymously", task.getException());
                            Toast.makeText(SingUp_JA.this,"Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                });
                */
    }

}
