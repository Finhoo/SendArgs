package cn.fayne.project.sendargs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TheAty extends AppCompatActivity {

    private static TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_aty);
        Intent i = getIntent();
        tv = (TextView) findViewById(R.id.tv);
        tv.setText(i.getStringExtra("data"));
    }
}
