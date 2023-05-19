package kr.ac.duksung.apackage;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MenuFragment extends Fragment {



    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_menu, container, false);

        Button form_list_button1 = (Button) rootView.findViewById(R.id.form_list_1);
        Button form_list_button2 = (Button) rootView.findViewById(R.id.form_list_2);
        Button form_list_button3 = (Button) rootView.findViewById(R.id.form_list_3);
        Button form_list_button4 = (Button) rootView.findViewById(R.id.form_list_4);




        form_list_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("button", ": 1 on Click 작동");
                Toast tMsg = Toast.makeText(rootView.getContext(),"버튼1",Toast.LENGTH_SHORT);
                tMsg.show();

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
                form_list_button1.setTextColor(ContextCompat.getColor(rootView.getContext(), R.color.black));
                form_list_button2.setTextColor(ContextCompat.getColor(rootView.getContext(), R.color.white));
                form_list_button3.setTextColor(ContextCompat.getColor(rootView.getContext(), R.color.black));
                form_list_button4.setTextColor(ContextCompat.getColor(rootView.getContext(), R.color.black));

                Toast tMsg = Toast.makeText(rootView.getContext(),"버튼2",Toast.LENGTH_SHORT);
            }
        });

        form_list_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast tMsg = Toast.makeText(rootView.getContext(),"버튼3",Toast.LENGTH_SHORT);
            }
        });

        form_list_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast tMsg = Toast.makeText(rootView.getContext(),"버튼4",Toast.LENGTH_SHORT);
            }
        });

        return rootView;


    }
}