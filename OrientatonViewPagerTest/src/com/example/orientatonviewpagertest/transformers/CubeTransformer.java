package com.example.orientatonviewpagertest.transformers;

import android.support.v4.view.ViewPager;
import android.view.View;

public class CubeTransformer implements ViewPager.PageTransformer {

	/**
	 * position����ָ������ҳ���������Ļ���ĵ�λ�á�����һ����̬���ԣ�������ҳ��Ĺ������ı䡣��һ��ҳ�����������Ļ�ǣ�����ֵ��0��
	 * ��һ��ҳ��ո��뿪��Ļ���ұ�ʱ
	 * ������ֵ��1��������Ҳҳ��ֱ������һ��ʱ������һ��ҳ���λ����-0.5����һ��ҳ���λ����0.5��������Ļ��ҳ���λ��
	 * ��ͨ��ʹ������setAlpha()��setTranslationX()����setScaleY()����������ҳ������ԣ��������Զ���Ļ���������
	 */
	@Override
	public void transformPage(View view, float position) {
		if (position <= 0) {
			// �������󻬶�Ϊ��ǰView

			// ������ת���ĵ㣻
			view.setPivotX(view.getMeasuredWidth());
			view.setPivotY(view.getMeasuredHeight() * 0.5f);

			// ֻ��Y������ת����
			view.setRotationY(90f * position);
		} else if (position <= 1) {
			// �������һ���Ϊ��ǰView
			view.setPivotX(0);
			view.setPivotY(view.getMeasuredHeight() * 0.5f);
			view.setRotationY(90f * position);
		}
	}
}
