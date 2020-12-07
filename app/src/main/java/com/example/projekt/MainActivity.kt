package com.example.projekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.projekt.model.Restaurant
import com.example.projekt.repozitory.Repozitory
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repozitory = Repozitory()
        val viewModelFactory = MainViewModelFactory(repozitory)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)

        button.setOnClickListener {
            val myNumber = number_editText.text.toString()
            viewModel.getPost2(Integer.parseInt(myNumber))
            viewModel.myCustomPoints.observe(this, Observer { response ->
                if(response.isSuccessful){
                    textView.text = response.body().toString()
                    response.body()?.forEach{
                        Log.d("Response",it.restaurantId.toString())
                        Log.d("Response",it.restaurantName.toString())
                        Log.d("Response",it.restaurantAddress.toString())
                        Log.d("Response",it.city.toString())
                        Log.d("Response",it.state.toString())
                        Log.d("Response",it.area.toString())
                        Log.d("Response",it.postalCode.toString())
                        Log.d("Response",it.country.toString())
                        Log.d("Response",it.phone.toString())
                        Log.d("Response",it.lat.toString())
                        Log.d("Response",it.lng.toString())
                        Log.d("Response",it.reserve_url.toString())
                        Log.d("Response",it.mobil_reserve_url.toString())
                        Log.d("Response",it.image_url.toString()
                        )
                    }
                }
                else{
                    textView.text = response.code().toString()
                }
            })
        }
    }
}