package io.alphanovel.logger

/**
 * Requirements:
 * 1) Send logs to backend every 30 seconds (if exists);
 * 2) If 50 logs collected send logs immediately and restart timer;
 * 3) Save unsent logs for next user session.
 */
interface AppLogger {

    fun recordLog(tag: String, message: String)
}