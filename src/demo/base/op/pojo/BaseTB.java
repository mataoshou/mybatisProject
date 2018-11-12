package demo.base.op.pojo;

import java.util.List;

public class BaseTB {
	private int tbId;
	private String tbName;
	private int tbType;
	
	private BaseTBItem item;
	
	private List<BaseTBAttch> attch;
	
	public int getTbId() {
		return tbId;
	}
	public void setTbId(int tbId) {
		this.tbId = tbId;
	}
	public String getTbName() {
		return tbName;
	}
	public void setTbName(String tbName) {
		this.tbName = tbName;
	}
	public int getTbType() {
		return tbType;
	}
	public void setTbType(int tbType) {
		this.tbType = tbType;
	}
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


	
	
}
