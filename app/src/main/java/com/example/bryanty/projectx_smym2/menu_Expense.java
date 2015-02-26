package com.example.bryanty.projectx_smym2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by BRYANTY on 26/02/2015.
 */
public class menu_Expense extends Fragment {
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.menu_expenses_layout,container,false);

        String[] expense={"Food","Transport","Entertainment","Food","Other"};
        //custom adapter
        ListAdapter expenseAdapter=new custom_row_expense_adapter(getActivity().getApplicationContext(), expense);
        ListView expenseListView=(ListView)rootView.findViewById(R.id.listView_expenseItem);
        expenseListView.setAdapter(expenseAdapter);

        //list view click listener
        expenseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                // TODO Auto-generated method stub
                // Intent intent = new Intent(getActivity(), nextactivity.class);
                // startActivity(intent);
                Toast.makeText(getActivity(), "Click ListItem Number " + position, Toast.LENGTH_LONG).show();
            }
        });

        TextView accAvatar=(TextView)rootView.findViewById(R.id.textView_expense_avatar);
        TextView accName=(TextView)rootView.findViewById(R.id.textView_expense_name);
        TextView accAmount=(TextView)rootView.findViewById(R.id.textView_Expense_Acc_Amount);
        accName.setText("Steve");
        accAmount.setText("RM 19.20");
        accAvatar.setText(accName.getText().toString().substring(0, 1));

        ImageButton btnAddExpense= (ImageButton)rootView.findViewById(R.id.imageButton_addExpense);
        btnAddExpense.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(getActivity(),CreateExpenseActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
