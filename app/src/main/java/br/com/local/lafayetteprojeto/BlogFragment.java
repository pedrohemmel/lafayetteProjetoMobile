package br.com.local.lafayetteprojeto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class BlogFragment extends Fragment {

    List<Artigos> lstArtigos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blog, container, false);

        lstArtigos = new ArrayList<>();

        lstArtigos.add(new Artigos("Pedro", "Henrique", "O brabo"));
        lstArtigos.add(new Artigos("Gabriel", "Bueno", "O brabo inverso"));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewBlog);

        AdapterBlog adapterBlog = new AdapterBlog(getContext(), lstArtigos);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true));

        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapterBlog);

        return view;
    }

}