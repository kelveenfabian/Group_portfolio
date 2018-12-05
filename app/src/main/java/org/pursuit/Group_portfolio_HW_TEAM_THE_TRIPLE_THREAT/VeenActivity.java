package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class VeenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veen);

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
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(tbWebAddress)));
                return true;
            case R.id.storyApp:
                String saWebAddress = getString(R.string.veen_url_two);
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(saWebAddress)));
                return true;
            case R.id.bankteller:
                String btWebAddress = getString(R.string.veen_url_three);
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(btWebAddress)));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
