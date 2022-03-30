package br.com.local.lafayetteprojeto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterGaleria extends RecyclerView.Adapter<AdapterGaleria.MyViewHolderGaleria> {

    private Context mContext;
    private List<Galeria> mData;

    public AdapterGaleria(Context mContext, List<Galeria> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolderGaleria onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.modelo_card_galeria, parent, true);

        return new MyViewHolderGaleria(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterGaleria.MyViewHolderGaleria holder, int position) {

        holder.imageView.setImageResource(mData.get(position).getFoto());
        holder.txtTitulo.setText(mData.get(position).getTitulo());
        holder.txtSecTexto.setText(mData.get(position).getSecTexto());
        holder.txtSupportTexto.setText(mData.get(position).getSupportTexto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolderGaleria extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtTitulo;
        TextView txtSecTexto;
        TextView txtSupportTexto;

        public MyViewHolderGaleria(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgFoto);
            txtTitulo = itemView.findViewById(R.id.lblTitulo);
            txtSecTexto = itemView.findViewById(R.id.lblSecText);
            txtSupportTexto = itemView.findViewById(R.id.lblSupportText);

        }
    }


}
