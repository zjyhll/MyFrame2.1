package com.keyhua.renameyourself.app;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

import com.keyhua.renameyourself.util.SPUtils;

/**
 * @author 曾金叶
 * @2015-8-5 @下午2:40:52
 * @category 将大部分数据保存在这里，也可以使用工具类SPUtils来存储一些长久数据
 */
public class App extends Application {
	// 调用时使用的实例
	private static App mInstance;
	// 屏幕长宽
	private int screenWidth, screenHeight;
	// ---------------- ----------------
	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public static App getInstance() {
		return mInstance;
	}

	@SuppressWarnings("deprecation")
	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@Override
	public void onCreate() {
		super.onCreate();
		mInstance = this;
		WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
		this.setScreenWidth(wm.getDefaultDisplay().getWidth());// 屏幕宽度
		this.setScreenHeight(wm.getDefaultDisplay().getHeight());// 屏幕高度
	}

}
