package kr.ac.duksung.apackage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FavoriteFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private FavoriteAdapter mRecyclerAdapter;
    private ArrayList<FavoriteItem> mfavoriteItems;




    public FavoriteFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView =(ViewGroup) inflater.inflate(R.layout.fragment_favorite, container, false);
        // Inflate the layout for this fragment

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.favorite_rv);

        /* initiate adapter */
        mRecyclerAdapter = new FavoriteAdapter();

        /* initiate recyclerview */
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        /* sample data */
        mfavoriteItems = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            mfavoriteItems.add(new FavoriteItem(R.drawable.account_vector, "쿵후마라탕", "대표메뉴"));
        }
        mRecyclerAdapter.setFavoriteList(mfavoriteItems);




        return rootView;
    }
}