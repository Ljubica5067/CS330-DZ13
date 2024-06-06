package rs.ac.metropolitan.cs330_dz13.data.repository

import rs.ac.metropolitan.cs330_dz13.data.model.App

interface AppRepository {
    suspend fun getAllApps(): List<App>
    suspend fun addApp(app: App)
    suspend fun updateApp(app: App)
    suspend fun deleteApp(app: App)
}