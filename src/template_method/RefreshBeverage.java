package template_method;
/*ģ��ģʽ
 * ������࣬Ϊ���������ṩһ���㷨���
 * */
					//ˢ��       ����
public abstract class RefreshBeverage {

	/*�������ϵ�ģ�巽��
	 * ��װ���������๲ͬ��ѭ���㷨���
	 * */             //׼��   ����         ģ��
	public final void prepareBeverageTemplate() {
		//1.��ˮ���
		boilWater();
		//2.��������
		brew();
		//3.�����Ϸ��뱭��
		pourInCup();
		if(isCustomerWantsCondiments()) {
			//4.�������
			addCondiments();
		}	
	}

	//ѯ���û��Ƿ�ӵ���
	//hook���Ӻ����ṩĬ�ϻ��ʵ��
	//������������о����Ƿ�ҹ�����ιҹ�
	protected boolean isCustomerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}

	//����ͬ��ʵ���ó��󷽷�
	protected abstract void addCondiments();

	private void pourInCup() {
		//��ͬ�ķ�����˽��
		System.out.println("�����ϵ��뱭��");
	}

	//����ͬ��ʵ���ó��󷽷�
	protected abstract void brew();

	private void boilWater() {
		//��ͬ�ķ�����˽��
		System.out.println("��ˮ���");
		
	}
}
