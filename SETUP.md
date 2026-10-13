# Firebase setup checklist

1. Open Firebase Console and create a project named `KALA CHAT`.
2. Add an Android app with package `com.kalachat.app`.
3. Enable **Authentication → Sign-in method → Phone**.
4. Set allowed SMS regions and review quotas/billing before sharing the app.
5. Register test phone numbers for development; never hardcode real OTPs in the app.
6. Add Firestore Database and Storage only after choosing the data model.
7. Add `google-services.json` to the Android app only in a compatible Gradle project. Do not commit secrets or private service-account files.
8. Test auth and database rules with Firebase Emulator Suite before production.

## Data model suggestion
- `users/{uid}`: display name, phone visibility preference, avatar URL, createdAt
- `chats/{chatId}`: member UIDs, createdAt, lastMessage metadata
- `chats/{chatId}/messages/{messageId}`: sender UID, text/media metadata, timestamp, type
- `statuses/{statusId}`: owner UID, media URL, createdAt, expiresAt, audience UIDs

Do not trust a client-supplied sender UID. Derive identity from authenticated Firebase user and enforce membership in security rules. Avoid storing OTPs yourself.
