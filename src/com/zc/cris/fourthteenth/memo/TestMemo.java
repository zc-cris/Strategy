package com.zc.cris.fourthteenth.memo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMemo {

	@Test
	void test() {

		GameRole role = new GameRole();
		role.init();

		// 游戏角色备份
		Memo memo = role.memo();
		MemoManager.addMemo(memo);

		role.showState();
		// 游戏角色阵亡
		role.end();
		role.showState();
		// 恢复指定存档重新玩
		role.recovery(MemoManager.returnMemo(0));
		role.showState();

	}

}
