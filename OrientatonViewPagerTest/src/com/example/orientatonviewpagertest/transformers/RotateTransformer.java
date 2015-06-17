package com.example.orientatonviewpagertest.transformers;

import android.support.v4.view.ViewPager;
import android.view.View;

public class RotateTransformer implements ViewPager.PageTransformer {

	/**
	 * page��Ȼֵ�þ��ǻ����е��Ǹ�view��position������float������ƽʱ����intλ����Ϣ�����ǵ�ǰ����״̬��һ����ʾ��
	 * ���統��������ȫ��ʱ
	 * ��position��0�������󻬶���ʹ���ұ߸պ���һ����������Ļʱ��position��1�����ǰһҹ����һҳ����������Ļռһ��ʱ
	 * ��ǰһҳ��position��-0.5����һҳ��posiotn��0.5�����Ը���position��ֵ���ǾͿ�������������Ҫ��alpha��x/y��Ϣ��
	 */
	@Override
	public void transformPage(View view, float position) {
		if (position < -1) {
		} else if (position <= 0) {
			view.setScaleX(1 + position);
			view.setScaleY(1 + position);
			view.setRotation(360 * position);
		} else if (position <= 1) {
			view.setScaleX(1 - position);
			view.setScaleY(1 - position);
			view.setRotation(360 * position);
		} else {
		}
	}

}
