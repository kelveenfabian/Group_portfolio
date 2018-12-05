package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class veenPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veen_activity);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.github_links_veen, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId  = item.getItemId();

        switch(itemId){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            case R.id.textBased:
                String tbWebAddress = "https://github.com/kelveenfabian/Text-Based-Game";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(tbWebAddress)));
                return true;
            case R.id.storyApp:
                String saWebAddress = "https://github.com/kelveenfabian/Story-App";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(saWebAddress)));
                return true;
            case R.id.bankteller:
                String btWebAddress = "https://github.com/kelveenfabian/Bank_Teller_App";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(btWebAddress)));
                return true;
        }
        return true;
    }
}
