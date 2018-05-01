package com.madhatters.androidbasic;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import retrofit2.http.Url;

public class JsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_activitu);
        new JosnDownloaderTask().execute();
    }

    private class JosnDownloaderTask extends AsyncTask<Void,Void,String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            if (s!=null){

            }
        }

        @Override
        protected String doInBackground(Void... voids) {
            try{
                URL url=new URL("https://jsonplaceholder.typicode.com/posts/1");
                HttpURLConnection urlConnection= (HttpURLConnection) url.openConnection();
                InputStream inputStream=urlConnection.getInputStream();
                BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder br=new StringBuilder();
                String line;
                while ((line=reader.readLine())!=null){
                    br.append(line);
                }
                String json=br.toString();
                urlConnection.disconnect();
                br.delete(0,json.length());
                return json;

            }catch (IOException ex){
                ex.printStackTrace();
            }
            return null;
        }
    }

}
