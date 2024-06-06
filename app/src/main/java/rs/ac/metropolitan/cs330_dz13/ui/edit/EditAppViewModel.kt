package rs.ac.metropolitan.cs330_dz13.ui.edit

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import rs.ac.metropolitan.cs330_dz13.data.model.App

class EditAppViewModel: ViewModel() {
    private val _editedApp: MutableStateFlow<App?> = MutableStateFlow(null)
    val editedApp: StateFlow<App?> = _editedApp

    fun setEditedApp(app: App) {
        _editedApp.value = app
    }
}