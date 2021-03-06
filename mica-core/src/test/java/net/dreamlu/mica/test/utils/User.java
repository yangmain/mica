package net.dreamlu.mica.test.utils;

import lombok.Data;
import lombok.ToString;
import net.dreamlu.mica.core.beans.CopyProperty;

@Data
public class User {
	private Integer id;
	private int id1;
	private int[] ids;
	private int[] idss;
	private int[] idx;
	private String name;
	private String photo;
	private String xx;
	@CopyProperty("six")
	private String gender;
	private int xInt;
	private int xxInt;
	private long xLong;
}
