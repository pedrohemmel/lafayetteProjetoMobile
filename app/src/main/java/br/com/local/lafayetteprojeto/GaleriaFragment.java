package br.com.local.lafayetteprojeto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class GaleriaFragment extends Fragment {

    private List<Galeria> galeriaList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_galeria, container, false);

        galeriaList = new ArrayList<>();

        galeriaList.add(new Galeria(R.drawable.cachorrinho, "Cachorro", "Tigre", "Bravo"));
        galeriaList.add(new Galeria(R.drawable.passaro_rainbow, "Passarinho", "Qualquer coisa", "Fofinho"));

        RecyclerView mRecycler = view.findViewById(R.id.recyclerViewGaleria);

        AdapterGaleria adapterGaleria = new AdapterGaleria(getContext(), galeriaList);

        mRecycler.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true));

        mRecycler.setHasFixedSize(true);

        mRecycler.setAdapter(adapterGaleria);

        return view;

    }
}