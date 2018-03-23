package com.zc.cris.fourthteenth.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * 专门管理备忘录类的管理类
 * @author chongqingwuyifan
 *
 */
public class MemoManager {

	private static List<Memo> memos = new ArrayList<>();
	
	// 增加备忘录，记录并管理状态信息
	public static void addMemo(Memo memo) {
		memos.add(memo);
	}
	
	// 根据需要返回对应的备忘录状态信息
	public static Memo returnMemo(Integer index) {
		return memos.get(index);
	}
	
}
