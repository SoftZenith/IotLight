package mx.edu.ittepic.iotlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ToggleButton btnSala, btnComedor, btnRec1, btnRec2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSala = (ToggleButton)findViewById(R.id.btnSala);
        btnComedor = (ToggleButton) findViewById(R.id.btnSala);
        btnRec1 = (ToggleButton) findViewById(R.id.btnRec1);
        btnRec2 = (ToggleButton) findViewById(R.id.btnRec2);

        btnSala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnSala.isChecked()) {
                    Toast.makeText(MainActivity.this, "Foco prendido", Toast.LENGTH_SHORT).show();
                    URL url = null;
                    try {
                        url = new URL("http://192.168.1.67/Led1On");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    new ConnectTask().execute(url);
                }else{
                    Toast.makeText(MainActivity.this, "Foco apagado", Toast.LENGTH_SHORT).show();
                    URL url = null;
                    try {
                        url = new URL("http://192.168.1.67/Led1Of");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    new ConnectTask().execute(url);
                }
            }
        });
    }
}
