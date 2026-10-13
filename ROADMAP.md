# KALA CHAT roadmap

## Milestone 1 — Authentication
- Firebase phone OTP
- Handle resend timeout, verification failures, and test numbers
- Profile creation and logout

## Milestone 2 — One-to-one chat
- Chat list and conversation screen
- Firestore listeners and pagination
- Message delivery/read states, timestamps, retry/offline handling
- Block/report controls

## Milestone 3 — Media and status
- Upload media to Storage with file size/type limits
- Status audience and expiry enforcement
- Delete/report flows

## Milestone 4 — Groups and notifications
- Group creation, roles, membership validation
- FCM notifications via trusted server-side logic
- Notification preferences

## Milestone 5 — Calls
- WebRTC audio/video
- Authenticated call signaling
- STUN/TURN configuration, call permissions and lifecycle
- Test mobile network changes and background behavior

## Milestone 6 — Release readiness
- Firestore/Storage rules review
- Privacy policy, data deletion, abuse prevention
- Crash reporting, accessibility, low-bandwidth tests
- Build/sign APK and test on multiple devices

A GitHub repository is source hosting, not a real-time backend by itself.
