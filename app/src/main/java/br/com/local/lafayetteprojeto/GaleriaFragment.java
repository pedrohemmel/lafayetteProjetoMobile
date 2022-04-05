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

        galeriaList.add(new Galeria(R.drawable.albertinho, "Thiago Pereira", "Emocionante e motivadora história de Thiago", "Seu pai morreu. A vida se tornou ainda mais difícil, foi necessário deixar a escola de Dona Maria. Contava, com muita tristeza, de quando teve que pegar seu banco e dizer à professora que não podia mais estudar, pois tinha que trabalhar. Lembrava que sua mãe sempre dizia: “Vá trabalhar, menino”. Desejou ser frentista no posto de gasolina, mas diziam que ele não tinha idade. Então, foi trabalhar entregando pão, colocando cimento para rejuntar o calçamento de rua e, por fim, como ajudante numa mercearia que ficava na Rua dos Tocos em Olinda, de um senhor chamado Vitalino e de sua esposa, D. Zezé, que o acolheram como filho. Nessa família, encontrou o carinho com o qual conviveu durante muitos anos."));

        galeriaList.add(new Galeria(R.drawable.henrique, "Henrque", "Conheça um dos nossos mais fiéis integrantes", "Como era o segundo filho homem, não estava destinado ao trono. Mesmo assim, recebeu uma educação esmerada e estudou latim, francês, história, etc.\n" +
                "\n" +
                "Ao falecer seu irmão, em 1502, Henrique tornou-se herdeiro do trono. Quando seu pai falece, ele é coroado rei aos 18 anos de idade, em 1509.\n" +
                "\n" +
                "Por razões políticas, casa-se com a viúva do seu irmão, a infanta espanhola Catarina de Aragão. Desta maneira, garantia a aliança com a poderosa Coroa de Castela. A rainha lhe daria três filhos, das quais somente Maria (futura rainha Maria I) chegaria à vida adulta."));

        RecyclerView mRecycler = view.findViewById(R.id.recyclerViewGaleria);

        AdapterGaleria adapterGaleria = new AdapterGaleria(getContext(), galeriaList);

        mRecycler.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true));

        mRecycler.setHasFixedSize(true);

        mRecycler.setAdapter(adapterGaleria);

        return view;

    }
}