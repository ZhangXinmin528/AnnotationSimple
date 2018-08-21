package com.zxm.annotationsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zxm.libannotation.BindView;


public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.tv_test)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView.setText("演示运行时注解！");
    }
}
