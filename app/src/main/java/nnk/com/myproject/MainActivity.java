package nnk.com.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username, password;
    ImageView imageView;
    TextView textView;
    SqliteHelper sqliteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqliteHelper=new SqliteHelper(this);
//        setContentView(R.layout.splash);
        imageView=findViewById(R.id.image);
        textView=findViewById(R.id.text);
//        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransision);
//        imageView.startAnimation(myanim);
//        textView.startAnimation(myanim);
        login = findViewById(R.id.log);
        username = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        Intent intent = getIntent();

    }

    public void gotoRegisterPage(View view) {
        Intent intent;
        intent = new Intent(this, RegisterPage.class);
        startActivity(intent);
    }

    public void gotoOfferspage(View view) {
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if (user.isEmpty()) {
            username.setError("please fill");
            username.requestFocus();
        } else if (pass.isEmpty()) {
            password.setError("please fill");
            password.requestFocus();
        } else if (user.equals("Nani") && (pass.equals("99499"))) {
            Intent i = new Intent(this, OffersActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }

}

