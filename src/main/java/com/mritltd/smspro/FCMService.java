import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.FirebaseMessagingService;
import android.util.Log;

public class FCMService extends FirebaseMessagingService {
    private static final String TAG = "FCMService";

    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "New token: " + token);
        saveTokenToDatabase(token);
    }

    // Method to handle incoming FCM messages
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Handle FCM messages here.
        if (remoteMessage.getNotification() != null) {
            showNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());
        }
    }

    // Save token to your server or local database
    private void saveTokenToDatabase(String token) {
        // Implementation for saving token
    }

    // Show notifications to users
    private void showNotification(String title, String message) {
        // Implementation for displaying notification
    }
}