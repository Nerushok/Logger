package io.alphanovel.logger.remote

interface LoggerBackendApi {

    suspend fun sendLogs(logs: List<LogData>)
}