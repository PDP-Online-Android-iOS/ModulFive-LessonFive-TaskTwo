package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Favorite;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Favorite> favorites;

    public MainAdapter(Context context, List<Favorite> favorites) {
        this.context = context;
        this.favorites = favorites;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed_favourite, parent, false);
        return new FavoriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Favorite item = favorites.get(position);

        if (holder instanceof FavoriteViewHolder) {
            ((FavoriteViewHolder) holder).title.setText(item.getTitle());
            ((FavoriteViewHolder) holder).image.setImageResource(item.getImage());
        }
    }

    @Override
    public int getItemCount() {
        return favorites.size();
    }

    private static class FavoriteViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView image;

        public FavoriteViewHolder(View view) {
            super(view);

            title = view.findViewById(R.id.tv_title);
            image = view.findViewById(R.id.iv_image);
        }
    }
}
