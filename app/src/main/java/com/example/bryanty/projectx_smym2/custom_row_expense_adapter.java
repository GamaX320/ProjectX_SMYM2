package com.example.bryanty.projectx_smym2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by BRYANTY on 26/02/2015.
 */
public class custom_row_expense_adapter extends ArrayAdapter<String> {

    public custom_row_expense_adapter(Context context, String[] typeName) {
        super(context,R.layout.custom_row_expense ,typeName);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater rowAccInflater= LayoutInflater.from(getContext());
        View customView= rowAccInflater.inflate(R.layout.custom_row_expense,parent,false);

        String singleAcc= getItem(position);
        TextView expAvatar=(TextView)customView.findViewById(R.id.textView_expense_avatar);
        TextView expName=(TextView)customView.findViewById(R.id.textView_expense_name);
        TextView expAmount=(TextView)customView.findViewById(R.id.textView_expense_amount);

        expAvatar.setText(singleAcc.substring(0,1));
        expName.setText(singleAcc);
        expAmount.setText("RM10.00");

        return customView;
    }
}
