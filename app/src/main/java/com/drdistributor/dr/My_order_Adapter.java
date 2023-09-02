package com.drdistributor.dr;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class My_order_Adapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    private List<My_order_get_or_set> livetvItems;

    public My_order_Adapter(Context context, List<My_order_get_or_set> arraylist)
    {
        this.context = context;
        this.livetvItems = arraylist;
    }
 
    @Override
	public int getCount() {
		return livetvItems.size();
	}
    
   
    @Override
	public View getView(int position, View view, ViewGroup parent) 
    {
		// TODO Auto-generated method stub
       
        LayoutInflater abc = ((Activity) context).getLayoutInflater();
		View itemView = abc.inflate(R.layout.my_order_item, null,true);
		final My_order_get_or_set My_order_get = livetvItems.get(position);

        ImageView item_image = itemView.findViewById(R.id.item_image);

        TextView item_title = itemView.findViewById(R.id.item_title);
        TextView item_message = itemView.findViewById(R.id.item_message);
        TextView item_date_time = itemView.findViewById(R.id.item_date_time);

        Picasso.with(context).load(My_order_get.item_image()).into(item_image);
        item_title.setText(Html.fromHtml(My_order_get.item_title()));
        item_message.setText(Html.fromHtml("Total : ₹ "+My_order_get.item_message()+"/-"));
        item_date_time.setText(Html.fromHtml(My_order_get.item_date_time()));
        return itemView;
    }

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
}