package app.myappportfolio.com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage1(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage2(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage3(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage4(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make Your App Material app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage5(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go Ubiquitous app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage6(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
