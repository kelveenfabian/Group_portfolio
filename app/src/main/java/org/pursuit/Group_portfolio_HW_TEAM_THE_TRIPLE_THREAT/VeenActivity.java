package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class VeenActivity extends AppCompatActivity {
    MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veen);
        song = MediaPlayer.create(this, R.raw.sleepwalk);
        song.start();

        FloatingActionButton fab = findViewById(R.id.veen_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = getString(R.string.veen_email);
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(mail));
                try {
                    startActivity(Intent.createChooser(intent, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(VeenActivity.this, R.string.fab_error_message, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        song.release();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.veen_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.textBased:
                String tbWebAddress = getString(R.string.veen_url_one);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tbWebAddress));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), R.string.noweb_toast_text, Toast.LENGTH_SHORT).show();
                }
                return true;

            case R.id.storyApp:
                String saWebAddress = getString(R.string.veen_url_two);
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(saWebAddress));
                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                } else {
                    Toast.makeText(getApplicationContext(), R.string.noweb_toast_text, Toast.LENGTH_SHORT).show();
                }
                return true;

            case R.id.bankteller:
                String btWebAddress = getString(R.string.veen_url_three);
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(btWebAddress));
                if (intent2.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                } else {
                    Toast.makeText(getApplicationContext(), R.string.noweb_toast_text, Toast.LENGTH_SHORT).show();
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
