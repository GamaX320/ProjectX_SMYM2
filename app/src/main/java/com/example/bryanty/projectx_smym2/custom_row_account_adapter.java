package com.example.bryanty.projectx_smym2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/**
 * Created by BRYANTY on 25/02/2015.
 */
public class custom_row_account_adapter extends ArrayAdapter<String>{

    public custom_row_account_adapter(Context context, String[] accountName) {
        super(context,R.layout.custom_row_account ,accountName);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater rowAccInflater= LayoutInflater.from(getContext());
        View customView= rowAccInflater.inflate(R.layout.custom_row_account,parent,false);

        String singleAcc= getItem(position);
        TextView accAvatar=(TextView)customView.findViewById(R.id.textView_acc_avatar);
        TextView accName=(TextView)customView.findViewById(R.id.textView_acc_name);
        TextView accAmount=(TextView)customView.findViewById(R.id.textView_amount);

        accAvatar.setText(singleAcc.substring(0,1));
        accName.setText(singleAcc);
        accAmount.setText("RM50.00");

        return customView;
    }
}
