package com.app.chendhurfinecorpclient.Activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.chendhurfinecorpclient.R;

import java.io.UnsupportedEncodingException;

public class Login extends AppCompatActivity {
EditText user,pass;
TextView forget;
ImageView loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        forget=(TextView) findViewById(R.id.forgot);
        loginbtn=(ImageView) findViewById(R.id.loginbutton);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent=new Intent(Login.this,Home.class);
            startActivity(intent);
            finish();

            }
        });
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Login.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
               // dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setContentView(R.layout.dialog_forgot);
                final EditText mobileno = dialog.findViewById(R.id.mobno);
                final EditText opt = dialog.findViewById(R.id.confirmotp_code);
                Button cancelbtn = dialog.findViewById(R.id.btn_cancel);
                final Button otpbtn = dialog.findViewById(R.id.btn_otp);
                final Button confirmbtn = dialog.findViewById(R.id.btn_confirm_otp);
                otpbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mobileno.setVisibility(View.GONE);
                        opt.setVisibility(View.VISIBLE);
                        otpbtn.setVisibility(View.GONE);
                        confirmbtn.setVisibility(View.VISIBLE);
                       String mobno = mobileno.getText().toString().trim();
                    }
                });
                confirmbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String otp = opt.getText().toString().trim();
                    }
                });
                cancelbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                //dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                Window window = dialog.getWindow();
                WindowManager.LayoutParams wlp = window.getAttributes();
                wlp.gravity = Gravity.CENTER;
               // wlp.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
                window.setAttributes(wlp);
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(false);
                if (!dialog.isShowing()) {
                    dialog.show();
                }
            }
        });

    }
}
