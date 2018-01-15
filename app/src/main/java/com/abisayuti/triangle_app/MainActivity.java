package com.abisayuti.triangle_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etalas, ettinggi;
    Button btnHitungSegitiga;
    TextView txtHasilsegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettinggi = (EditText)findViewById(R.id.etPanjangSegitiga);
        etalas = (EditText)findViewById(R.id.etLebarSegitiga);
        btnHitungSegitiga = (Button) findViewById(R.id.btnHitungSegitiga);
        txtHasilsegitiga = (TextView) findViewById(R.id.txthasilsegitiga);

        btnHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ntinggi = ettinggi.getText().toString();
                String nalas = etalas.getText().toString();

                if(ntinggi.isEmpty()){
                    //memberikan Warning berupa error
                    ettinggi.setError("tinggi tidak boleh kosong");
                }else if(nalas.isEmpty()) {
                    //memberikan Warning berupa else{
                    //mengubah nilai dari String ke integer terlebih dahulu
                    etalas.setError("alas tidak boleh kosong");
                }else{
                    int atinggi = Integer.parseInt(ntinggi);
                    int aalas = Integer.parseInt(nalas);


                    int hasilHitungLuas = aalas * atinggi / 2;

                    txtHasilsegitiga.setText(" Luas segitiga = " + hasilHitungLuas );
                }

            }
        });
    }
}
