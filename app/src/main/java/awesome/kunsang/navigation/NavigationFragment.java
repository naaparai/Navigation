package awesome.kunsang.navigation;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationFragment extends Fragment {

    public static final String preFile="textFile";
    ActionBarDrawerToggle mDrawerToggle;
    DrawerLayout mDrawerLayout;
    boolean mUserLearnedDrawer;
    boolean mFromSavedInstance;
    public NavigationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation, container, false);
    }


    public void setup(DrawerLayout drawer,Toolbar toolbar) {
        mDrawerLayout=drawer;
        mDrawerToggle=new ActionBarDrawerToggle(getActivity(),drawer,toolbar,R.string.material_drawer_open,R.string.material_drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

    }

    public static void savedInstances(Context context,String preferenceName,String preferenceValue){
        SharedPreferences sharePreference=context.getSharedPreferences(preFile,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharePreference.edit();
        editor.putString(preferenceName,preferenceValue);
        editor.apply();
    }

    public static String readFromPreferences(Context context,String preferenceName,String defaultValue){
        SharedPreferences sharePreference=context.getSharedPreferences(preFile,Context.MODE_PRIVATE);
         return sharePreference.getString(preferenceName,defaultValue);

    }
}
