package com.ashur.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
    private final int bg = Color.rgb(13, 13, 20);
    private final int panel = Color.rgb(25, 24, 35);
    private final int purple = Color.rgb(150, 75, 255);
    private LinearLayout content;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().setStatusBarColor(bg);
        getWindow().setNavigationBarColor(bg);

        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setBackgroundColor(bg);

        TextView top = new TextView(this);
        top.setText("  ◈  ASHUR Launcher");
        top.setTextColor(Color.WHITE);
        top.setTextSize(21);
        top.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        top.setPadding(18, 18, 18, 18);
        page.addView(top);

        ScrollView scroll = new ScrollView(this);
        content = new LinearLayout(this);
        content.setPadding(16, 8, 16, 24);
        content.setOrientation(LinearLayout.VERTICAL);
        scroll.addView(content);
        page.addView(scroll, new LinearLayout.LayoutParams(-1, 0, 1));

        TextView account = text("AshurIQ   •   حساب تجريبي محلي", 16, Color.WHITE, true);
        card(account);
        addGap();

        TextView hero = text("ASHUR  |  JAVA EDITION\n\nمرحباً بك في لانشر ASHUR التجريبي", 23, Color.WHITE, true);
        hero.setGravity(Gravity.CENTER);
        hero.setPadding(12, 36, 12, 36);
        card(hero);

        Button play = button("ابدأ اللعب");
        play.setOnClickListener(v -> message("هذه نسخة واجهة تجريبية؛ محرك Minecraft غير مدمج بعد."));
        content.addView(play, full());

        addSection("الإصدارات");
        addInfo("الإصدار المحدد: 1.21.10", "إدارة الإصدارات");
        addSection("المودات");
        addInfo("لا توجد مودات معروضة في النسخة التجريبية", "إدارة المودات");
        addSection("الأداء والتخزين");
        addInfo("RAM: تلقائي (عرض تجريبي)\nالتخزين: يعرض بعد ربط مدير الملفات", "إعدادات الأداء");
        addSection("الحسابات");
        addInfo("Microsoft: غير مربوط\nOffline: اسم محلي تجريبي فقط", "إعداد الحسابات");

        TextView note = text("نسخة اختبار للواجهة فقط • لا تشغّل Minecraft حالياً", 12, 0xFFB9B4C8, false);
        note.setGravity(Gravity.CENTER);
        note.setPadding(8, 20, 8, 8);
        content.addView(note);

        setContentView(page);
    }

    private void addSection(String title) {
        TextView t = text(title, 18, 0xFFD9B7FF, true);
        t.setPadding(4, 22, 4, 8);
        content.addView(t);
    }
    private void addInfo(String info, String action) {
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setPadding(16, 14, 16, 14);
        box.setBackground(round(panel, 18, 0xFF383047));
        TextView t = text(info, 15, Color.WHITE, false);
        box.addView(t);
        Button b = button(action);
        b.setOnClickListener(v -> message("هذه الخاصية غير مفعّلة في نموذج الواجهة."));
        box.addView(b);
        content.addView(box, full());
        addGap();
    }
    private void card(View v) {
        LinearLayout box = new LinearLayout(this);
        box.setPadding(16, 14, 16, 14);
        box.setBackground(round(panel, 18, 0xFF383047));
        box.addView(v);
        content.addView(box, full());
    }
    private void addGap() {
        Space s = new Space(this);
        content.addView(s, new LinearLayout.LayoutParams(1, 12));
    }
    private TextView text(String s, int size, int color, boolean bold) {
        TextView t = new TextView(this);
        t.setText(s); t.setTextSize(size); t.setTextColor(color);
        if (bold) t.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        return t;
    }
    private Button button(String label) {
        Button b = new Button(this);
        b.setText(label); b.setTextColor(Color.WHITE);
        b.setAllCaps(false);
        b.setBackground(round(purple, 14, purple));
        return b;
    }
    private GradientDrawable round(int color, int radius, int stroke) {
        GradientDrawable d = new GradientDrawable();
        d.setColor(color); d.setCornerRadius(radius);
        d.setStroke(1, stroke); return d;
    }
    private LinearLayout.LayoutParams full() {
        return new LinearLayout.LayoutParams(-1, -2);
    }
    private void message(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
