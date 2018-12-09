package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class JohnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john);
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


