package com.example.contactappassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactRvAdapter(var contactsList:  List<Contacts>) :
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.contacts_list_item, parent, false)
        return ContactsViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentContact = contactsList.get(position)
        holder.tvcontactname.text = currentContact.contactname
        holder.tvcontactphonenumber.text = currentContact.contactphonenumber
        holder.tvcontactemail.text = currentContact.contactemail


    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

}

class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvcontactname = itemView.findViewById<TextView>(R.id.tvcontactname)
    var tvcontactphonenumber = itemView.findViewById<TextView>(R.id.tvcontactphonenumber)
    var tvcontactemail = itemView.findViewById<TextView>(R.id.tvcontactemail)


}






