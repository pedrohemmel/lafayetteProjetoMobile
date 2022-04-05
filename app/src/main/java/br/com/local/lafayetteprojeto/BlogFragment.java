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

        lstArtigos.add(new Artigos("Conceitos básicos da matemática", "Você sabe da importância de estudar matemática para garantir um futuro promissor?", "Neste artigo separamos três conceitos básicos que geralmente estão presentes tanto em Matemática quanto em Física e Química nas provas do Enem. Exercícios envolvendo exclusivamente eles não apresentam dificuldade alguma para serem resolvidos, por isso, são menos frequentes no exame. Esses conceitos normalmente aparecem de forma indireta. Veja quais são eles: \n\n O conjunto dos números inteiros é formado por todos os números inteiros positivos, negativos e pelo zero. Em virtude da presença de números negativos, que soma regras à adição e à multiplicação, as operações básicas entre eles apresentam algumas diferenças que carecem de adaptação.", R.drawable.math));

        lstArtigos.add(new Artigos("Albert Einstein", "\"Somos o Hospital Israelita Albert Einstein e cuidar de você é a nossa certeza.\" ", "Não desistir de tentar! Além da Teoria da Relatividade, a persistência e luta pelos nossos sonhos é uma das principais lições que Einstein deixou para a humanidade.\n" +
                "\n" +
                "Muita gente não sabe, mas o maior gênio do século XX era considerado um “mau aluno” e “completamente inútil” por seus professores da universidade. De origem humilde, ele passou dificuldades financeiras e esteve várias vezes desempregado após finalizar a faculdade.\n" +
                "\n" +
                "Um grande problema na vida de Einstein é que ele era incompreendido, pois costumava ter várias ideias de pesquisas e de possíveis teorias que eram vistas como impossíveis de estarem certas. Assim, como ele passava muito tempo dedicando-se a elas, não era considerado um físico e matemático muito focado nem inteligente.", R.drawable.einstein));

        lstArtigos.add(new Artigos("Oque é o corona vírus", "Entenda realmente o que é o corona vírus", "Os coronavírus são uma grande família viral, que causam infecções respiratórias e já provocaram outras doenças, como a Síndrome Respiratória Aguda Grave (Sars) e a Síndrome Respiratória do Oriente Médio (Mers). Em 80% dos casos, infecções por coronavírus causam doenças respiratórias leves a moderadas, semelhantes a um resfriado comum. A doença causada pelo novo coronavírus recebeu o nome de Covid-19. Ela foi descoberta no final de dezembro de 2019, na China.", R.drawable.corona));

        lstArtigos.add(new Artigos("Aprender Inglês", "Entenda por que é tão necessário aprender a lingua inglesa", "Conhecer uma língua vai além de decorar regras gramaticais ou longas listas de vocabulários. Ao estudar inglês, é muito provável que o aluno tenha contato com uma nova cultura — ou culturas, se considerarmos as diferenças entre os diferentes países anglófonos.\n" +
                "\n" +
                "Os principais cursos de inglês abordam as datas comemorativas mais significantes, os costumes envolvidos nessas épocas e assim por diante. Pode parecer simples, mas entender o que significa o 4th of July ou o Dia de Ação de Graças para os americanos, por exemplo, pode trazer um grande desenvolvimento pessoal ao seu filho, especialmente na adolescência.\n" +
                "\n" +
                "É na juventude que começamos a ter noção de quem somos e criamos um senso de identidade. O quanto antes entendermos que existem diferentes formas de pensar e viver, melhor para o desenvolvimento da tolerância e da empatia, características cada vez mais necessárias no mundo polarizado em que vivemos.", R.drawable.ingles));
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewBlog);

        AdapterBlog adapterBlog = new AdapterBlog(getContext(), lstArtigos);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true));

        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapterBlog);

        return view;
    }

}