package com.example.blank.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.datastore.dataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blank.data.repository.UserpreferenceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainViewModel (private  val datastore : UserpreferenceRepository) : ViewModel(){
//  This listen a change in state and update the state
    val _firstname = MutableStateFlow("")

//    This create a read only version of the _firstName
    val firstname : StateFlow<String> = _firstname

//    The viewModel is initialized
    init{
        viewModelScope.launch {
//            on the initialization on the viewModel, the latest version of the firstName is returned
            datastore.firstNameFlow.collectLatest { _firstname.value = it }

        }
    }

//    saves the newName into the dataStore
    fun saveUsername(newName : String){
        viewModelScope.launch { datastore.saveFirstName(newName) }
    }

}

