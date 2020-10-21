package ry.example.day;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void getText(View view){
        Intent intent = new Intent(this, MainActivity4.class);

        startActivity(intent);
    }
    public void getPicture(View view){
        Intent intent = new Intent(this, MainActivity3.class);

        startActivity(intent);
    }
}