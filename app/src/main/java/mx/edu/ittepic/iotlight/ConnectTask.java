package mx.edu.ittepic.iotlight;

import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by Bryan on 05/05/2017.
 */

    public class ConnectTask extends AsyncTask<URL, Void, Void> {


    @Override
    protected Void doInBackground(URL... urls) {
        HttpURLConnection conn = null;
        int edo = 0;

        try {
            conn = (HttpURLConnection) urls[0].openConnection();
            conn.setConnectTimeout(500);
            conn.setReadTimeout(100);
            conn.connect();

            //Obtener status de la conexion
            edo = conn.getResponseCode();

            if (edo != 200){
                return null;
            }else{
                return null;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(conn != null)
                conn.disconnect();
        }

        return null;
    }
}
