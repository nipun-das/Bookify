package com.example.bookie.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.bookie.R
import com.example.bookie.adapter.DashboardRecyclerAdapter
import com.example.bookie.model.Book


class DashboardFragment : Fragment() {

    lateinit var recyclerDashboard: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val bookList = arrayListOf(
        "Rich Dad Poor Dad",
        "The Alchemist",
        "The Power of Your Subconscious Mind",
        "The Monk Who Sold His Ferrari",
        "Atomic Habits", //482
        "The Fault in our Stars",
        "The Psychology of Money",
        "Ikigai",
        "Sapiens",
        "The 5 AM Club"
    )
    val bookInfoList = arrayListOf<Book>(

        Book(
            "Rich Dad Poor Dad",
            "Robert T. Kiyosaki",
            "Rs.1662.00",
            "4.8",
            R.drawable.richdadpoordad
        ),
        Book(
            "The Alchemist",
            "Paulo Coelho",
            "Rs.228.00",
            "4.5",
            R.drawable.thealchemist
        ),
        Book(
            "The Power of Your Subconscious Mind",
            "Dr. Joseph Murphy",
            "Rs.125.00",
            "4.5",
            R.drawable.thepowerofyoursub
        ),
        Book(
            "The Monk Who Sold His Ferrari",
            "Robin Sharma",
            "Rs.206.00",
            "4.5",
            R.drawable.themonkwhosold
        ),
        Book(
            "Atomic Habits",
            "James Clear",
            "Rs.482.00",
            "4.6",
            R.drawable.atomichabits
        ),
        Book(
            "The Fault in our Stars",
            "John Green",
            "Rs.292.00",
            "4.2",
            R.drawable.thefaultinourstars
        ),
        Book(
            "The Psychology of Money",
            "Morgan Housel",
            "Rs.301.00",
            "4.4",
            R.drawable.thepsychologyofmoney
        ),
        Book(
            "Ikigai",
            "Héctor García and Francesc Miralles",
            "Rs.1662.00",
            "4.8",
            R.drawable.ikigai
        ),
        Book(
            "Sapiens",
            "Yuval Noah Harari",
            "Rs.432.00",
            "4.5",
            R.drawable.sapiens
        ),
        Book(
            "The 5 AM Club",
            "Robin Sharma",
            "Rs.238.00",
            "4.4",
            R.drawable.thefiveamclub
        )


    )

    lateinit var recyclerAdapter: DashboardRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        recyclerDashboard = view.findViewById(R.id.recyclerDashboard)
        layoutManager = LinearLayoutManager(activity)
        recyclerAdapter = DashboardRecyclerAdapter(activity as Context, bookInfoList)

        recyclerDashboard.adapter = recyclerAdapter
        recyclerDashboard.layoutManager = layoutManager

        recyclerDashboard.addItemDecoration(
            DividerItemDecoration(
                recyclerDashboard.context, (layoutManager as LinearLayoutManager).orientation

            )
        )

        return view
    }

}