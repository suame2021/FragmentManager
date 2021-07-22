package com.example.fragment_manager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.findNavController
import com.example.fragment_manager.R
import com.example.fragment_manager.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    private lateinit var manager:FragmentManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(inflater,container, false)
        manager=requireActivity().supportFragmentManager
        binding.apply {
          nextbutton.setOnClickListener{
              //use java or kotlin function
        openNextFragment()
      }
  }
        return binding.root
    }
    //kotlin version
    private fun openNextFragment() {
        val action= HomeFragmentDirections.actionHomeFragmentToNewFragment()
        requireActivity().findNavController(R.id.fragmentContainerView).navigate(R.id.action_homeFragment_to_newFragment)


    }}

        //manager.commit{
          //replace<NewFragment>(R.id.fragmentContainerView)
            //setReorderingAllowed(true)
            //addToBackStack("")
       // }
    //}
//java version
//private fun openNextFragmentJv(){
    //manager.beginTransaction()
        //.replace(R.id.fragmentContainerView,NewFragment::class.java,null)
        //.setReorderingAllowed(true)
      //  .addToBackStack("")
    //    .commit()
//}

