package rs.ac.metropolitan.cs330_dz13.data.model

data class App(val id: Long,
               val name: String,
               val platform: String,
               val category: String,
               val type: AppType,
               val subscriptionEndDate: String?,
               val rating: Int)

enum class AppType {
    FREE,
    PAID,
    SUBSCRIPTION
}
