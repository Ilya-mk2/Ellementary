package com.example.ellementary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v= inflater.inflate(R.layout.fragmet_first,container,false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            val txtView : TextView = view.findViewById(R.id.textView)
                var count =0

        val instance1 = arguments?.getSerializable(TAG1)
        if(instance1!= null){
            count++
        }
        val instance2 = arguments?.getSerializable(TAG2)
        if(instance2!= null){
            count++
        }
        val instance3 = arguments?.getSerializable(TAG3)
        if(instance3!= null){
            count++
        }
        val instance4 = arguments?.getSerializable(TAG4)
        if(instance4!= null){
            count++
        }
        val instance5 = arguments?.getSerializable(TAG5)
        if(instance5!= null){
            count++
        }
        txtView.text = count.toString()
    }

    companion object{

        // Фрагмент изначально всегда должен знать о существовании всех классов?
        const val TAG1 = "stud"
        const val TAG2 = "prof"
        const val TAG3 = "soldr"
        const val TAG4 = "gam"
        const val TAG5 = "sport"

        fun newInstance(student : Student?=null, professor : Professor?=null, soldier : Soldier?=null,
        gamer : Gamer?= null, sprotsman : Sportsman? = null) : FirstFragment {
            val fragment = FirstFragment()
            val arguments = Bundle()
            arguments.putSerializable(TAG1, student)
            arguments.putSerializable(TAG2, professor)
            arguments.putSerializable(TAG3, soldier)
            arguments.putSerializable(TAG4, gamer)
            arguments.putSerializable(TAG5, sprotsman)
            fragment.arguments = arguments
            return  fragment
        }
    }
}