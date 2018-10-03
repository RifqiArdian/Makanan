package com.rifqiardian.makanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pesanan extends AppCompatActivity {
    int Jml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        TextView Jumlah = findViewById(R.id.Jumlah);
        Button btnSelesai = findViewById(R.id.btnSelesai);
        Bundle bundle = getIntent().getExtras();
        int Jml = bundle.getInt("totalHarga",0);

        Jumlah.setText(String.valueOf(Jml));
        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pesanan.this,Thanks.class);
                startActivity(i);
            }
        });
    }
}
