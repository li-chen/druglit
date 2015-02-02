package info.chenli.druglit;

public class Drug {

	private String name;
	private int earlyCount, lateCount;
	private double lateEarlyRatio;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEarlyCount() {
		return earlyCount;
	}
	public void setEarlyCount(int earlyCount) {
		this.earlyCount = earlyCount;
	}
	public int getLateCount() {
		return lateCount;
	}
	public void setLateCount(int lateCount) {
		this.lateCount = lateCount;
	}
	public double getLateEarlyRatio() {
		return lateEarlyRatio;
	}
	public void setLateEarlyRatio(double lateEarlyRatio) {
		this.lateEarlyRatio = lateEarlyRatio;
	}
	
}
