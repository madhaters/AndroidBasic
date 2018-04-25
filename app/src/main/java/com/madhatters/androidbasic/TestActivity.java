package com.madhatters.androidbasic;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    private NotificationManager notificationManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_layout);
        final EditText editText=findViewById(R.id.etHello);
        findViewById(R.id.helo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText.getText().toString();
                if (TextUtils.isEmpty(text)){
                    Toast.makeText(TestActivity.this,"PLease say something..",Toast.LENGTH_SHORT).show();
                    return;
                }
                sendNotification(text);
            }
        });
    }

    private void sendNotification(String text) {
        notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Bitmap largeIcon= BitmapFactory.decodeResource(getResources(),R.drawable.valid_name);

        Intent intent=new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        PendingIntent pendingIntent=PendingIntent.getActivity(this,100,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.Builder notification=new Notification.Builder(this)
                .setSmallIcon(R.drawable.ic_today_black_24dp)
                .setContentTitle(text)
                .setLargeIcon(largeIcon)
                .setOngoing(true)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setContentText("Hellow world from notification");
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            notificationManager.createNotificationChannel(new NotificationChannel("Main","Main",
                    NotificationManager.IMPORTANCE_DEFAULT));

            notification.setChannelId("Main");
        }
        notificationManager.notify(1,notification.build());
    }
}
