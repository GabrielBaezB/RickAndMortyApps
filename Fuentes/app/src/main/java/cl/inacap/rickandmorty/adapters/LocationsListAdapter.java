package cl.inacap.rickandmorty.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cl.inacap.rickandmorty.R;
import cl.inacap.rickandmorty.dto.Locations;

public class LocationsListAdapter extends ArrayAdapter<Locations> {

    private List<Locations> locationes;
    private Activity contexto;

    public LocationsListAdapter(@NonNull Activity context, int resource, @NonNull List<Locations> objects) {
        super(context, resource, objects);
        this.locationes = objects;
        this.contexto = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_locations, null, true);
        TextView nameLocation = rowView.findViewById(R.id.name_Locations);
        TextView typeLocation = rowView.findViewById(R.id.type_Locations);
        TextView dimenLocation = rowView.findViewById(R.id.dimen_Locations);

        nameLocation.setText(this.locationes.get(position).getName());
        typeLocation.setText(this.locationes.get(position).getType());
        dimenLocation.setText(this.locationes.get(position).getDimension());
        return rowView;
    }
}
