package org.hambrouck.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LijstFragment : Fragment() {
    private val lijst_van_personen = listOf(
        Person("Wim", "Hambrouck"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),
        Person("Johan", "Johansson"),

        Person("Max", "Mustermann")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_lijst, container, false)
        val lijst = view.findViewById<RecyclerView>(R.id.personenlijst)
        lijst.layoutManager = LinearLayoutManager(this.context)
        lijst.adapter = PersonenAdapter(lijst_van_personen)
        return view
    }


}