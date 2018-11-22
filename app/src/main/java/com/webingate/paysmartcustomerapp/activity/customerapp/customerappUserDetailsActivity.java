package com.webingate.paysmartcustomerapp.activity.customerapp;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.webingate.paysmartcustomerapp.R;
import com.webingate.paysmartcustomerapp.fragment.customerAppFragments.customerappUserInfoFragment;
import com.webingate.paysmartcustomerapp.utils.Utils;

public class customerappUserDetailsActivity extends AppCompatActivity {



//ImageView profileImageView;
    private int position = 1;
    private int maxPosition = 2;
    private Button nextButton, prevButton;
    private TextView imageNoTextView;

//    EditText email;
//    EditText name;
//    EditText address;
//    EditText city;
//    EditText mno;
//    EditText postal;
//    EditText state;

    customerappUserInfoFragment userInfoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customerapp_userdetails_activity);

        initData();

        initUI();

        initActions();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    //endregion

    //region Init Functions
    private void initData() {

    }

    private void initUI() {
        initToolbar();
        nextButton = findViewById(R.id.nextButton);
        prevButton = findViewById(R.id.prevButton);
        imageNoTextView = findViewById(R.id.imageNoTextView);

        findViewById(R.id.nextButton);


        updatePositionTextView();
        setupFragment(new customerappUserInfoFragment());
    }

    private void updatePositionTextView() {
        imageNoTextView.setText(position + " of " + maxPosition);
    }

    private void setupFragment(Fragment fragment) {
        try {
            this.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contentLayout, fragment)
                    .commitAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initActions() {

        nextButton.setOnClickListener(v -> {

            if (position < maxPosition) {
                position++;



                updatePositionTextView();
                if(position == 1) {
                    Toast.makeText(this, "Step 1.", Toast.LENGTH_SHORT).show();
                    userInfoFragment =      new customerappUserInfoFragment();

                    setupFragment(userInfoFragment);

                }
                if(position == 2)
                {
                    //EditText name = (EditText)findViewById(R.id.s_name);
//                    name = findViewById(R.id.s_name);
//                    email = findViewById(R.id.s_email);
//                    mno = findViewById(R.id.s_mobileno);
//                    address = findViewById(R.id.s_address);
//                    city = findViewById(R.id.s_city);
//                    postal = findViewById(R.id.s_postal);
//                    state = findViewById(R.id.s_state);
//                    profileImageView = findViewById(R.id.profileImageView);

//                    JsonObject object = new JsonObject();
//                    object.addProperty("flag", "U");
//                    object.addProperty("Firstname",name.getText().toString());
//                    //object.addProperty("lastname","kumar");
//                    object.addProperty("AuthTypeId", "");
//                    object.addProperty("Password", "123");
//                    object.addProperty("Mobilenumber",mno.getText().toString());
//                    object.addProperty("Email",email.getText().toString());
//                    object.addProperty("CountryId","101");
//                    object.addProperty("VehicleGroupId","");
//                    object.addProperty("UserAccountNo","11091"+mno.getText().toString());
//                    object.addProperty("usertypeid","110");
//                    object.addProperty("isDriverOwned","0");
//                    object.addProperty("DPhoto","");
//                    object.addProperty("Address",address.getText().toString());
//                    object.addProperty("Gender","44");
                    //RegisterDriver(object);

                    Toast.makeText(this, "Step 2.", Toast.LENGTH_SHORT).show();
                    //setupFragment(new businessAppDriverDocsFragment());
                }
            } else {
                Toast.makeText(this, "No More Step.", Toast.LENGTH_SHORT).show();
            }
        });

        prevButton.setOnClickListener(v -> {

            if (position > 1) {
                position--;

                updatePositionTextView();
                if(position == 1) {
                    Toast.makeText(this, "Step 1.", Toast.LENGTH_SHORT).show();
                    setupFragment(new customerappUserInfoFragment());
                }
                if(position == 2)
                {
                    Toast.makeText(this, "Step 2.", Toast.LENGTH_SHORT).show();
                   // setupFragment(new businessAppDriverDocsFragment());
                }
            } else {
                Toast.makeText(this, "No More Step.", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initToolbar() {

        Toolbar toolbar = findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.drawable.baseline_menu_black_24);

        if(toolbar.getNavigationIcon() != null) {
            toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.md_white_1000), PorterDuff.Mode.SRC_ATOP);
        }

        toolbar.setTitle("User Details");

        try {
            toolbar.setTitleTextColor(getResources().getColor(R.color.md_white_1000));
        }catch (Exception e){
            Log.e("TEAMPS","Can't set color.");
        }

        try {
            setSupportActionBar(toolbar);
        }catch (Exception e) {
            Log.e("TEAMPS","Error in set support action bar.");
        }

        try {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }catch (Exception e) {
            Log.e("TEAMPS","Error in set display home as up enabled.");
        }

    }
    //endregion
}
