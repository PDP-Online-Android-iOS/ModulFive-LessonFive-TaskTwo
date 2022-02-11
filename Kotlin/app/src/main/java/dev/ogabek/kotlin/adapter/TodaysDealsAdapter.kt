package dev.ogabek.kotlin.adapter

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.TodaysDeals

class TodaysDealsAdapter(private val context: Context, private val todaysDeals: List<TodaysDeals>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_today_s_deals, parent, false)
        return TodaysDealsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val deal: TodaysDeals = todaysDeals[position]
        if (holder is TodaysDealsViewHolder) {
            holder.profile.setImageResource(deal.picture)
            holder.name.text = deal.name
            holder.discount.text = "${deal.discount}%"
            holder.currentPrice.text = "$" + deal.currentPrice
            holder.lastPrice.text = "$" + deal.lastPrice
            holder.lastPrice.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
        }
    }

    override fun getItemCount(): Int {
        return todaysDeals.size
    }

    private class TodaysDealsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var profile: ImageView = view.findViewById(R.id.iv_photo_today)
        var name: TextView = view.findViewById(R.id.item_product_name_today)
        var currentPrice: TextView = view.findViewById(R.id.item_product_price_today)
        var lastPrice: TextView = view.findViewById(R.id.item_product_last_price_today)
        var discount: TextView = view.findViewById(R.id.item_product_off_percent_today)

    }

}
