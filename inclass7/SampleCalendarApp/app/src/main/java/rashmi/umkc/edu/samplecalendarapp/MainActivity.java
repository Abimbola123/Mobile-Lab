package rashmi.umkc.edu.samplecalendarapp;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.displaycalendareventintent.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button disp = (Button) findViewById(R.id.dispbut);
        disp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                public void onSelectedDayChange(int year, int month, int dayOfMonth) {
                    String date = year + "/" + month + "/"+ dayOfMonth ;
                    Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:" + date);
                    Intent intent = new Intent(.this,MainActivity.class);
                    intent.putExtra("date",date);
                    startActivity(intent);

                }
        });
    }

    public void disp() {
        Calendar startTime = Calendar.getInstance();
        startTime.set(2013, 2, 13, 11, 35);
        Uri uri = Uri.parse("content://com.android.calendar/time/"
                + String.valueOf(startTime.getTimeInMillis()));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        // Use the Calendar app to view the time.
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}