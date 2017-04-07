package com.example.kvana.registration;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etName;
    EditText etEmail;
    EditText etPass;
    RadioButton r1;
    RadioButton r2;
    RadioGroup rg;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       b = (Button) findViewById(R.id.btn_signup);
        etName = (EditText) findViewById(R.id.input_name);
        etEmail = (EditText) findViewById(R.id.input_email);
        etPass = (EditText) findViewById(R.id.input_password);

        r1 = (RadioButton) findViewById(R.id.Male);
        r2 = (RadioButton) findViewById(R.id.Female);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String gender = "";
        if (r1.isChecked()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String epass = etPass.getText().toString();
        Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();
        Log.d("AA","Hai");
        System.out.println("Name: " + name + "\n email: " + email + "\n password: " + epass);
    }

    /*public void process(View v) {
         Intent = null;
       // chooser = null;
        (v.getId() == R.id.btn_sendmail) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mail to"));
            String[] to = {"sureganesh380@gmail.com", "sureganeshreddy.kvana@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hai this is kvana");
            intent.putExtra(Intent.EXTRA_TEXT, "Hai this is gyg;sdhglw;fwevjbwlv;eic");
            intent.setType("message/rtc822");
            chooser=Intent.createChooser(intent,"send email");
            startActivity(chooser); }
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Implict Intent Document");
        intent.putExtra(Intent.EXTRA_TEXT, "ACTION_SENDTO (for no attachment) or\n" +
                "ACTION_SEND (for one attachment) or\n" +
                "ACTION_SEND_MULTIPLE (for multiple attachments)");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }*/

}

