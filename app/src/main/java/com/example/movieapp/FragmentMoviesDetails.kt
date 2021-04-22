package com.example.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.movieapp.R
import com.example.movieapp.databinding.FragmentMoviesDetailsBinding

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private val binding by viewBinding(FragmentMoviesDetailsBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.tvBackWithArrow.setOnClickListener{onBackPressed()}
        return binding.root
    }

    private fun onBackPressed(){
        router?.replaceScreen(Screens.MovieList())
    }
}