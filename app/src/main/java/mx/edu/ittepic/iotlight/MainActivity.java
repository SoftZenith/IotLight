package mx.edu.ittepic.iotlight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    Button btnAcer;
    ImageView f1, f2, f3, f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSala = (ToggleButton)findViewById(R.id.btnSala);
        btnComedor = (ToggleButton) findViewById(R.id.btnComedor);
        btnRec1 = (ToggleButton) findViewById(R.id.btnRec1);
        btnRec2 = (ToggleButton) findViewById(R.id.btnRec2);
        btnAcer = (Button) findViewById(R.id.btnAcerca);
        f1 = (ImageView) findViewById(R.id.f1);
        f2 = (ImageView) findViewById(R.id.f2);
        f3 = (ImageView) findViewById(R.id.f3);
        f4 = (ImageView) findViewById(R.id.f4);


        btnComedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnComedor.isChecked()) {
                    Toast.makeText(MainActivity.this, "Foco Encendido", Toast.LENGTH_SHORT).show();
                    f1.setImageResource(R.drawable.fe);
                    URL url = null;
                    try {
                        url = new URL("http://192.168.1.67/Led1On");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    new ConnectTask().execute(url);
                }else{
                    Toast.makeText(MainActivity.this, "Foco Apagado", Toast.LENGTH_SHORT).show();
                    f1.setImageResource(R.drawable.fa);
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

        btnSala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnSala.isChecked()) {
                    Toast.makeText(MainActivity.this, "Foco Encendido", Toast.LENGTH_SHORT).show();
                    f2.setImageResource(R.drawable.fe);
                    URL url = null;
                    try {
                        url = new URL("http://192.168.1.67/Led1On");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    new ConnectTask().execute(url);
                }else{
                    Toast.makeText(MainActivity.this, "Foco Apagado", Toast.LENGTH_SHORT).show();
                    f2.setImageResource(R.drawable.fa);
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

        btnRec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnRec1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Foco Encendido", Toast.LENGTH_SHORT).show();
                    f3.setImageResource(R.drawable.fe);
                    URL url = null;
                    try {
                        url = new URL("http://192.168.1.67/Led1On");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    new ConnectTask().execute(url);
                }else{
                    Toast.makeText(MainActivity.this, "Foco Apagado", Toast.LENGTH_SHORT).show();
                    f3.setImageResource(R.drawable.fa);
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

        btnRec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnRec2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Foco Encendido", Toast.LENGTH_SHORT).show();
                    f4.setImageResource(R.drawable.fe);
                    URL url = null;
                    try {
                        url = new URL("http://192.168.1.67/Led1On");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    new ConnectTask().execute(url);
                }else{
                    Toast.makeText(MainActivity.this, "Foco Apagado", Toast.LENGTH_SHORT).show();
                    f4.setImageResource(R.drawable.fa);
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

        btnAcer.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            { Intent intent = new Intent(v.getContext(), about.class);
                startActivityForResult(intent, 0);
            }
        });


    }

    @Override
    public void onBackPressed() {
    }

}
