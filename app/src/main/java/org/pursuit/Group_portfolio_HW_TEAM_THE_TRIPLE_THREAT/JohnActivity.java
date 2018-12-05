package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class JohnActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imgView;
    private ScrollView scrollView;
    private Menu menu;
    private MenuItem gitOne;
    private MenuItem gitTwo;
    private MenuItem gitThree;
    private Spinner gitLinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john);
        textView = findViewById(R.id.bio_text);
        imgView = findViewById(R.id.john_img);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.john_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.git_one:
                gitJuan();
                break;
            case R.id.git_two:
                gitDos();
                break;
            case R.id.git_three:
                gitTres();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void gitJuan() {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_one)));
        startActivity(webIntent);
    }

    public void gitDos() {
        Intent webIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_two)));
        startActivity(webIntent2);
    }

    public void gitTres() {
        Intent webIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_three)));
        startActivity(webIntent3);
    }

}


