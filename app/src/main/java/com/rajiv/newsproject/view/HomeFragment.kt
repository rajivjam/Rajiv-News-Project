package com.rajiv.newsproject.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.rajiv.newsproject.R
import com.rajiv.newsproject.adapter.NewsAdapter
import com.rajiv.newsproject.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activityViewModel = ViewModelProviders.of(this).get<MainActivityViewModel>(
            MainActivityViewModel::class.java!!)
        activityViewModel.allArticle?.observe(this, Observer { articles ->
            recyclerView.layoutManager = LinearLayoutManager(activity)
            recyclerView.adapter = NewsAdapter(articles, activity!!.applicationContext)

            (recyclerView.adapter as NewsAdapter).onItemClick = { article ->
                Log.d("URL", article.url)
                activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.addToBackStack(null)
                    ?.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_out_up)
                    ?.add(R.id.frameLayout, NewsDetailsFragment.newInstance(article.url), "NewsDetails")
                    ?.commit()
            }

        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}
