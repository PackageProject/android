package kr.ac.duksung.apackage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.ViewHolder>{
    private ArrayList<FavoriteItem> mFavoriteList = new ArrayList<>();

    @NonNull
    @Override
    public FavoriteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.board_favorite_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteAdapter.ViewHolder holder, int position) {
        holder.onBind(mFavoriteList.get(position));
    }

    public void setFavoriteList(ArrayList<FavoriteItem> list){
        this.mFavoriteList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mFavoriteList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView message;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.favorite_item_name_tv);
            message = (TextView) itemView.findViewById(R.id.favorite_item_sub_tv);
        }

        void onBind(FavoriteItem item){
            name.setText(item.getName());
            message.setText(item.getMessage());
        }
    }
}
