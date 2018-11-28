package com.rakesh.androidflavour;

import android.util.Log;

public class AppDelegate {
    /**
     * @param TAG
     * @param Message
     * @param LogType
     */
    public static void Log(String TAG, String Message, int LogType) {
        if (BuildConfig.DEBUG)
            switch (LogType) {
                // Case 1- To Show Message as Debug
                case 1:
                    Log.d(TAG, Message);
                    break;
                // Case 2- To Show Message as Error
                case 2:
                    Log.e(TAG, Message);
                    break;
                // Case 3- To Show Message as Information
                case 3:
                    Log.i(TAG, Message);
                    break;
                // Case 4- To Show Message as Verbose
                case 4:
                    Log.v(TAG, Message);
                    break;
                // Case 5- To Show Message as Assert
                case 5:
                    Log.w(TAG, Message);
                    break;
                // Case Default- To Show Message as System Print
                default:
                    System.out.println(Message);
                    break;
            }
    }

    /* Function to show log for db error message */
    public static void LogDB(String Message) {
        AppDelegate.Log("DATABASE", "" + Message, 1);
    }

    /**
     * Funtion to log with tag RESULT, you need to just pass the message.
     *
     * @String Message = pass your message that you want to log.
     */
    public static void LogR(String Message) {
        AppDelegate.Log("RESULT", "" + Message, 1);
    }

    /**
     * Funtion to log with tag INTERNET, you need to just pass the message.
     *
     * @String Message = pass your message that you want to log.
     */
    public static void LogI(String Message) {
        AppDelegate.Log("INTERNET", "" + Message, 1);
    }
}
