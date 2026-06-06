package io.github.shohei.calculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val result = MutableLiveData<String>()
}