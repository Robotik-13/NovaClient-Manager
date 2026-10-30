package app.valenced.manager.updatechecker.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

// Local NovaClient test builds have no release update channel yet.
class UpdateWorker(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result = Result.success()
}
