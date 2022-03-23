package br.com.local.lafayetteprojeto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.List;

public class BlogFragment extends Fragment {

    List<Artigos> lstArtigos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blog, container, false);

        AdapterBlog mAdapterBlog = findViewById(R.id.recyclerViewBlog);




        return view;
    }

}