package rs.ac.metropolitan.cs330_dz13
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import rs.ac.metropolitan.cs330_dz13.data.model.App
import rs.ac.metropolitan.cs330_dz13.data.model.AppType
import rs.ac.metropolitan.cs330_dz13.ui.detail.AppDetail
import rs.ac.metropolitan.cs330_dz13.ui.detail.AppDetailViewModel

@ExperimentalCoroutinesApi
class AppDetailViewModelTest {
    private lateinit var viewModel: AppDetailViewModel

    @Before
    fun setUp() {
        viewModel = AppDetailViewModel()
    }

    @Test
    fun setAppDetail_success() = runBlockingTest {
        // Postavljanje detalja aplikacije
        val appDetail = AppDetail(
            app = App(1, "Test App", "Phone", "Education", AppType.FREE, null, 4),
            image = "https://example.com/image.jpg"
        )
        viewModel.setAppDetail(appDetail)

        // Provera da li su detalji aplikacije postavljeni kako je očekivano
        assertEquals(appDetail, viewModel.appDetail.value)
    }
}