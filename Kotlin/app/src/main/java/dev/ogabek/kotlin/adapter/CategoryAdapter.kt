package dev.ogabek.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Category

class CategoryAdapter(private val context: Context, private val categories: List<Category>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val category: Category = categories[position]
        if (holder is CategoryViewHolder) {
            holder.picture.setImageResource(category.picture)
            holder.title.setText(category.title)
        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    private class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var picture: ImageView
        var title: TextView

        init {
            picture = view.findViewById(R.id.iv_category)
            title = view.findViewById(R.id.tv_type_category)
        }
    }

}