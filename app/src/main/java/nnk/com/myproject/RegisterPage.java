package nnk.com.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterPage extends AppCompatActivity {
    Button register;
    EditText name, phoneNo, cPassword, rePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        register = findViewById(R.id.register);
        name = findViewById(R.id.et1);
        phoneNo = findViewById(R.id.et2);
        cPassword = findViewById(R.id.et3);
        rePassword = findViewById(R.id.et4);
    }

    public void gotoLoginPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void gotoOfferPage(View view) {
        String user = name.getText().toString().trim();
        String no = phoneNo.getText().toString().trim();
        String cPass = name.getText().toString().trim();
        String rePass = phoneNo.getText().toString().trim();

        if (user.isEmpty()) {
            name.setError("please fill");
            name.requestFocus();
        } else if (no.isEmpty()) {
            phoneNo.setError("please fill");
            phoneNo.requestFocus();
        } else if (cPass.isEmpty()) {
            cPassword.setError("please fill");
            cPassword.requestFocus();
        } else if (rePass.isEmpty()) {
            rePassword.setError("please fill");
            rePassword.requestFocus();
        }
        else {
            Intent intent = new Intent(this, OffersActivity.class);
            startActivity(intent);
        }
    }
}
