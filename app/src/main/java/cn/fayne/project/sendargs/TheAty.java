package cn.fayne.project.sendargs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TheAty extends AppCompatActivity {

    private TextView tv;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_aty);
        Intent i = getIntent();
        tv = (TextView) findViewById(R.id.tv);
        editText = (EditText) findViewById(R.id.editText);

//        Bundle data = i.getExtras();
//        Bundle data = i.getBundleExtra("data");
//        tv.setText(i.getStringExtra("data"));
//        tv.setText(String.format("name = %s, age = %d, test = %s", data.getString("name"), data.getInt("age"), data.getString("test", "not")));

//        User user = (User) i.getSerializableExtra("user");

        User user = i.getParcelableExtra("user");

        tv.setText(String.format("User info(name = %s, age = %d)", user.getName(), user.getAge()));
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("data", editText.getText().toString());
                setResult(1, i);
                finish();
            }
        });
    }
}
