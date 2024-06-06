package rs.ac.metropolitan.cs330_dz13
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import rs.ac.metropolitan.cs330_dz13.data.model.App
import rs.ac.metropolitan.cs330_dz13.data.model.AppType
import rs.ac.metropolitan.cs330_dz13.ui.edit.EditAppViewModel

@ExperimentalCoroutinesApi
class EditAppViewModelTest {

    private lateinit var viewModel: EditAppViewModel

    @Before
    fun setUp() {
        viewModel = EditAppViewModel()
    }

    @Test
    fun setEditedApp_success() = runBlockingTest {

        val app = App(1, "Test App", "Phone", "Education", AppType.FREE, null, 4)
        viewModel.setEditedApp(app)


        assertEquals(app, viewModel.editedApp.value)
    }
}