package exam.test07;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	String marker;
	int cc;

	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(String marker) {
		this.marker = marker;
	}

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [marker=" + marker + ", cc=" + cc + "]";
	}

}
