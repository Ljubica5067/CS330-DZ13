package rs.ac.metropolitan.cs330_dz13.ui.detail

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AppDetailViewModel: ViewModel() {
    private val _appDetail: MutableStateFlow<AppDetail?> = MutableStateFlow(null)
    val appDetail: StateFlow<AppDetail?> = _appDetail

    fun setAppDetail(appDetail: AppDetail) {
        _appDetail.value = appDetail
    }
}