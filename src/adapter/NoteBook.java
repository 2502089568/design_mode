package adapter;
//������������ͷ
//�����������һ���̳���Ŀ��Ľӿڵ�����Ŀ��ӿڵķ�����ʹ�ô�����ķ���
//���൱�ڴ�����ķ����������һ��Ŀ�귽����Ƥ��
public class NoteBook {

	private static ThreePlugIf plug;
	
	public NoteBook(ThreePlugIf plug) {
		this.plug=plug;
	}
	
	
	//�������
	public void charge() {
		plug.powerWithThree();
	}
	public static void main(String[] args) {
		GBTwoPlug two = new GBTwoPlug();
		ThreePlugIf three = new TwoPlugAdapter(two);
		NoteBook nb =new NoteBook(three);
		nb.charge();
		
		three = new TwoPlugAdapterExtends();
		nb=new NoteBook(three);
		nb.charge();
		}

}
