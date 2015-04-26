package utility;

import rs.ac.uns.ftn.xws.cbs.mt900.Mt900;
import rs.ac.uns.ftn.xws.cbs.mt910.Mt910;

public class MtCoupler {
	private Mt900 mt900;
	private Mt910 mt910;

	public MtCoupler(Mt900 mt900, Mt910 mt910) {
		super();
		this.mt900 = mt900;
		this.mt910 = mt910;
	}

	public Mt900 getMt900() {
		return mt900;
	}

	public Mt910 getMt910() {
		return mt910;
	}
}
