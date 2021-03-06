package com.rifqiardian.makanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MenuMakanan extends AppCompatActivity {
    @BindView(R.id.jmlGeprek)
    TextView AyamGeprek;
    @BindView(R.id.jmlBakar)
    TextView AyamBakar;
    @BindView(R.id.jmlGoreng)
    TextView AyamGoreng;
    @BindView(R.id.jmlAir)
    TextView Air;
    @BindView(R.id.jmlTeh)
    TextView Teh;
    @BindView(R.id.jmlKopi)
    TextView Kopi;
    @BindView(R.id.TxtTotalHarga)
    TextView TxtTotalHarga;
    int JumlahGeprek, JumlahBakar, JumlahGoreng, JumlahAir, JumlahTeh, JumlahKopi,totalHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        totalHarga = 0;
        JumlahGeprek = 0;
        JumlahBakar = 0;
        JumlahGoreng = 0;
        JumlahAir = 0;
        JumlahTeh = 0;
        JumlahKopi = 0;

        registerForContextMenu(AyamGeprek);
        registerForContextMenu(AyamBakar);
        registerForContextMenu(AyamGoreng);
        registerForContextMenu(Teh);
        registerForContextMenu(Kopi);
        registerForContextMenu(Air);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,v.getId(),0,"1");
        menu.add(0,v.getId(),0,"2");
        menu.add(0,v.getId(),0,"3");
        menu.add(0,v.getId(),0,"4");
        menu.add(0,v.getId(),0,"5");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.jmlGeprek) {
            AyamGeprek.setText(item.getTitle().toString());
        } else if ((item.getItemId() == R.id.jmlBakar)) {
            AyamBakar.setText(item.getTitle().toString());

        }
        else if ((item.getItemId() == R.id.jmlGoreng)) {
            AyamGoreng.setText(item.getTitle().toString());

        }
        else if ((item.getItemId() == R.id.jmlKopi)) {
            Kopi.setText(item.getTitle().toString());

        }
        else if ((item.getItemId() == R.id.jmlTeh)) {
            Teh.setText(item.getTitle().toString());

        }
        else if ((item.getItemId() == R.id.jmlAir)) {
            Air.setText(item.getTitle().toString());

        }
        return true;
    }

    private int totalHarga(int harga){
        totalHarga = totalHarga+harga;
        return totalHarga;
    }

    private void setTextTotalHarga(int harga){
        TxtTotalHarga.setText(""+harga);
    }

    @OnClick(R.id.plusGeprek)
    public void plusGeprek(){
        int harga = 25000;
        JumlahGeprek +=1;
        AyamGeprek.setText(""+JumlahGeprek);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusBakar)
    public void plusBakar(){
        int harga = 20000;
        JumlahBakar +=1;
        AyamBakar.setText(""+JumlahBakar);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusGoreng)
    public void plusGoreng(){
        int harga = 15000;
        JumlahGoreng +=1;
        AyamGoreng.setText(""+JumlahGoreng);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusAir)
    public void plusAir(){
        int harga = 3000;
        JumlahAir +=1;
        Air.setText(""+JumlahAir);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusTeh)
    public void plusTeh(){
        int harga = 5000;
        JumlahTeh +=1;
        Teh.setText(""+JumlahTeh);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.plusKopi)
    public void plusKopi(){
        int harga = 7000;
        JumlahKopi +=1;
        Kopi.setText(""+JumlahKopi);
        setTextTotalHarga(totalHarga(harga));
    }

    @OnClick(R.id.minGeprek)
    public void minGeprek(){
        if(Integer.valueOf(AyamGeprek.getText().toString()) > 0){
            int harga = -25000;
            JumlahGeprek -=1;
            AyamGeprek.setText(""+JumlahGeprek);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minBakar)
    public void minBakar(){
        if(Integer.valueOf(AyamBakar.getText().toString()) > 0){
            int harga = -20000;
            JumlahBakar -=1;
            AyamBakar.setText(""+JumlahBakar);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minGoreng)
    public void minGoreng(){
        if(Integer.valueOf(AyamGoreng.getText().toString()) > 0){
            int harga = -15000;
            JumlahGoreng -= 1;
            AyamGoreng.setText(""+JumlahGoreng);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minAir)
    public void minAir(){
        if(Integer.valueOf(Air.getText().toString()) > 0){
            int harga = -3000;
            JumlahAir-=1;
            Air.setText(""+JumlahAir);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minTeh)
    public void minTeh(){
        if(Integer.valueOf(Teh.getText().toString()) > 0){
            int harga = -5000;
            JumlahTeh -= 1;
            Teh.setText(""+JumlahTeh);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.minKopi)
    public void minKopi(){
        if(Integer.valueOf(Kopi.getText().toString()) > 0){
            int harga = -7000;
            JumlahKopi -= 1;
            Kopi.setText(""+JumlahKopi);
            setTextTotalHarga(totalHarga(harga));
        }
        else{
            Toast.makeText(this, "Pesanan Tidak dapat Negatif", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.btnPesan)
    public void btnPesan(){
        Intent i = new Intent(getApplicationContext(), Pesanan.class);
        i.putExtra("totalHarga", TxtTotalHarga.getText().toString());
        startActivity(i);
    }
}
