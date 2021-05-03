package com.example.praktikum;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SkorActivity extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namaTimA = findViewById(R.id.tv_Tim_A);
        TextView namaTimB = findViewById(R.id.tv_Tim_B);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namaTimA.setText("Poin Team" + " " + namaA);
        namaTimB.setText("Poin Team" + " " + namaB);
    }

    public void Tambah(View view) {
        if (view.getId() == R.id.btn_Plus_Satu_A) {
            skorA = skorA + 1;
        } else if (view.getId() == R.id.btn_Plus_Dua_A) {
            skorA = skorA + 2;
        } else if (view.getId() == R.id.btn_Plus_Tiga_A) {
            skorA = skorA + 3;
        } else if (view.getId() == R.id.btn_Plus_Satu_B) {
            skorB = skorB + 1;
        } else if (view.getId() == R.id.btn_Plus_Dua_B) {
            skorB = skorB + 2;
        } else if (view.getId() == R.id.btn_Plus_Tiga_B) {
            skorB = skorB + 3;
        }

        TextView skorTimA = findViewById(R.id.tv_Skor_Tim_A);
        TextView skorTimB = findViewById(R.id.tv_Skor_Tim_B);

        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));


    }

    public void reset_B(View view) {
        TextView skorTimB = findViewById(R.id.tv_Skor_Tim_B);
        skorB = 0;
        skorTimB.setText(String.valueOf(skorB));
    }

    public void reset_A(View view) {
        TextView skorTimA = findViewById(R.id.tv_Skor_Tim_A);
        skorA = 0;
        skorTimA.setText(String.valueOf(skorA));
    }
}