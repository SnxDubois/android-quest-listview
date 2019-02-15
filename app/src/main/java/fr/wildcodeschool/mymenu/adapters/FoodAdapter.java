package fr.wildcodeschool.mymenu.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import fr.wildcodeschool.mymenu.R;
import fr.wildcodeschool.mymenu.models.Food;

public class FoodAdapter extends ArrayAdapter<Food> {

    public FoodAdapter(Context context, List<Food> menu) {
        super(context, 0, menu);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Food item = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_menu, parent, false);
        }

        // Lookup view for data population
        TextView textName = convertView.findViewById(R.id.textName);
        TextView textPrice = convertView.findViewById(R.id.textPrice);

        // Populate the data into the template view using the data object
        textName.setText(item.getName());
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        textPrice.setText(format.format(item.getPrice()));

        // Return the completed view to render on screen
        return convertView;
    }
}