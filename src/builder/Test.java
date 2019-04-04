package builder;
//建造者模式（Builder）
//减少构造函数的代码量（不用写多个传不同参数的代码）
public class Test {

	public static void main(String[] args) {
		 Student a = new Student.StudentBuilder().setAge(13).setName("LiHua").build();
	     Student b = new Student.StudentBuilder().setSchool("sc").setSex("Male").setName("ZhangSan").build();

	}

}
