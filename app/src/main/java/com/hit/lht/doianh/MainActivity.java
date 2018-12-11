package com.hit.lht.doianh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDoiAnh;
    ImageView img1, img2, img3;
    EditText txtNoiDung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDoiAnh = findViewById(R.id.btnDoiAnh);
        img1 = findViewById(R.id.home1);
        img2 = findViewById(R.id.home2);
        img3 = findViewById(R.id.home3);
        txtNoiDung = findViewById(R.id.editText);
        DoiAnh();
    }

    void DoiAnh() {
        btnDoiAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNoiDung1 = txtNoiDung.getText().toString();
                if (txtNoiDung1.equals("1")) {
                    img1.setImageResource(R.drawable.love2);
                    Toast.makeText(MainActivity.this, "Ảnh 1 đã được thay đổi", Toast.LENGTH_SHORT).show();
                } else if (txtNoiDung1.equals("2")) {
                    img2.setImageResource(R.drawable.love3);
                    Toast.makeText(MainActivity.this, "Ảnh 2 đã được thay đổi", Toast.LENGTH_SHORT).show();
                } else if (txtNoiDung1.equals("3")) {
                    img3.setImageResource(R.drawable.love4);
                    Toast.makeText(MainActivity.this, "Ảnh 3 đã được thay đổi", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Số nhập không hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}