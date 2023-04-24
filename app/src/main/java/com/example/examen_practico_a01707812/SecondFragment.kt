package com.example.examen_practico_a01707812

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examen_practico_a01707812.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        // Datos de ejemplo para llenar el RecyclerView

        val itemList = listOf(
            Adapter.ListItemData("zen", R.drawable.zen),
            Adapter.ListItemData("soldado", R.drawable.soldado),
            Adapter.ListItemData("reaper", R.drawable.reaper),
            Adapter.ListItemData("orisa", R.drawable.orisa),
            Adapter.ListItemData("ana", R.drawable.ana),
            Adapter.ListItemData("genji", R.drawable.g)

        )
        // Configura el adaptador y el administrador de diseño (LayoutManager)
        binding.recyclerView.adapter = Adapter(itemList)
        // Si es la vista principal es decir el main activity el contexto sera this pero en caso de que inicialmente no sea asi sera requireContext () pues el context se manda despues
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}