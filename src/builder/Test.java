package builder;
//������ģʽ��Builder��
//���ٹ��캯���Ĵ�����������д�������ͬ�����Ĵ��룩
public class Test {

	public static void main(String[] args) {
		 Student a = new Student.StudentBuilder().setAge(13).setName("LiHua").build();
	     Student b = new Student.StudentBuilder().setSchool("sc").setSex("Male").setName("ZhangSan").build();

	}

}
