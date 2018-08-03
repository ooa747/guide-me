package namtechcom.hackathon_project.face;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import namtechcom.hackathon_project.R;
import namtechcom.hackathon_project.login.WelcomoActivity;

public class frist extends AppCompatActivity {

    public static final String MY_PREFS_NAME = "MyPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);



        Thread time = new Thread() {

            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    isconnected();
                }
            }
        };
        time.start();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public void isconnected() {
        ConnectionDetector cd = new ConnectionDetector(this);

        if (cd.isConnected()) {
            CurrentUser();

        } else {
            Intent i = new Intent(frist.this, No_Internet.class);
            startActivity(i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_frist, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public  void CurrentUser(){
        SharedPreferences sharedPreferences = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        final String pass = sharedPreferences.getString("KEY_USER","Not Available");


                if(pass.trim().equals("success")){
                    // Toast.makeText(MainActivity.this, response, Toast.LENGTH_LONG).show();
                    Intent i = new Intent(frist.this ,Face_won.class);
                    startActivity(i);
                }else{
                    // Toast.makeText(MainActivity.this,response,Toast.LENGTH_LONG).show();
                    Intent i = new Intent(frist.this ,WelcomoActivity.class);
                    startActivity(i);
                }

            }





}
