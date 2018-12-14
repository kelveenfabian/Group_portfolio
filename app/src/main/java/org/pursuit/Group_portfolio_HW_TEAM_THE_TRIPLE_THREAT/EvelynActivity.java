package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class EvelynActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evelyn);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = getString(R.string.evelyn_email);
                Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse(email));
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(EvelynActivity.this, R.string.fab_error_message, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.evelyn_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.madlibs_app:
                String url1 = getString(R.string.evelyn_url_one);
                openWebPage(url1);
                return true;
            case R.id.text_based_app:
                String url2 = getString(R.string.evelyn_url_two);
                openWebPage(url2);
                return true;
            case R.id.java_bank_app:
                String url3 = getString(R.string.evelyn_url_three);
                openWebPage(url3);
                return true;
                default:
        }
        return super.onOptionsItemSelected(item);
    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.noweb_toast_text, Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}
