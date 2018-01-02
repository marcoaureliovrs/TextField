package br.com.marcogorak.textfield;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private AppCompatEditText editTextEmail;
    private AppCompatEditText editTextPassowd;

    private TextInputLayout textLayoutEmail;
    private TextInputLayout textLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (AppCompatEditText)findViewById(R.id.edt_email);
        textLayoutEmail = (TextInputLayout)findViewById(R.id.txtlayout_email);

        editTextPassowd = (AppCompatEditText)findViewById(R.id.edt_password);
        textLayoutPassword = (TextInputLayout)findViewById(R.id.txtlayout_password);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateForm();
            }
        });

    }

    private void validateForm() {
        if(editTextEmail.getText().toString().isEmpty()) {
            textLayoutEmail.setErrorEnabled(true);
            textLayoutEmail.setError(getString(R.string.lbl_empty_email));
        } else {
            textLayoutEmail.setErrorEnabled(false);
        }


        if(editTextPassowd.getText().toString().isEmpty()) {
            textLayoutPassword.setErrorEnabled(true);
            textLayoutPassword.setError(getString(R.string.lbl_empty_password));
        } else {
            textLayoutPassword.setErrorEnabled(false);
        }


    }
}
