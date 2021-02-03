package com.group7.secureBankAccounts.data.model;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.group7.secureBankAccounts.R;

public class AllAccountViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView amount;
    TextView iban;

    public AllAccountViewHolder(@NonNull View itemView) {

        super(itemView);
        this.name = itemView.findViewById(R.id.fragment_main_account_name);
        this.iban = itemView.findViewById(R.id.fragment_main_iban);
        this.amount = itemView.findViewById(R.id.fragment_main_amount);
    }

    public void update(BankAccount bank){
        this.name.setText(bank.getAccount_name());
        this.amount.setText(String.valueOf(bank.getAmount()) + " " + bank.getCurrency());
        this.iban.setText(bank.getIban());
    }
}