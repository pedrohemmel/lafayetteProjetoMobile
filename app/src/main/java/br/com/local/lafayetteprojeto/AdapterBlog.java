
package br.com.local.lafayetteprojeto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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
        view = mInflater.inflate(R.layout.modelo_card_artigo, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBlog.MyViewHolder holder, int position) {
        //setando os valores do artigo
        holder.txtTitulo.setText(mData.get(position).getTitulo());
        holder.txtSubTitulo.setText(mData.get(position).getSubTitulo());
        holder.txtSinopse.setText(mData.get(position).getSinopse());
        holder.imgArtigo.setImageResource(mData.get(position).getImagemArt());

        holder.btnVisualizarArtigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, EditBlogActivity.class);
                intent.putExtra("Titulo", mData.get(position).getTitulo());
                intent.putExtra("Sinopse", mData.get(position).getSinopse());
                intent.putExtra("Imagem", mData.get(position).getImagemArt());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitulo;
        TextView txtSubTitulo;
        TextView txtSinopse;
        ImageView imgArtigo;
        Button btnVisualizarArtigo;
        Button btnDeletarArtigo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //Referenciando objetos para o card
            txtSinopse = itemView.findViewById(R.id.txtSinopse);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtSubTitulo = itemView.findViewById(R.id.txtSubTitulo);
            imgArtigo = itemView.findViewById(R.id.imgArtigo);
            btnVisualizarArtigo = itemView.findViewById(R.id.btnVisualizarArtigo);
            btnDeletarArtigo = itemView.findViewById(R.id.btnDeletarArtigo);
        }
    }
}
