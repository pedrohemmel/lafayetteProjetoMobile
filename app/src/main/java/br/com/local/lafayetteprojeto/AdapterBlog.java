package br.com.local.lafayetteprojeto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterBlog extends RecyclerView.Adapter<AdapterBlog.MyViewHolder> {

    private Context mContext;
    private List<Artigos> mData;

    public AdapterBlog(Context mContext, List<Artigos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.modelo_card_artigo, parent, false); //Não entendi

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBlog.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitulo;
        TextView txtSubTitulo;
        TextView txtInfo;
        Button btnVisualizar;
        Button btnDeletar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //Referenciando objetos para o card
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtSubTitulo = itemView.findViewById(R.id.txtSubTitulo);
            txtInfo = itemView.findViewById(R.id.txtInfo);
            btnVisualizar = itemView.findViewById(R.id.btnVisualizar);
            btnDeletar = itemView.findViewById(R.id.btnDeletar);
        }
    }
}