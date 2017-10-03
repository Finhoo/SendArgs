package cn.fayne.project.sendargs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnStartAty).setOnClickListener(this);
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText("另一个Activity返回的数据是: "+data.getStringExtra("data"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStartAty:
                Intent i = new Intent(MainActivity.this, TheAty.class);
////                i.putExtra("data", "Hello jike");
//                Bundle b = new Bundle();
//                b.putString("name", "jinhao");
//                b.putInt("age", 20);
//                b.putString("test", "fan");
////                i.putExtras(b);
//                i.putExtra("data", b);

                i.putExtra("user", new User("jikexueyuan", 2));

//                startActivity(i);

                startActivityForResult(i, 0);
                break;
        }
    }
}
