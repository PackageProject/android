package kr.ac.duksung.bottommenu2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FrameLayout container;


    //fragment 변수선언
    main_menu_fragment menu_fragment;
    main_account_fragment account_fragment;
    main_community_fragment community_fragment;
    main_favorite_fragment favorite_fragment;

    //버튼 변수
    FloatingActionButton button;

    
    //카테고리 버튼



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //객체 생성
        menu_fragment = new main_menu_fragment();
        account_fragment = new main_account_fragment();
        favorite_fragment = new main_favorite_fragment();
        community_fragment = new main_community_fragment();
        
        bottomNavigationView = findViewById(R.id.main_bottomNavigationView);
        container = findViewById(R.id.container);
        button = findViewById(R.id.button);
        //button.bringToFront();

        initTransactionEvent();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item)
             {
                 switch (item.getItemId()){
                     case R.id.item_menu:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container,menu_fragment).commit();
                         return true;
                     case R.id. item_2:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container, favorite_fragment).commit();
                     case R.id. item_4:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container, community_fragment).commit();
                     case R.id. item_5:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container, account_fragment).commit();




                 }



                 return false;
             }

         });


//가운데 QR인식 버튼 누르면, 큐알 인식창으로 넘어간다.
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                 startActivity(intent);
             }
         });
    }

    private void initTransactionEvent() {
        final FirstFragment firstFragment = new FirstFragment();
        final SecondFragment secondFragment = new SecondFragment();
        final ThirdFragment thirdFragment = new ThirdFragment();
        final FourthFragment fourthFragment = new FourthFragment();

        Button form_list_button1 = (Button) findViewById(R.id.form_list_1);
        Button form_list_button2 = (Button) findViewById(R.id.form_list_2);
        Button form_list_button3 = (Button) findViewById(R.id.form_list_3);
        Button form_list_button4 = (Button) findViewById(R.id.form_list_4);

        // FragmentManager 호출
        getSupportFragmentManager().beginTransaction().add(R.id.form_list_fv, firstFragment).commit();

        // Transaction 작업
        form_list_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.drawable.category_selected);
                form_list_button2.setBackgroundResource(R.color.transparent);
                form_list_button3.setBackgroundResource(R.color.transparent);
                form_list_button4.setBackgroundResource(R.color.transparent);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, firstFragment);
                transaction.commit();
            }
        });

        form_list_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.color.transparent);
                form_list_button2.setBackgroundResource(R.drawable.category_selected);
                form_list_button3.setBackgroundResource(R.color.transparent);
                form_list_button4.setBackgroundResource(R.color.transparent);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, secondFragment);
                transaction.commit();
            }
        });

        form_list_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.color.transparent);
                form_list_button2.setBackgroundResource(R.color.transparent);
                form_list_button3.setBackgroundResource(R.drawable.category_selected);
                form_list_button4.setBackgroundResource(R.color.transparent);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, thirdFragment);
                transaction.commit();
            }
        });

        form_list_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.color.transparent);
                form_list_button2.setBackgroundResource(R.color.transparent);
                form_list_button3.setBackgroundResource(R.color.transparent);
                form_list_button4.setBackgroundResource(R.drawable.category_selected);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, fourthFragment);
                transaction.commit();
            }
        });
    }




}