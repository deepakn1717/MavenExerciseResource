package IMCS.ExceptionMaven;

import java.io.Serializable;
import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private int studentNo;
	private String name;
	private int age;
	private int height;
	private transient Gender gender;

	public static Comparator<Student> nameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			String person1 = s1.name.toUpperCase();
			String person2 = s2.name.toUpperCase();

			// ascending order
			return person1.compareTo(person2);

		}
	};

	public static Comparator<Student> ageHeightComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			int value1 = s1.age - s2.age;
			if (value1 != 0) {
				return value1;
			}
			return (int) (s1.height - s2.height);
		}
	};

}
