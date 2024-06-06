package rs.ac.metropolitan.cs330_dz13
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import rs.ac.metropolitan.cs330_dz13.data.model.App
import rs.ac.metropolitan.cs330_dz13.data.model.AppType
import rs.ac.metropolitan.cs330_dz13.ui.add.AddAppViewModel

@ExperimentalCoroutinesApi
class AddAppViewModelTest {

    private lateinit var viewModel: AddAppViewModel

    @Before
    fun setUp() {
        viewModel = AddAppViewModel()
    }

    @Test
    fun loadCategories_success() = runBlockingTest {

        viewModel.loadCategories()


        val expectedCategories = listOf(
            "Gaming", "Entertainment", "Lifestyle", "Education",
            "Business", "Finance", "Other"
        )
        assertEquals(expectedCategories, viewModel.categories.value)
    }

    @Test
    fun addApp_success() = runBlockingTest {

        viewModel.addApp(App(1, "Test App", "Phone", "Education", AppType.FREE, null, 4))


        assertEquals(true, viewModel.appAdded.value)
    }
}