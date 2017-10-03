package cn.fayne.project.sendargs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnStartAty).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStartAty:
                Intent i = new Intent(MainActivity.this, TheAty.class);
//                i.putExtra("data", "Hello jike");
                Bundle b = new Bundle();
                b.putString("name", "jinhao");
                b.putInt("age", 20);
                b.putString("test", "fan");
//                i.putExtras(b);
                i.putExtra("data", b);
                startActivity(i);
                break;
        }
    }
}
