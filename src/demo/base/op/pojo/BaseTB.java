package demo.base.op.pojo;

import java.util.List;

public class BaseTB {
	private int id;
	private String bName;
	private int btype;
	
	private BaseTBItem item;
	
	public BaseTBItem getItem() {
		return item;
	}
	public void setItem(BaseTBItem item) {
		this.item = item;
	}
	public List<BaseTBAttch> getAttch() {
		return attch;
	}
	public void setAttch(List<BaseTBAttch> attch) {
		this.attch = attch;
	}
	private List<BaseTBAttch> attch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getBtype() {
		return btype;
	}
	public void setBtype(int btype) {
		this.btype = btype;
	}
	
	
}
