ASHUR Launcher - نسخة اختبار أولية 0.1

هذه الحزمة مشروع Android Studio لبناء APK تجريبي يعرض واجهة ASHUR الأساسية.

مهم جداً:
- هذه ليست APK جاهزة.
- هذه نسخة واجهة فقط، وليست لانشر Minecraft كاملاً.
- زر "ابدأ اللعب" يعرض تنبيهاً فقط؛ محرك Minecraft غير مدمج.
- تسجيل Microsoft وإدارة الإصدارات والمودات والجيروسكوب غير مفعّلة في هذه النسخة.

طريقة البناء:
1) فك ضغط الملف.
2) افتح Android Studio.
3) اختر Open ثم اختر مجلد ASHUR_Test_Launcher.
4) انتظر Gradle Sync.
5) من Build اختر Build APK(s).
6) جرّب APK على جهاز Android.

المتطلبات:
- Android Studio حديث.
- JDK 17 أو المتوافق مع Android Gradle Plugin 8.7.3.
- Android SDK Platform 35.


طريقة بناء APK بدون تثبيت Android Studio على الكمبيوتر (باستخدام GitHub):
1) أنشئ حساب/مستودع GitHub جديد وارفع كل محتويات هذا المجلد إليه.
2) افتح تبويب Actions في المستودع.
3) اختر Build ASHUR APK ثم Run workflow.
4) بعد انتهاء البناء بنجاح، افتح نتيجة التشغيل وانزل إلى Artifacts.
5) نزّل ASHUR-test-debug-apk.zip وافتحه؛ بداخله app-debug.apk.
6) انقل APK إلى الهاتف وثبّته. قد يطلب Android السماح بالتثبيت من هذا المصدر.

هذه الطريقة تحتاج رفع الملفات إلى GitHub وتشغيل Workflow. لا ترفع كلمات مرور أو ملفات حساب Microsoft.
