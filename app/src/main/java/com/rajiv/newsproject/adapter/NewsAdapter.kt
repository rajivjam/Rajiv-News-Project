package com.rajiv.newsproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rajiv.newsproject.R
import com.rajiv.newsproject.model.Article

class NewsAdapter(var articles: List<Article>, private val context: Context) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    var onItemClick: ((Article) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.news_list_item, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.title.text = articles[position].title
        holder.date.text = articles[position].publishedAt
        holder.author.visibility = if (articles[position].author!=null) View.VISIBLE else View.GONE
        holder.author.text = articles[position].author
        val photoUrl = articles[position].urlToImage
        Glide.with(context).load(photoUrl).into(holder.imageView);
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val date: TextView = itemView.findViewById(R.id.date)
        val author: TextView = itemView.findViewById(R.id.author)
        val imageView: ImageView = itemView.findViewById(R.id.image)

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(articles[adapterPosition])
            }
        }
    }

}