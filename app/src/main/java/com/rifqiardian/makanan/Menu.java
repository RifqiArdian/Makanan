package com.rifqiardian.makanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Menu extends AppCompatActivity {
    int JumlahGeprek, JumlahBakar, JumlahGoreng, JumlahAir, JumlahTeh, JumlahKopi,totalHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final TextView TxtTotalHarga = findViewById(R.id.TxtTotalHarga);
        final TextView AyamGeprek = findViewById(R.id.jmlGeprek);
        final TextView AyamBakar = findViewById(R.id.jmlBakar);
        final TextView AyamGoreng = findViewById(R.id.jmlGoreng);
        final TextView Air = findViewById(R.id.jmlAir);
        final TextView Teh = findViewById(R.id.jmlTeh);
        final TextView Kopi = findViewById(R.id.jmlKopi);
        final Button plusGeprek = findViewById(R.id.plusGeprek);
        final Button minGeprek = findViewById(R.id.minGeprek);
        final Button plusBakar = findViewById(R.id.plusBakar);
        final Button minBakar = findViewById(R.id.minBakar);
        final Button plusGoreng = findViewById(R.id.plusGoreng);
        final Button minGoreng = findViewById(R.id.minGoreng);
        final Button plusAir = findViewById(R.id.plusAir);
        final Button minAir = findViewById(R.id.minAir);
        final Button plusTeh = findViewById(R.id.plusTeh);
        final Button minTeh= findViewById(R.id.minTeh);
        final Button plusKopi = findViewById(R.id.plusKopi);
        final Button minKopi = findViewById(R.id.minKopi);
        final Button btnPesan = findViewById(R.id.btnPesan);

        JumlahGeprek = Integer.valueOf(AyamGeprek.getText().toString());
        JumlahBakar = Integer.valueOf(AyamBakar.getText().toString());
        JumlahGoreng = Integer.valueOf(AyamGoreng.getText().toString());
        JumlahAir = Integer.valueOf(Air.getText().toString());
        JumlahTeh = Integer.valueOf(Teh.getText().toString());
        JumlahKopi = Integer.valueOf(Kopi.getText().toString());

        plusGeprek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=25000;
                JumlahGeprek+=1;
                AyamGeprek.setText(String.valueOf(JumlahGeprek));
                totalHarga += harga;
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        plusBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=20000;
                JumlahBakar+=1;
                AyamBakar.setText(String.valueOf(JumlahBakar));
                totalHarga = totalHarga+harga;
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        plusGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=15000;
                JumlahGoreng+=1;
                AyamGoreng.setText(String.valueOf(JumlahGoreng));
                totalHarga += harga;
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        plusAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=3000;
                JumlahAir+=1;
                Air.setText(String.valueOf(JumlahAir));
                totalHarga += harga;
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        plusTeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=5000;
                JumlahTeh+=1;
                Teh.setText(String.valueOf(JumlahTeh));
                totalHarga += harga;
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        plusKopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=7000;
                JumlahKopi+=1;
                Kopi.setText(String.valueOf(JumlahKopi));
                totalHarga += harga;
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        minGeprek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=-25000;
                if(JumlahGeprek>0){
                    JumlahGeprek-=1;
                    AyamGeprek.setText(String.valueOf(JumlahGeprek));
                    totalHarga += harga;
                }
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        minBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=-20000;
                if(JumlahBakar>0){
                    JumlahBakar-=1;
                    AyamBakar.setText(String.valueOf(JumlahBakar));
                    totalHarga += harga;
                }
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        minGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=-15000;
                if(JumlahGoreng>0){
                    JumlahGoreng-=1;
                    AyamGoreng.setText(String.valueOf(JumlahGoreng));
                    totalHarga += harga;
                }
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        minAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=-3000;
                if(JumlahAir>0){
                    JumlahAir-=1;
                    Air.setText(String.valueOf(JumlahAir));
                    totalHarga += harga;
                }
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        minTeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga=-5000;
                if(JumlahTeh>0){
                    JumlahTeh-=1;
                    Teh.setText(String.valueOf(JumlahTeh));
                    totalHarga += harga;
                }
                TxtTotalHarga.setText(""+totalHarga);
            }
        });

        minKopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga = -7000;
                if(JumlahKopi>0){
                    JumlahKopi-=1;
                    Kopi.setText(String.valueOf(JumlahKopi));
                    totalHarga += harga;
                }
                TxtTotalHarga.setText(""+totalHarga);
            }
        });
        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this,Pesanan.class);
                i.putExtra("totalHarga", TxtTotalHarga.getText().toString());
                startActivity(i);
            }
        });
    }

}
