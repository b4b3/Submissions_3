package online.b4b3.submissions3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        BlankFragment mHomeFragment = new BlankFragment();
        Fragment fragment = mFragmentManager.findFragmentByTag(BlankFragment.class.getSimpleName());
        if (!(fragment instanceof BlankFragment)) {
            mFragmentTransaction.add(R.id.frame_container, mHomeFragment, BlankFragment.class.getSimpleName());
            Log.d("MyFlexibleFragment", "Fragment Name :" + BlankFragment.class.getSimpleName());
            mFragmentTransaction.commit();
        }
    }
}
