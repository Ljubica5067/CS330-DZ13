package rs.ac.metropolitan.cs330_dz13
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import rs.ac.metropolitan.cs330_dz13.data.model.App
import rs.ac.metropolitan.cs330_dz13.data.model.AppType
import rs.ac.metropolitan.cs330_dz13.data.repository.AppRepository
import rs.ac.metropolitan.cs330_dz13.ui.home.HomeViewModel

@ExperimentalCoroutinesApi
class HomeViewModelTest {
    private lateinit var viewModel: HomeViewModel

    @Before
    fun setUp() {
        viewModel = HomeViewModel()
    }

    @Test
    fun loadApps_success() = runBlockingTest {
        // Mockiranje baze podataka ili repository-a
        val mockApps = listOf(
            App(1, "App 1", "Phone", "Education", AppType.FREE, null, 4),
            App(2, "App 2", "Tablet", "Entertainment", AppType.PAID, null, 3),
            App(3, "App 3", "Phone", "Gaming", AppType.SUBSCRIPTION, "2024-12-31", 5)
        )


        val mockRepository = mock(AppRepository::class.java)
        `when`(mockRepository.getAllApps()).thenReturn(mockApps)


        viewModel.repository = mockRepository

        viewModel.loadApps()


        assertEquals(mockApps, viewModel.apps.value)
    }
}