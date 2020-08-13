package com.hari.app.alarmapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println(">>>>>>>>>>>>RECIEVED");

        Intent showAlarm = new Intent(context,AlarmActivity.class);
        showAlarm.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(showAlarm);
    }
}
