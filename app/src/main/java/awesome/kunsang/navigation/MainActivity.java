package awesome.kunsang.navigation;

import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String notificationLable = "blah blah";
        getSupportActionBar().setTitle(notificationLable);
        NavigationFragment drawer= (NavigationFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        drawer.setup((DrawerLayout) findViewById(R.id.drawer),toolbar);
        /*
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withName("Home").withIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon_home));
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withName("Home").withIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon_home));
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withName("Home").withIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon_home));
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withName("Home").withIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon_home));
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .addProfiles(
                        new ProfileDrawerItem().withName("Mike Penz")
                )
                .withSelectionListEnabledForSingleProfile(false)
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        Drawer result= new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withActionBarDrawerToggleAnimated(true)
                .addDrawerItems(item1,item2,item3,item4)
                .build();

        result.openDrawer();
        result.closeDrawer();

//get the reference to the `DrawerLayout` itself
        result.getDrawerLayout();*/
    }
}
