package com.example.demotvtokyo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demotvtokyo.model.Episode
import com.example.demotvtokyo.model.Episodes
import com.example.mymovieapp.api.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.Exception

class HomeLoginFrgVM : ViewModel() {
    private var job = Job()
    private val coroutineScope = CoroutineScope(job + Dispatchers.Main)

    private var _listEpisode = MutableLiveData<List<Episode>>()
    val episode: LiveData<List<Episode>>
        get() {
            return _listEpisode
        }

    fun fetchEpisode() {
        coroutineScope.launch {
            try {
                val response = RetrofitBuilder.apiService.getTopList("and", "x86_64", "0")
                _listEpisode.value = response.listEpisode
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}