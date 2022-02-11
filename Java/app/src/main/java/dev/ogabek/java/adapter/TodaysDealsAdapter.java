package dev.ogabek.java.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.TodaysDeals;

public class TodaysDealsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<TodaysDeals> todaysDeals;

    public TodaysDealsAdapter(Context context, List<TodaysDeals> todaysDeals) {
        this.context = context;
        this.todaysDeals = todaysDeals;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_today_s_deals, parent, false);
        return new TodaysDealsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TodaysDeals deal = todaysDeals.get(position);

        if (holder instanceof TodaysDealsViewHolder) {
            ((TodaysDealsViewHolder) holder).profile.setImageResource(deal.getPicture());
            ((TodaysDealsViewHolder) holder).name.setText(deal.getName());
            ((TodaysDealsViewHolder) holder).discount.setText(deal.getDiscount());
            ((TodaysDealsViewHolder) holder).currentPrice.setText(deal.getCurrentPrice());
            ((TodaysDealsViewHolder) holder).lastPrice.setText(deal.getLastPrice());
            ((TodaysDealsViewHolder) holder).lastPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }

    @Override
    public int getItemCount() {
        return todaysDeals.size();
    }

    private static class TodaysDealsViewHolder extends RecyclerView.ViewHolder {

        ImageView profile;
        TextView name, currentPrice, lastPrice, discount;

        public TodaysDealsViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_photo_today);
            name = view.findViewById(R.id.item_product_name_today);
            currentPrice = view.findViewById(R.id.item_product_price_today);
            lastPrice = view.findViewById(R.id.item_product_last_price_today);
            discount = view.findViewById(R.id.item_product_off_percent_today);

        }
    }
}
