# KALA CHAT — project scaffold

This is an upload-ready starter scaffold for a WhatsApp-style Android chat project.

## Important
This is **not a production WhatsApp clone** and does not include live OTP, messaging, calls, or push notifications until the Firebase project is configured and the remaining integrations are implemented and tested. No credentials or API keys are included.

## Suggested architecture
- Android client: Java
- Phone-number OTP: Firebase Authentication
- Real-time messages and groups: Cloud Firestore
- Photos/videos/status media: Firebase Storage
- Push notifications: Firebase Cloud Messaging + trusted server-side trigger
- Voice/video calls: WebRTC + signaling; STUN/TURN service may be required

GitHub stores source code; it is not itself the live chat server.

## Files
- `android-aide/`: minimal Java UI starter and manifest for AIDE-style projects
- `firebase-setup/`: setup checklist and security rules starter
- `docs/ROADMAP.md`: implementation milestones

## Before public launch
1. Create a Firebase project and register the Android package `com.kalachat.app`.
2. Enable Phone sign-in in Firebase Authentication and configure SMS region/quotas.
3. Add the Firebase Android configuration and SDK dependencies using a Gradle-capable Android setup. AIDE Pro support for current Firebase SDKs can vary; if it cannot resolve Gradle dependencies, build with Android Studio or a compatible Gradle environment.
4. Deploy restrictive Firestore/Storage rules and test with Firebase Emulator Suite.
5. Implement rate limits, abuse reporting/blocking, privacy policy, account deletion, and secure call signaling.
6. Test on multiple real devices before sharing with friends.

Never commit service-account private keys, signing keys, SMS provider secrets, or other credentials to a public repository.
