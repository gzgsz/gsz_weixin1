/**
 * 
 */
package org.gsz.course.message.req;

/**
 *����λ����Ϣ
 *
 * @author gongsizhen
 * @author 2014��3��20��
 *
 */
public class LocationMessage extends BaseMessage {
	//����λ��γ��
	private String Location_X;
	//����λ�þ���
	private String Location_Y;
	//��ͼ���Ŵ�С
	private String Scale;
	//����λ����Ϣ
	private String Label;
	/**
	 * @return the location_X
	 */
	public String getLocation_X() {
		return Location_X;
	}
	/**
	 * @param location_X the location_X to set
	 */
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}
	/**
	 * @return the location_Y
	 */
	public String getLocation_Y() {
		return Location_Y;
	}
	/**
	 * @param location_Y the location_Y to set
	 */
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}
	/**
	 * @return the scale
	 */
	public String getScale() {
		return Scale;
	}
	/**
	 * @param scale the scale to set
	 */
	public void setScale(String scale) {
		Scale = scale;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return Label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		Label = label;
	}
	
	
}
