package rs.ac.metropolitan.cs330_dz13.data.repository

import rs.ac.metropolitan.cs330_dz13.data.dao.AppDao
import rs.ac.metropolitan.cs330_dz13.data.model.App

class AppRepositoryImpl (private val appDao: AppDao) : AppRepository {

    override suspend fun getAllApps(): List<App> {
        return appDao.getAllApps()
    }

    override suspend fun addApp(app: App) {
        appDao.insertApp(app)
    }

    override suspend fun updateApp(app: App) {
        appDao.updateApp(app)
    }

    override suspend fun deleteApp(app: App) {
        appDao.deleteApp(app)
    }
}