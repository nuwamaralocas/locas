package com.bonaparte.mum;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.annotation.RequiresApi;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Configuration conf=getResources().getConfiguration();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if(conf.orientation==Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.activity_main);
        }
        else{
           setContentView(R.layout.activity_main);

        }
        fragmentTransaction.commit();


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.loc,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.infor:
                Intent m=new Intent(this,info.class);
                startActivity(m);
                return true;
            case R.id.bit:
                Intent x=new Intent(this,course.class);
                startActivity(x);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
