package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoosePerson extends AppCompatActivity {
    private Button johnBtn;
    private Button veenBtn;
    private Button evelynBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_person);

        johnBtn = findViewById(R.id.btn_john);
        johnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), JohnActivity.class);
                startActivity(intent);
            }
        });
        
        veenBtn = findViewById(R.id.btn_kelveen);
        veenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), VeenActivity.class);
                startActivity(intent);
            }
        });

        evelynBtn = findViewById(R.id.btn_Evelyn);
        evelynBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoosePerson.this, EvelynActivity.class);
                startActivity(intent);
            }
        });
    }
}
