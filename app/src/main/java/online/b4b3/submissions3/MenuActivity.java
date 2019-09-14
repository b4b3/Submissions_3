package online.b4b3.submissions3;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveActivity, btnFragment, btnUtama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnMoveActivity = findViewById(R.id.btActivity);
        btnMoveActivity.setOnClickListener(this);

        btnFragment = findViewById(R.id.btFragmentMovie);
        btnFragment.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btActivity:
                Intent moveIntent = new Intent(MenuActivity.this, Main2Activity.class);
                startActivity(moveIntent);
                break;

            case R.id.btFragmentMovie:

                Intent fragmenItent = new Intent(MenuActivity.this, FragmentActivity.class );
                startActivity(fragmenItent);
                break;
        }
    }
}
