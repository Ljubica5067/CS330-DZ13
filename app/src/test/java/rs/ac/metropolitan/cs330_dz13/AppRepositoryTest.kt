package rs.ac.metropolitan.cs330_dz13
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import rs.ac.metropolitan.cs330_dz13.data.dao.AppDao
import rs.ac.metropolitan.cs330_dz13.data.model.App
import rs.ac.metropolitan.cs330_dz13.data.model.AppType
import rs.ac.metropolitan.cs330_dz13.data.repository.AppRepository
import rs.ac.metropolitan.cs330_dz13.data.repository.AppRepositoryImpl


@ExperimentalCoroutinesApi
class AppRepositoryTest {

    private lateinit var repository: AppRepository
    private lateinit var mockAppDao: AppDao

    @Before
    fun setUp() {
        mockAppDao = mock(AppDao::class.java)
        repository = AppRepositoryImpl(mockAppDao)
    }

    @Test
    fun getAllApps_success() = runBlockingTest {
        // Mockiranje rezultata iz baze podataka
        val mockApps = listOf(
            App(1, "App 1", "Phone", "Education", AppType.FREE, null, 4),
            App(2, "App 2", "Tablet", "Entertainment", AppType.PAID, null, 3),
            App(3, "App 3", "Phone", "Gaming", AppType.SUBSCRIPTION, "2024-12-31", 5)
        )
        `when`(mockAppDao.getAllApps()).thenReturn(mockApps)


        val apps = repository.getAllApps()


        assertEquals(mockApps, apps)
    }

    @Test
    fun addApp_success() = runBlockingTest {
        // Mockiranje aplikacije
        val app = App(1, "Test App", "Phone", "Education", AppType.FREE, null, 4)


        repository.addApp(app)


    }

    @Test
    fun updateApp_success() = runBlockingTest {
        // Mockiranje aplikacije
        val app = App(1, "Test App", "Phone", "Education", AppType.FREE, null, 4)

        repository.updateApp(app)


    }

    @Test
    fun deleteApp_success() = runBlockingTest {

        val app = App(1, "Test App", "Phone", "Education", AppType.FREE, null, 4)

        repository.deleteApp(app)


    }
}