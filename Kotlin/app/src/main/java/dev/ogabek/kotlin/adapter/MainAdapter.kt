package dev.ogabek.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Favorite

class MainAdapter(private val context: Context, private val favorites: List<Favorite>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_favourite, parent, false)
        return FavoriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item: Favorite = favorites[position]
        if (holder is FavoriteViewHolder) {
            holder.title.text = item.title
            holder.image.setImageResource(item.image)
        }
    }

    override fun getItemCount(): Int {
        return favorites.size
    }

    private class FavoriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: TextView = view.findViewById(R.id.tv_title)
        var image: ImageView = view.findViewById(R.id.iv_image)

    }

}