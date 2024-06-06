package rs.ac.metropolitan.cs330_dz13
import org.junit.Assert.*
import org.junit.Test
import rs.ac.metropolitan.cs330_dz13.data.model.App
import rs.ac.metropolitan.cs330_dz13.data.model.AppType
import rs.ac.metropolitan.cs330_dz13.ui.detail.AppDetail

class AppTest {
    @Test
    fun app_creation_test() {
        val app = App(
            id = 1,
            name = "Test App",
            platform = "Phone",
            category = "Education",
            type = AppType.FREE,
            subscriptionEndDate = null,
            rating = 4
        )

        assertNotNull(app)
        assertEquals(1, app.id)
        assertEquals("Test App", app.name)
        assertEquals("Phone", app.platform)
        assertEquals("Education", app.category)
        assertEquals(AppType.FREE, app.type)
        assertNull(app.subscriptionEndDate)
        assertEquals(4, app.rating)
    }
}

class AppDetailTest {

    @Test
    fun app_detail_creation_test() {
        val app = App(
            id = 1,
            name = "Test App",
            platform = "Phone",
            category = "Education",
            type = AppType.FREE,
            subscriptionEndDate = null,
            rating = 4
        )

        val appDetail = AppDetail(
            app = app,
            image = "https://example.com/image.jpg"
        )

        assertNotNull(appDetail)
        assertEquals(app, appDetail.app)
        assertEquals("https://example.com/image.jpg", appDetail.image)
    }
}