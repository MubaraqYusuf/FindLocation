package com.example.findlocation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class CheckConnection extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(ConnectivityManager.EXTRA_NO_CONNECTIVITY.equals(intent.getAction())){
            boolean noInternet = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,true);

            if (noInternet){
                Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show();
                return;
            }else
                Toast.makeText(context, "Internet Connected", Toast.LENGTH_SHORT).show();
        }

    }
}
