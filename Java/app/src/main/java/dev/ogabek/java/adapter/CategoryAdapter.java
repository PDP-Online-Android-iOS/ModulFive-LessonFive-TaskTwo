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
import dev.ogabek.java.model.Category;

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Category> categories;
    private final Context context;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.categories = categories;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Category category = categories.get(position);

        if (holder instanceof CategoryViewHolder) {
            ((CategoryViewHolder) holder).picture.setImageResource(category.getPicture());
            ((CategoryViewHolder) holder).title.setText(category.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    private static class CategoryViewHolder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView title;

        public CategoryViewHolder(View view) {
            super(view);

            picture = view.findViewById(R.id.iv_category);
            title = view.findViewById(R.id.tv_type_category);
        }
    }
}
