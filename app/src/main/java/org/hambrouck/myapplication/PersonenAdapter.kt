package org.hambrouck.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonenAdapter(private val personen: List<Person>) : RecyclerView.Adapter<PersonenAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtVoornaam: TextView
        val txtAchternaam: TextView

        init {
            txtVoornaam = view.findViewById(R.id.txt_voornaam)
            txtAchternaam = view.findViewById(R.id.txt_achternaam)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtVoornaam.text = personen[position].voornaam
        holder.txtAchternaam.text = personen[position].achternaam
    }

    override fun getItemCount(): Int {
        return personen.size
    }
}